import airflow
from datetime import datetime
from datetime import timedelta
from airflow.operators.bash_operator import BashOperator
from airflow.models import DAG

airflow_home='~/airflow'
zip_file='TrabalhoFinal.zip'
job_vendas='TrabalhoFinal/IngestaoVendas/IngestaoVendas/IngestaoVendas_run.sh'
job_cienciadados='TrabalhoFinal/IngestaoVendas/IngestaoCienciaDados/IngestaoCienciaDados_run.sh'

default_args = {
    'owner': 'Charles, Cleber, Diogo, Queziane - Grupo 2',
    'start_date': airflow.utils.dates.days_ago(2)
}

unzip_job = airflow_home+"/scripts/download_job.sh  {{ params.airflow_home }} {{ params.zip_file }}"
talend_job_vendas = airflow_home+"/jobs/"+job_vendas
talend_job_ciencia = airflow_home+"/jobs/"+job_cienciadados

dag = DAG('analytics_vendas', default_args=default_args,schedule_interval=timedelta(days=1))

t1 = BashOperator(
    task_id='unzip_job_task',
    bash_command=unzip_job,
	params={'airflow_home':airflow_home,'zip_file':zip_file},
    dag=dag)
	
t2 = BashOperator(
    task_id='talend_job_vendas_execution',
    bash_command=talend_job_vendas,
    dag=dag)
	
t3 = BashOperator(
    task_id='talend_job_ciencia_execution',
    bash_command=talend_job_ciencia,
    dag=dag)

t1 >> [t2, t3]
