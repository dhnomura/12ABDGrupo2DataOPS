package org.talend.designer.codegen.translators.processing;

import org.talend.core.model.process.INode;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.process.IConnection;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;
import java.util.List;
import java.util.Map;

public class TAggregateSortedRowMainJava
{
  protected static String nl;
  public static synchronized TAggregateSortedRowMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TAggregateSortedRowMainJava result = new TAggregateSortedRowMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "currentRowIndex_";
  protected final String TEXT_3 = "++;";
  protected final String TEXT_4 = NL + "boolean sameGroup_";
  protected final String TEXT_5 = " = true;";
  protected final String TEXT_6 = "if(flag_";
  protected final String TEXT_7 = "){" + NL + "\tflag_";
  protected final String TEXT_8 = " = false;";
  protected final String TEXT_9 = NL + "\t\t\tgroup_";
  protected final String TEXT_10 = "_";
  protected final String TEXT_11 = " = ";
  protected final String TEXT_12 = ".";
  protected final String TEXT_13 = ".clone();";
  protected final String TEXT_14 = ";";
  protected final String TEXT_15 = NL;
  protected final String TEXT_16 = "\tif(";
  protected final String TEXT_17 = " != null){";
  protected final String TEXT_18 = "count_";
  protected final String TEXT_19 = " = 1;";
  protected final String TEXT_20 = "\t}else{" + NL + "count_";
  protected final String TEXT_21 = " = 0;" + NL + "}";
  protected final String TEXT_22 = NL + "\t\t";
  protected final String TEXT_23 = " = (double)";
  protected final String TEXT_24 = "\t}else{" + NL + "\t\t";
  protected final String TEXT_25 = " = (double)0;" + NL + "\t}";
  protected final String TEXT_26 = " = new BigDecimal(\"0.0\");" + NL + "\t}";
  protected final String TEXT_27 = NL + "if(";
  protected final String TEXT_28 = " != null){" + NL + "\tsum_";
  protected final String TEXT_29 = ";" + NL + "\tcount_";
  protected final String TEXT_30 = " = 1;" + NL + "}else{" + NL + "\tsum_";
  protected final String TEXT_31 = " = (double)0;" + NL + "\tcount_";
  protected final String TEXT_32 = ";" + NL + "}else{" + NL + "\tsum_";
  protected final String TEXT_33 = " = (double)0;" + NL + "}" + NL + "count_";
  protected final String TEXT_34 = NL + "sum_";
  protected final String TEXT_35 = ";" + NL + "count_";
  protected final String TEXT_36 = "\t" + NL + "if(";
  protected final String TEXT_37 = " = new BigDecimal(\"0.0\");" + NL + "\tcount_";
  protected final String TEXT_38 = " = new BigDecimal(\"0.0\");" + NL + "}" + NL + "count_";
  protected final String TEXT_39 = "set_";
  protected final String TEXT_40 = " = new java.util.HashSet();";
  protected final String TEXT_41 = NL + "set_";
  protected final String TEXT_42 = ".add(";
  protected final String TEXT_43 = ");";
  protected final String TEXT_44 = "\t}";
  protected final String TEXT_45 = "list_object_";
  protected final String TEXT_46 = " = new java.util.ArrayList();";
  protected final String TEXT_47 = NL + "\t\tlist_object_";
  protected final String TEXT_48 = "list_";
  protected final String TEXT_49 = " = new StringBuilder();";
  protected final String TEXT_50 = NL + "\t\tlist_";
  protected final String TEXT_51 = ".append(";
  protected final String TEXT_52 = NL + "}else{";
  protected final String TEXT_53 = NL + "while(true){";
  protected final String TEXT_54 = NL + "if(group_";
  protected final String TEXT_55 = " != ";
  protected final String TEXT_56 = "){" + NL + "\tsameGroup_";
  protected final String TEXT_57 = " = false;" + NL + "\tbreak;" + NL + "}";
  protected final String TEXT_58 = "if(group_";
  protected final String TEXT_59 = " == null){" + NL + "\tif(";
  protected final String TEXT_60 = " != null){" + NL + "\t\tsameGroup_";
  protected final String TEXT_61 = " = false;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}else{" + NL + "\tif(group_";
  protected final String TEXT_62 = " == null || !group_";
  protected final String TEXT_63 = ".equals(";
  protected final String TEXT_64 = ")){" + NL + "\t\tsameGroup_";
  protected final String TEXT_65 = " = false;" + NL + "\t\tbreak;" + NL + "\t}" + NL + "}";
  protected final String TEXT_66 = "break;";
  protected final String TEXT_67 = "}" + NL + "if(sameGroup_";
  protected final String TEXT_68 = "){" + NL;
  protected final String TEXT_69 = " == null){" + NL + "\t";
  protected final String TEXT_70 = ";" + NL + "}";
  protected final String TEXT_71 = NL + "\t";
  protected final String TEXT_72 = NL + "}";
  protected final String TEXT_73 = NL + "\tif(";
  protected final String TEXT_74 = " !=null){" + NL + "\t\tif(";
  protected final String TEXT_75 = " == null || ";
  protected final String TEXT_76 = ".compareTo(";
  protected final String TEXT_77 = ") > 0){" + NL + "\t\t\t";
  protected final String TEXT_78 = ";" + NL + "\t\t}" + NL + "\t}";
  protected final String TEXT_79 = " !=null){" + NL + "\tif(";
  protected final String TEXT_80 = ") > 0){" + NL + "\t\t";
  protected final String TEXT_81 = ";" + NL + "\t}" + NL + "}";
  protected final String TEXT_82 = NL + "if(!";
  protected final String TEXT_83 = " && ";
  protected final String TEXT_84 = "){" + NL + "\t";
  protected final String TEXT_85 = " = false;" + NL + "}";
  protected final String TEXT_86 = " > ";
  protected final String TEXT_87 = "if(";
  protected final String TEXT_88 = ") < 0){" + NL + "\t\t";
  protected final String TEXT_89 = " && !";
  protected final String TEXT_90 = " = true;" + NL + "}";
  protected final String TEXT_91 = " < ";
  protected final String TEXT_92 = " ++;";
  protected final String TEXT_93 = "sum_";
  protected final String TEXT_94 = " += ";
  protected final String TEXT_95 = " != null){" + NL + "\tif(sum_";
  protected final String TEXT_96 = " == null){" + NL + "\t\tsum_";
  protected final String TEXT_97 = ";" + NL + "\t}else{" + NL + "\t\tsum_";
  protected final String TEXT_98 = " = sum_";
  protected final String TEXT_99 = ");" + NL + "\t}" + NL + "}";
  protected final String TEXT_100 = NL + "count_";
  protected final String TEXT_101 = ");" + NL + "\t}";
  protected final String TEXT_102 = ".append(\",\");";
  protected final String TEXT_103 = "}//if_same_group" + NL;
  protected final String TEXT_104 = NL + "}" + NL + "" + NL + "" + NL + "int tempCount_";
  protected final String TEXT_105 = " = -1;";
  protected final String TEXT_106 = NL + "if( !sameGroup_";
  protected final String TEXT_107 = " ){" + NL + "\ttempCount_";
  protected final String TEXT_108 = "emmitArray_";
  protected final String TEXT_109 = "[tempCount_";
  protected final String TEXT_110 = "].";
  protected final String TEXT_111 = " = group_";
  protected final String TEXT_112 = "String temp_";
  protected final String TEXT_113 = " = \"\";";
  protected final String TEXT_114 = "temp_";
  protected final String TEXT_115 = " = new String(group_";
  protected final String TEXT_116 = " = \"\"+group_";
  protected final String TEXT_117 = "if(temp_";
  protected final String TEXT_118 = ".length() > 0) {";
  protected final String TEXT_119 = " = temp_";
  protected final String TEXT_120 = " = ParserUtils.parseTo_Date(temp_";
  protected final String TEXT_121 = ", ";
  protected final String TEXT_122 = " = ParserUtils.parseTo_";
  protected final String TEXT_123 = "(temp_";
  protected final String TEXT_124 = "} else {\t\t\t\t\t\t";
  protected final String TEXT_125 = "throw new RuntimeException(\"Value is empty for column : '";
  protected final String TEXT_126 = "' in '";
  protected final String TEXT_127 = "' connection, value is invalid or this column should be nullable or have a default value.\");";
  protected final String TEXT_128 = "}";
  protected final String TEXT_129 = " = (";
  protected final String TEXT_130 = ")";
  protected final String TEXT_131 = " = new String(";
  protected final String TEXT_132 = " = \"\"+";
  protected final String TEXT_133 = ".getBytes();";
  protected final String TEXT_134 = "', value is invalid or this column should be nullable or have a default value.\");";
  protected final String TEXT_135 = " = (\"\"+";
  protected final String TEXT_136 = ").getBytes();";
  protected final String TEXT_137 = " = ((";
  protected final String TEXT_138 = "))0;" + NL + "if(sum_";
  protected final String TEXT_139 = " != null){" + NL + "\temmitArray_";
  protected final String TEXT_140 = "))sum_";
  protected final String TEXT_141 = ".doubleValue();" + NL + "}";
  protected final String TEXT_142 = " = BigDecimal.valueOf(sum_";
  protected final String TEXT_143 = " = String.valueOf(sum_";
  protected final String TEXT_144 = "double avg_";
  protected final String TEXT_145 = " = 0d;" + NL + "if(count_";
  protected final String TEXT_146 = " > 0){" + NL + "\tavg_";
  protected final String TEXT_147 = "/count_";
  protected final String TEXT_148 = ";" + NL + "}" + NL + "emmitArray_";
  protected final String TEXT_149 = ")avg_";
  protected final String TEXT_150 = " > 0 && sum_";
  protected final String TEXT_151 = " != null){" + NL + "\tavg_";
  protected final String TEXT_152 = ".divide(BigDecimal.valueOf(count_";
  protected final String TEXT_153 = "), ";
  protected final String TEXT_154 = ", BigDecimal.ROUND_HALF_UP).doubleValue();" + NL + "}" + NL + "emmitArray_";
  protected final String TEXT_155 = "BigDecimal avg_";
  protected final String TEXT_156 = " = new BigDecimal(\"0.0\");" + NL + "if(count_";
  protected final String TEXT_157 = ").divide(BigDecimal.valueOf(count_";
  protected final String TEXT_158 = ", BigDecimal.ROUND_HALF_UP);" + NL + "}" + NL + "emmitArray_";
  protected final String TEXT_159 = " = avg_";
  protected final String TEXT_160 = " = String.valueOf(avg_";
  protected final String TEXT_161 = NL + "if(true){" + NL + "\tthrow new java.lang.Exception(\"In column ";
  protected final String TEXT_162 = ", the data type \\\"";
  protected final String TEXT_163 = "\\\" is not applicable for \\\"avg\\\" result.\");" + NL + "}";
  protected final String TEXT_164 = ")set_";
  protected final String TEXT_165 = ".size();";
  protected final String TEXT_166 = " = BigDecimal.valueOf(set_";
  protected final String TEXT_167 = ".size());";
  protected final String TEXT_168 = " = \"\"+set_";
  protected final String TEXT_169 = " = (\"\"+set_";
  protected final String TEXT_170 = ".size()).getBytes();";
  protected final String TEXT_171 = ".toString();";
  protected final String TEXT_172 = "if(true){" + NL + "\tthrow new java.lang.Exception(\"In column ";
  protected final String TEXT_173 = ", data type \\\"List\\\" is not applicable for aggregate function \\\"list\\\" result. Please try aggregate function \\\"list(object)\\\"!\");" + NL + "}";
  protected final String TEXT_174 = "\\\" is not applicable for \\\"list\\\" result.\");" + NL + "}";
  protected final String TEXT_175 = NL + "if( currentRowIndex_";
  protected final String TEXT_176 = "  == ";
  protected final String TEXT_177 = NL + "}" + NL + "for(int i_";
  protected final String TEXT_178 = "=0; i_";
  protected final String TEXT_179 = " <= tempCount_";
  protected final String TEXT_180 = "; i_";
  protected final String TEXT_181 = "++){";
  protected final String TEXT_182 = " = emmitArray_";
  protected final String TEXT_183 = "[i_";
  protected final String TEXT_184 = "nb_line_";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();
List<IMetadataTable> metadatas = node.getMetadataList();
if ((metadatas!=null)&&(metadatas.size()>0)) {
    IMetadataTable metadata = metadatas.get(0);
    List< ? extends IConnection> conns = node.getIncomingConnections();
    IMetadataTable inMetadata = null;
    String connName = "";
    if(conns != null){
    for (IConnection conn : conns) { 
		if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) { 
			inMetadata = conn.getMetadataTable();
			connName = conn.getName();
    		break;
		}
	}
    if (metadata != null && inMetadata != null) { 
		List<IMetadataColumn> columns = metadata.getListColumns();
    	List<IMetadataColumn> inColumns = inMetadata.getListColumns();
		List<Map<String, String>> operations = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__OPERATIONS__");
		IMetadataColumn[][] column_op = new IMetadataColumn[operations.size()][2];
		String[] functions = new String[operations.size()];
		boolean[] needTestForNull = new boolean[operations.size()];
		List<Map<String, String>> groupbys = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__GROUPBYS__");
		String rowCount = ElementParameterParser.getValue(node,"__ROW_COUNT__");
		IMetadataColumn[][] column_gr = new IMetadataColumn[groupbys.size()][2];
	    for(int i = 0; i < column_gr.length; i++){
			Map<String, String> groupby = groupbys.get(i);
			String in = groupby.get("INPUT_COLUMN");
			String out = groupby.get("OUTPUT_COLUMN");
			for (IMetadataColumn column: inColumns) {
				if(column.getLabel().equals(in)){
					column_gr[i][0] = column;
					break;
				}
			}
    		for (IMetadataColumn column: columns) {
				if(column.getLabel().equals(out)){
					column_gr[i][1] = column;
					break;
				}
			}
		}
		for(int i = 0; i < column_op.length; i++){
			Map<String, String> operation = operations.get(i);
			String in = operation.get("INPUT_COLUMN");
			String out = operation.get("OUTPUT_COLUMN");
			functions[i] = operation.get("FUNCTION");
			for (IMetadataColumn column: inColumns) {
				if(column.getLabel().equals(in)){
					column_op[i][0] = column;
					JavaType inputJavaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					needTestForNull[i] = !(JavaTypesManager.isJavaPrimitiveType(inputJavaType, column.isNullable())) && (operation.get("IGNORE_NULL").equals("true"));
					break;
				}
			}
    		for (IMetadataColumn column: columns) {
				if(column.getLabel().equals(out)){
					column_op[i][1] = column;
					break;
				}
			}
		}

    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_3);
    
if(column_gr.length > 0){

    stringBuffer.append(TEXT_4);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_5);
    
}

