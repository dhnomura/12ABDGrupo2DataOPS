package org.talend.designer.codegen.translators.data_quality;

import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import java.util.Map;
import java.util.List;
import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;

public class TUniqRowBeginJava
{
  protected static String nl;
  public static synchronized TUniqRowBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TUniqRowBeginJava result = new TUniqRowBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL + "\t" + NL + "\t\tclass KeyStruct_";
  protected final String TEXT_3 = " {" + NL + "\t" + NL + "\t\t\tprivate static final int DEFAULT_HASHCODE = 1;" + NL + "\t\t    private static final int PRIME = 31;" + NL + "\t\t    private int hashCode = DEFAULT_HASHCODE;" + NL + "\t\t    public boolean hashCodeDirty = true;" + NL + "\t" + NL + "\t        ";
  protected final String TEXT_4 = NL + "\t\t\t\t\t";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = "        " + NL + "\t        " + NL + "\t\t    @Override" + NL + "\t\t\tpublic int hashCode() {" + NL + "\t\t\t\tif (this.hashCodeDirty) {" + NL + "\t\t\t\t\tfinal int prime = PRIME;" + NL + "\t\t\t\t\tint result = DEFAULT_HASHCODE;" + NL + "\t\t\t";
  protected final String TEXT_8 = NL + "\t\t\t\t        \t\t\tresult = prime * result + (this.";
  protected final String TEXT_9 = " ? 1231 : 1237);" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_10 = NL + "\t\t\t\t\t\t\t\t\tresult = prime * result + (int) this.";
  protected final String TEXT_11 = ";" + NL + "\t\t\t\t\t\t\t\t\t";
  protected final String TEXT_12 = NL + "\t\t\t\t\t\t\t\tresult = prime * result + java.util.Arrays.hashCode(this.";
  protected final String TEXT_13 = ");" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_14 = NL + "\t\t\t\t\t\t\t\tresult = prime * result + ((this.";
  protected final String TEXT_15 = " == null) ? 0 : this.";
  protected final String TEXT_16 = ".stripTrailingZeros().hashCode());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_17 = ".hashCode());" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_18 = NL + "\t\t    \t\tthis.hashCode = result;" + NL + "\t\t    \t\tthis.hashCodeDirty = false;\t\t" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn this.hashCode;" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\t@Override" + NL + "\t\t\tpublic boolean equals(Object obj) {" + NL + "\t\t\t\tif (this == obj) return true;" + NL + "\t\t\t\tif (obj == null) return false;" + NL + "\t\t\t\tif (getClass() != obj.getClass()) return false;" + NL + "\t\t\t\tfinal KeyStruct_";
  protected final String TEXT_19 = " other = (KeyStruct_";
  protected final String TEXT_20 = ") obj;" + NL + "\t\t\t\t";
  protected final String TEXT_21 = NL + "\t\t\t\t\t\t\t\t\tif (this.";
  protected final String TEXT_22 = " != other.";
  protected final String TEXT_23 = ") " + NL + "\t\t\t\t\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_24 = NL + "\t\t\t\t\t\t\t\t\tif(!java.util.Arrays.equals(this.";
  protected final String TEXT_25 = ", other.";
  protected final String TEXT_26 = ")) {" + NL + "\t\t\t\t\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_27 = " == null) {" + NL + "\t\t\t\t\t\t\t\t\t\tif (other.";
  protected final String TEXT_28 = " != null) " + NL + "\t\t\t\t\t\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_29 = NL + "\t\t\t\t\t\t\t\t\t} else if ((other.";
  protected final String TEXT_30 = " == null) || (this.";
  protected final String TEXT_31 = ".stripTrailingZeros().compareTo(other.";
  protected final String TEXT_32 = ".stripTrailingZeros())!=0))" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_33 = NL + "\t\t\t\t\t\t\t\t\t} else if (!this.";
  protected final String TEXT_34 = ".equals(other.";
  protected final String TEXT_35 = "))" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_36 = " " + NL + "\t\t\t\t\t\t\t\t\t\treturn false;" + NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_37 = NL + "\t\t\t\t" + NL + "\t\t\t\treturn true;" + NL + "\t\t\t}" + NL + "\t  " + NL + "\t        " + NL + "\t\t}" + NL + "" + NL + "\t";
  protected final String TEXT_38 = NL + "int nb_uniques_";
  protected final String TEXT_39 = " = 0;" + NL + "int nb_duplicates_";
  protected final String TEXT_40 = " = 0;";
  protected final String TEXT_41 = NL + "\tlog.debug(\"";
  protected final String TEXT_42 = " - Start to process the data from datasource.\");";
  protected final String TEXT_43 = NL + "KeyStruct_";
  protected final String TEXT_44 = " finder_";
  protected final String TEXT_45 = " = new KeyStruct_";
  protected final String TEXT_46 = "();" + NL + "java.util.Set<KeyStruct_";
  protected final String TEXT_47 = "> keys";
  protected final String TEXT_48 = " = new java.util.HashSet<KeyStruct_";
  protected final String TEXT_49 = ">();";
  protected final String TEXT_50 = NL + "java.util.Set<KeyStruct_";
  protected final String TEXT_51 = "> keysForDuplicated";
  protected final String TEXT_52 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();
String onlyOnceEachDuplicatedKey = ElementParameterParser.getValue(node, "__ONLY_ONCE_EACH_DUPLICATED_KEY__");
List<Map<String, String>> keyColumns = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__UNIQUE_KEY__");
boolean changeHashAndEqualsForBigDecimal = "true".equals(ElementParameterParser.getValue(node, "__CHANGE_HASH_AND_EQUALS_FOR_BIGDECIMAL__"));
final boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));

boolean hasKey = false;
for(Map<String, String> keyColumn:keyColumns){
	if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
		hasKey = true;
		break;
	}
}


List<IMetadataTable> metadatas = node.getMetadataList();
if ((metadatas!=null)&&(metadatas.size()>0)) {
    IMetadataTable metadata = metadatas.get(0);
    if (metadata!=null) {
		List<IMetadataColumn> columns = metadata.getListColumns();
    

    
	if(hasKey) {
	
    stringBuffer.append(TEXT_2);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_3);
    
	        
			for (int i=0; i<columns.size();i++) {
				IMetadataColumn column = columns.get(i);
				Map<String,String> keyColumn = keyColumns.get(i);
				if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
					
    stringBuffer.append(TEXT_4);
    stringBuffer.append(JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable()) );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
				}
			}
			
    stringBuffer.append(TEXT_7);
    
					for (int i=0; i<columns.size();i++) {
						IMetadataColumn column = columns.get(i);
						Map<String,String> keyColumn = keyColumns.get(i);
						if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){

							JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
		
							if (JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable())) {
							
							 	String typeToGenerate = JavaTypesManager.getTypeToGenerate(column.getTalendType(), column.isNullable());
							 	if(javaType == JavaTypesManager.BOOLEAN) {
									
    stringBuffer.append(TEXT_8);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_9);
    
								} else {	
									
    stringBuffer.append(TEXT_10);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_11);
    
								}
								
							} else if(javaType == JavaTypesManager.BYTE_ARRAY) {
		
								
    stringBuffer.append(TEXT_12);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_13);
    
							
							} else if((javaType == JavaTypesManager.BIGDECIMAL) && changeHashAndEqualsForBigDecimal) {
								
    stringBuffer.append(TEXT_14);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_16);
    
							} else {
								
    stringBuffer.append(TEXT_14);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_17);
    
							}
						
						}
					}
		    
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_20);
    	
					for (int i=0; i<columns.size();i++) {
						IMetadataColumn column = columns.get(i);
						Map<String,String> keyColumn = keyColumns.get(i);
						if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
						
							JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
						
							if (JavaTypesManager.isJavaPrimitiveType(column.getTalendType(), column.isNullable())) {
								
    stringBuffer.append(TEXT_21);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_23);
    
							} else if(javaType == JavaTypesManager.BYTE_ARRAY) {
								
    stringBuffer.append(TEXT_24);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_25);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_26);
    
							} else {
								
    stringBuffer.append(TEXT_21);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_28);
    if((javaType == JavaTypesManager.BIGDECIMAL) && changeHashAndEqualsForBigDecimal) {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_30);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_32);
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_34);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
    
							}
						}
					}
				
    stringBuffer.append(TEXT_37);
    
	}

    stringBuffer.append(TEXT_38);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_39);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_40);
    
if (isLog4jEnabled) {

    stringBuffer.append(TEXT_41);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_42);
    
}
if(hasKey){
    stringBuffer.append(TEXT_43);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_45);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_46);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_47);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_49);
    
	if(("true").equals(onlyOnceEachDuplicatedKey)){

    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_48);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_49);
    
	}
}
}
}
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_52);
    return stringBuffer.toString();
  }
}