    stringBuffer.append(TEXT_6);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_8);
    
	for(int i = 0; i < column_gr.length; i++){
		if("id_Dynamic".equals(column_gr[i][0].getTalendType())) {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_13);
    
		} else {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    	
		}
	}
		
	for(int i = 0; i < column_op.length; i++){//__HSS_tAR_001
		boolean duplicate = false;
		for(int j = 0; j < i; j++){
			if(functions[j].equals(functions[i]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
				duplicate = true;
				break;
			}
		}
		if(duplicate){
			continue;
		}
		
		JavaType javaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
		if(("min").equals(functions[i]) || ("max").equals(functions[i]) || ("first").equals(functions[i]) || ("last").equals(functions[i])){ 

    stringBuffer.append(TEXT_15);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    
		}else if(("count").equals(functions[i])){
			boolean countHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					countHasAvg = true;
					break;
				}
			}
			if(!countHasAvg){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
				}

    stringBuffer.append(TEXT_18);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    			
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_20);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}
			}
		}else if(("sum").equals(functions[i])){
			boolean sumHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					sumHasAvg = true;
					break;
				}
			}
			if(!sumHasAvg){
				if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE ){
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
					}

    stringBuffer.append(TEXT_22);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    					
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_24);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    
					}
				}else if(javaType == JavaTypesManager.BIGDECIMAL){
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
					}

    stringBuffer.append(TEXT_22);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    				
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_24);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_26);
    
					}
				}else{
//generate nothing.
				}
			}
		}else if(("avg").equals(functions[i])){
			if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE ){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}else{
					if(column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
					}else{

    stringBuffer.append(TEXT_34);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
					}
				}
			}else if(javaType == JavaTypesManager.BIGDECIMAL){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_36);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}else{

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_38);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
				}
			}else{
//generate nothing.
			}
		}else if(("distinct").equals(functions[i])){

    stringBuffer.append(TEXT_39);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_40);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_41);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else if(("list_object").equals(functions[i])){

    stringBuffer.append(TEXT_45);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_46);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_47);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else  if(("list").equals(functions[i])){

    stringBuffer.append(TEXT_48);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_49);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_50);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}
	}//__HSS_tAR_001

    stringBuffer.append(TEXT_52);
    
if(column_gr.length > 0){//while loop

    stringBuffer.append(TEXT_53);
    	for(int i = 0; i < column_gr.length; i++){
		if(JavaTypesManager.isJavaPrimitiveType(column_gr[i][0].getTalendType(),column_gr[i][0].isNullable())){

    stringBuffer.append(TEXT_54);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_55);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_57);
    
		} else {

    stringBuffer.append(TEXT_58);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_59);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_60);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_61);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_62);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_63);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_65);
    		}
		
		if(i+1 == column_gr.length){

    stringBuffer.append(TEXT_66);
    		}
	}

    stringBuffer.append(TEXT_67);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_68);
    
}//while loop end
	
    
	for(int i = 0; i < column_op.length; i++){//__HSS_tAR_002
		boolean duplicate = false;
		for(int j = 0; j < i; j++){
			if(functions[j].equals(functions[i]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
				duplicate = true;
				break;
			}
		}
		if(duplicate){
			continue;
		}
		JavaType javaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
		if(("first").equals(functions[i])){
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_69);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_70);
    
			}
		}else if(("last").equals(functions[i])){
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_71);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_72);
    
			}
		}else if(("min").equals(functions[i])){
			if(javaType == JavaTypesManager.LIST || javaType == JavaTypesManager.OBJECT || javaType == JavaTypesManager.BYTE_ARRAY){
			//do nothing
			}else if(javaType == JavaTypesManager.BIGDECIMAL || javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.DATE){

    stringBuffer.append(TEXT_73);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_74);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_77);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_78);
    			}else if(javaType == JavaTypesManager.BOOLEAN){
				if(needTestForNull[i] || column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_81);
    
				}else{

    stringBuffer.append(TEXT_82);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_83);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_85);
    
				}
			}else{
				if(needTestForNull[i] || column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_80);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_81);
    
				}else{

    stringBuffer.append(TEXT_27);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_86);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_70);
    
				}
			}
		}else if(("max").equals(functions[i])){
			if(javaType == JavaTypesManager.LIST || javaType == JavaTypesManager.OBJECT || javaType == JavaTypesManager.BYTE_ARRAY){
			//do nothing
			}else if(javaType == JavaTypesManager.BIGDECIMAL || javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.DATE){

    stringBuffer.append(TEXT_87);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_81);
    			}else if(javaType == JavaTypesManager.BOOLEAN){
				if(needTestForNull[i] || column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_81);
    
				}else{

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_89);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_90);
    
				}
			}else{
				if(needTestForNull[i] || column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_75);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_76);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_81);
    
				}else{

    stringBuffer.append(TEXT_27);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_91);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_84);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_70);
    
				}
			}
		}else if(("count").equals(functions[i])){
			boolean countHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					countHasAvg = true;
					break;
				}
			}
			if(!countHasAvg){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
				}

    stringBuffer.append(TEXT_18);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_92);
    			
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
				}
			}
		}else if(("sum").equals(functions[i])){
			boolean sumHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					sumHasAvg = true;
					break;
				}
			}
			if(!sumHasAvg){
				if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE){
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
					}

    stringBuffer.append(TEXT_93);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
					}
				}else if(javaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_87);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_99);
    
				}
			}
		}else if(("avg").equals(functions[i])){
			if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
				}
				if(!needTestForNull[i] && column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
				}

    stringBuffer.append(TEXT_93);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_94);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    				if(!needTestForNull[i] && column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_44);
    
				}

    stringBuffer.append(TEXT_100);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
				}
			}else if(javaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_87);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_96);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_97);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_101);
    
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_18);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
				}

    stringBuffer.append(TEXT_72);
    
				if(!needTestForNull[i]){

    stringBuffer.append(TEXT_18);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
				}
			}
		}else if(("list").equals(functions[i])){
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_102);
    stringBuffer.append(TEXT_15);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else if(("list_object").equals(functions[i])){
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else if(("distinct").equals(functions[i])){
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_41);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}
	}//__HSS_tAR_002

if(column_gr.length > 0){

    stringBuffer.append(TEXT_103);
    
}

    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_105);
    



if(column_gr.length > 0){
	//??

    stringBuffer.append(TEXT_106);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
	//do out start ...
	conns = null;
	conns = node.getOutgoingSortedConnections();
	if (conns!=null) {
		if (conns.size()>0) {
			IConnection conn = conns.get(0);
			if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) { 
				List<IMetadataColumn> listColumns = metadata.getListColumns();
				int sizeListColumns = listColumns.size();
				boolean flag = true;
				next_column:
				for (int valueN=0; valueN < sizeListColumns; valueN++) {
					IMetadataColumn column = listColumns.get(valueN);
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable());
					JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					String patternValue = column.getPattern() == null || column.getPattern().trim().length() == 0 ? null : column.getPattern();
					for(int i = 0; i < column_gr.length; i++){
						if(column.getLabel().equals(column_gr[i][1].getLabel())){
							JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_gr[i][0].getTalendType());
							if(inJavaType == javaType){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    							}else{//for different data type
								if(flag){
									flag = false;

    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    								}
								if(inJavaType == JavaTypesManager.BYTE_ARRAY){

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_115);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    								}else{

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_116);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}

    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    								if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								} else if(javaType == JavaTypesManager.DATE) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_43);
    								} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    								}

    stringBuffer.append(TEXT_124);
    								String defaultValue = JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault());
								if(defaultValue == null) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_127);
    								} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_14);
    								}

    stringBuffer.append(TEXT_128);
    							}							
							continue next_column;
						}
					}					
					for(int i = 0; i < column_op.length; i++){
						if(column.getLabel().equals(column_op[i][1].getLabel())){
							if(("min").equals(functions[i]) || ("max").equals(functions[i]) || ("first").equals(functions[i]) || ("last").equals(functions[i])){
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(inJavaType == javaType){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else{//for different data type
									if((javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
										|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
										|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
										|| javaType == JavaTypesManager.DOUBLE)&&(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE)){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    									}else{
										if(flag){
											flag = false;

    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    										}
										if(inJavaType == JavaTypesManager.BYTE_ARRAY){

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_131);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    										}else{

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_132);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    										}

    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    										if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    										} else if(javaType == JavaTypesManager.DATE) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_43);
    										} else if(javaType == JavaTypesManager.BYTE_ARRAY) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_133);
    										} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    										}

    stringBuffer.append(TEXT_124);
    										String defaultValue = JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault());
										if(defaultValue == null) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_134);
    										} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_14);
    										}

    stringBuffer.append(TEXT_128);
    									}
								}
							}else if(("count").equals(functions[i])){
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.BYTE_ARRAY) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_136);
    								}
							}else if(("sum").equals(functions[i])){
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE ){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_141);
    
									}
								}else if(javaType == JavaTypesManager.BIGDECIMAL) {
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}
								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}
								}else{
//generate nothing
								}
							}else if(("avg").equals(functions[i])){
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_147);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){
										int pre = 10;
                       		 			Integer precision = column.getPrecision();
                           		 		if(precision!=null && precision!=0) { 
                           		 			pre = precision;
                           		 		}

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}

    							}else if(javaType == JavaTypesManager.BIGDECIMAL) {
									int pre = 10;
                       		 		Integer precision = column.getPrecision();
                           		 	if(precision!=null && precision!=0) { 
                           		 		pre = precision;
                           		 	}
                           		 	if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_155);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_156);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_142);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_157);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
                           		 	}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_155);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_156);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
                           		 	}
								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_147);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){
										int pre = 10;
                       		 			Integer precision = column.getPrecision();
                           		 		if(precision!=null && precision!=0) { 
                           		 			pre = precision;
                           		 		}

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}
								}else{

    stringBuffer.append(TEXT_161);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append(JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable()) );
    stringBuffer.append(TEXT_163);
    								}
							}else if(("distinct").equals(functions[i])){
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    								}else if(javaType == JavaTypesManager.BIGDECIMAL) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_167);
    								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    								}else if(javaType == JavaTypesManager.BYTE_ARRAY) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_170);
    								}
							}else if(("list_object").equals(functions[i])){
								if(javaType == JavaTypesManager.STRING){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_171);
    
								}else if(javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.LIST) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}
							}else if(("list").equals(functions[i])){
								if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_171);
    								} else if(javaType == JavaTypesManager.LIST){

    stringBuffer.append(TEXT_172);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_173);
    
								}else{

    stringBuffer.append(TEXT_172);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append(JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable()) );
    stringBuffer.append(TEXT_174);
    								}
							}
							continue next_column;
						}
					}
				}
			}
		}
	}
	//do out end ...
	
	//do first
	for(int i = 0; i < column_gr.length; i++){
		if("id_Dynamic".equals(column_gr[i][0].getTalendType())) {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_13);
    
		} else {

    stringBuffer.append(TEXT_9);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    	
		}
	}
	for(int i = 0; i < column_op.length && column_gr.length > 0; i++){
		boolean duplicate = false;
		for(int j = 0; j < i; j++){
			if(functions[j].equals(functions[i]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
				duplicate = true;
				break;
			}
		}
		if(duplicate){
			continue;
		}
		JavaType javaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
		if(("min").equals(functions[i]) || ("max").equals(functions[i]) || ("first").equals(functions[i]) || ("last").equals(functions[i])){ 

    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    		}else if(("count").equals(functions[i])){
			boolean countHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					countHasAvg = true;
					break;
				}
			}
			if(!countHasAvg){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
				}

    stringBuffer.append(TEXT_18);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    			
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_20);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}
			}
		}else if(("sum").equals(functions[i])){
			boolean sumHasAvg = false;
			for(int j = 0; j < functions.length; j++){
				if(("avg").equals(functions[j]) && column_op[j][0].getLabel().equals(column_op[i][0].getLabel()) && needTestForNull[i] == needTestForNull[j]){
					sumHasAvg = true;
					break;
				}
			}
			if(!sumHasAvg){
				if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE ){
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
					}

    stringBuffer.append(TEXT_22);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    					
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_24);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    
					}
				}else if(javaType == JavaTypesManager.BIGDECIMAL){
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
					}

    stringBuffer.append(TEXT_22);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_14);
    				
					if(needTestForNull[i]){

    stringBuffer.append(TEXT_24);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_26);
    
					}
				}else{
//generate nothing.
				}
			}
		}else if(("avg").equals(functions[i])){
			if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
					|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
					|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
					|| javaType == JavaTypesManager.DOUBLE ){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}else{
					if(column_op[i][0].isNullable()){

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
					}else{

    stringBuffer.append(TEXT_34);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
					}
				}
			}else if(javaType == JavaTypesManager.BIGDECIMAL){
				if(needTestForNull[i]){

    stringBuffer.append(TEXT_36);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_29);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_37);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    
				}else{

    stringBuffer.append(TEXT_27);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_32);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_38);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    
				}
			}else{
//generate nothing.
			}
		}else if(("distinct").equals(functions[i])){

    stringBuffer.append(TEXT_39);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_40);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_41);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else if(("list_object").equals(functions[i])){

    stringBuffer.append(TEXT_45);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_46);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_47);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}else  if(("list").equals(functions[i])){

    stringBuffer.append(TEXT_48);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_49);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_16);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_17);
    
			}

    stringBuffer.append(TEXT_50);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_43);
    
			if(needTestForNull[i]){

    stringBuffer.append(TEXT_44);
    
			}
		}
	}

    stringBuffer.append(TEXT_72);
    
	//??
}
/////////////////////////////////////////////////
	//??

    stringBuffer.append(TEXT_175);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_176);
    stringBuffer.append(rowCount );
    stringBuffer.append(TEXT_107);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
	//do out start ...
	conns = null;
	conns = node.getOutgoingSortedConnections();
	if (conns!=null) {
		if (conns.size()>0) {
			IConnection conn = conns.get(0);
			if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) { 
				List<IMetadataColumn> listColumns = metadata.getListColumns();
				int sizeListColumns = listColumns.size();
				boolean flag = true;
				next_column:
				for (int valueN=0; valueN < sizeListColumns; valueN++) {
					IMetadataColumn column = listColumns.get(valueN);
					String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable());
					JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
					String patternValue = column.getPattern() == null || column.getPattern().trim().length() == 0 ? null : column.getPattern();
					for(int i = 0; i < column_gr.length; i++){
						if(column.getLabel().equals(column_gr[i][1].getLabel())){
							JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_gr[i][0].getTalendType());
							if(inJavaType == javaType){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_111);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    							}else{//for different data type
								if(flag){
									flag = false;

    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    								}
								if(inJavaType == JavaTypesManager.BYTE_ARRAY){

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_115);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    								}else{

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_116);
    stringBuffer.append(column_gr[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}

    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    								if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								} else if(javaType == JavaTypesManager.DATE) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_43);
    								} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    								}

    stringBuffer.append(TEXT_124);
    								String defaultValue = JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault());
								if(defaultValue == null) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_127);
    								} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_14);
    								}

    stringBuffer.append(TEXT_128);
    							}							
							continue next_column;
						}
					}					
					for(int i = 0; i < column_op.length; i++){
						if(column.getLabel().equals(column_op[i][1].getLabel())){
							if(("min").equals(functions[i]) || ("max").equals(functions[i]) || ("first").equals(functions[i]) || ("last").equals(functions[i])){ 
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(inJavaType == javaType){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else{//for different data type
									if((javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
										|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
										|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
										|| javaType == JavaTypesManager.DOUBLE)&&(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE)){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    									}else{
										if(flag){
											flag = false;

    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_113);
    										}
										if(inJavaType == JavaTypesManager.BYTE_ARRAY){

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_131);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    										}else{

    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_132);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    										}

    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_118);
    										if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    										} else if(javaType == JavaTypesManager.DATE) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_121);
    stringBuffer.append( patternValue );
    stringBuffer.append(TEXT_43);
    										} else if(javaType == JavaTypesManager.BYTE_ARRAY) { 

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_133);
    										} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_122);
    stringBuffer.append( typeToGenerate );
    stringBuffer.append(TEXT_123);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    										}

    stringBuffer.append(TEXT_124);
    										String defaultValue = JavaTypesManager.getDefaultValueFromJavaType(typeToGenerate, column.getDefault());
										if(defaultValue == null) {

    stringBuffer.append(TEXT_125);
    stringBuffer.append( column.getLabel() );
    stringBuffer.append(TEXT_126);
    stringBuffer.append(conn.getName());
    stringBuffer.append(TEXT_127);
    										} else {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(defaultValue );
    stringBuffer.append(TEXT_14);
    										}

    stringBuffer.append(TEXT_128);
    									}
								}
							}else if(("count").equals(functions[i])){
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_132);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.BYTE_ARRAY) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_135);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_136);
    								}
							}else if(("sum").equals(functions[i])){
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE ){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_130);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_138);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_139);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_137);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_140);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_141);
    
									}
								}else if(javaType == JavaTypesManager.BIGDECIMAL) {
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_142);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}
								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_143);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}
								}else{
//generate nothing...
								}
							}else if(("avg").equals(functions[i])){
								JavaType inJavaType = JavaTypesManager.getJavaTypeFromId(column_op[i][0].getTalendType());
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_147);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){
										int pre = 10;
                       		 			Integer precision = column.getPrecision();
                           		 		if(precision!=null && precision!=0) { 
                           		 			pre = precision;
                           		 		}

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_149);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
									}

    							}else if(javaType == JavaTypesManager.BIGDECIMAL) {
									int pre = 10;
                       		 		Integer precision = column.getPrecision();
                           		 	if(precision!=null && precision!=0) { 
                           		 		pre = precision;
                           		 	}
                           		 	if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_155);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_156);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_142);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_157);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
                           		 	}else if(inJavaType == JavaTypesManager.BIGDECIMAL){

    stringBuffer.append(TEXT_155);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_156);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_158);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_159);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
                           		 	}
								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT){
									if(inJavaType == JavaTypesManager.BYTE || inJavaType == JavaTypesManager.CHARACTER 
										|| inJavaType == JavaTypesManager.SHORT || inJavaType == JavaTypesManager.INTEGER 
										|| inJavaType == JavaTypesManager.LONG || inJavaType == JavaTypesManager.FLOAT 
										|| inJavaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_146);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_147);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_148);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}else if(inJavaType == JavaTypesManager.BIGDECIMAL){
										int pre = 10;
                       		 			Integer precision = column.getPrecision();
                           		 		if(precision!=null && precision!=0) { 
                           		 			pre = precision;
                           		 		}

    stringBuffer.append(TEXT_144);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_145);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_150);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_151);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_98);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_152);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_153);
    stringBuffer.append(pre );
    stringBuffer.append(TEXT_154);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_160);
    stringBuffer.append(i );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
									}
								}else{

    stringBuffer.append(TEXT_172);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append(JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable()) );
    stringBuffer.append(TEXT_163);
    								}
							}else if(("distinct").equals(functions[i])){
								if(javaType == JavaTypesManager.BYTE || javaType == JavaTypesManager.CHARACTER 
									|| javaType == JavaTypesManager.SHORT || javaType == JavaTypesManager.INTEGER 
									|| javaType == JavaTypesManager.LONG || javaType == JavaTypesManager.FLOAT 
									|| javaType == JavaTypesManager.DOUBLE){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_129);
    stringBuffer.append(javaType.getPrimitiveClass() );
    stringBuffer.append(TEXT_164);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    								}else if(javaType == JavaTypesManager.BIGDECIMAL) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_166);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_167);
    								}else if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_168);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_165);
    								}else if(javaType == JavaTypesManager.BYTE_ARRAY) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_169);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_170);
    								}
							}else if(("list_object").equals(functions[i])){
								if(javaType == JavaTypesManager.STRING){

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_171);
    
								}else if(javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}else if(javaType == JavaTypesManager.LIST) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    								}
							}else{//"list"
								if(javaType == JavaTypesManager.STRING || javaType == JavaTypesManager.OBJECT) {

    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(functions[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column_op[i][0].getLabel() );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(needTestForNull[i] );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_171);
    								} else if(javaType == JavaTypesManager.LIST){

    stringBuffer.append(TEXT_172);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_173);
    
								}else{

    stringBuffer.append(TEXT_172);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_162);
    stringBuffer.append(JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable()) );
    stringBuffer.append(TEXT_174);
    								}
							}
							continue next_column;
						}
					}
				}
			}
		}
	}
	//do out end ...

	//??	

    stringBuffer.append(TEXT_177);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_178);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_179);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_180);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_181);
    
conns = null;
conns = node.getOutgoingSortedConnections();
String firstConnName = "";
if (conns!=null) {
	for (int i=0;i<conns.size();i++) {
		IConnection conn = conns.get(i);
		if ((conn.getName().compareTo(firstConnName)!=0)&&(conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA))) {
			for (IMetadataColumn column: metadata.getListColumns()) {

    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_182);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_183);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_110);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_14);
    
			}
		}
	}
}

    stringBuffer.append(TEXT_184);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_3);
    
	}
	}
}

    return stringBuffer.toString();
  }
}
