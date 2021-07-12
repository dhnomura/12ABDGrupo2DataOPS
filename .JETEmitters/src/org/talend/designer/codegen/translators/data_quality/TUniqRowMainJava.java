package org.talend.designer.codegen.translators.data_quality;

import org.talend.core.model.process.ElementParameterParser;
import org.talend.core.model.metadata.IMetadataTable;
import org.talend.core.model.metadata.IMetadataColumn;
import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.IConnectionCategory;
import org.talend.core.model.process.IConnection;
import java.util.List;
import java.util.Map;
import org.talend.core.model.metadata.types.JavaTypesManager;
import org.talend.core.model.metadata.types.JavaType;

public class TUniqRowMainJava
{
  protected static String nl;
  public static synchronized TUniqRowMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TUniqRowMainJava result = new TUniqRowMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = " = null;\t\t\t";
  protected final String TEXT_3 = NL + "finder_";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = " = ";
  protected final String TEXT_6 = ";";
  protected final String TEXT_7 = NL + "if(";
  protected final String TEXT_8 = " == null){" + NL + "\tfinder_";
  protected final String TEXT_9 = " = null;" + NL + "}else{" + NL + "\tfinder_";
  protected final String TEXT_10 = ".toLowerCase();" + NL + "}";
  protected final String TEXT_11 = "\t" + NL + "finder_";
  protected final String TEXT_12 = ".hashCodeDirty = true;" + NL + "if (!keys";
  protected final String TEXT_13 = ".contains(finder_";
  protected final String TEXT_14 = ")) {" + NL + "\t\tKeyStruct_";
  protected final String TEXT_15 = " new_";
  protected final String TEXT_16 = " = new KeyStruct_";
  protected final String TEXT_17 = "();" + NL + "" + NL + "\t\t";
  protected final String TEXT_18 = NL + "new_";
  protected final String TEXT_19 = " == null){" + NL + "\tnew_";
  protected final String TEXT_20 = " = null;" + NL + "}else{" + NL + "\tnew_";
  protected final String TEXT_21 = NL + "\t\t" + NL + "\t\tkeys";
  protected final String TEXT_22 = ".add(new_";
  protected final String TEXT_23 = ");";
  protected final String TEXT_24 = "if(";
  protected final String TEXT_25 = " == null){ " + NL + "\t";
  protected final String TEXT_26 = NL + "\t\tlog.trace(\"";
  protected final String TEXT_27 = " - Writing the unique record \" + (nb_uniques_";
  protected final String TEXT_28 = "+1) + \" into ";
  protected final String TEXT_29 = ".\");" + NL + "\t";
  protected final String TEXT_30 = NL + "\t";
  protected final String TEXT_31 = " = new ";
  protected final String TEXT_32 = "Struct();" + NL + "}";
  protected final String TEXT_33 = ";\t\t\t";
  protected final String TEXT_34 = "\t\t" + NL + "\t\tnb_uniques_";
  protected final String TEXT_35 = "++;" + NL + "\t} else {";
  protected final String TEXT_36 = NL + "if (!keysForDuplicated";
  protected final String TEXT_37 = NL + "\tkeysForDuplicated";
  protected final String TEXT_38 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_39 = " - Writing the duplicate record \" + (nb_duplicates_";
  protected final String TEXT_40 = "Struct();" + NL + "}\t\t\t\t";
  protected final String TEXT_41 = NL + "}" + NL + "\t\t\t\t\t";
  protected final String TEXT_42 = NL + "\t  nb_duplicates_";
  protected final String TEXT_43 = "++;" + NL + "\t}";
  protected final String TEXT_44 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String cid = node.getUniqueName();
String connName = null;
if (node.getIncomingConnections().size()==1) {
	IConnection conn = node.getIncomingConnections().get(0);
	connName = conn.getName();
}
final boolean isLog4jEnabled = ("true").equals(ElementParameterParser.getValue(node.getProcess(), "__LOG4J_ACTIVATE__"));

List<IMetadataTable> metadatas = node.getMetadataList();
if ((metadatas!=null)&&(metadatas.size()>0)) {
    IMetadataTable metadata = metadatas.get(0);
    if (metadata!=null && connName != null) {
		List<? extends IConnection> conns = node.getOutgoingSortedConnections();
		List<? extends IConnection> connsUnique = node.getOutgoingConnections("UNIQUE");
		List<? extends IConnection> connsDuplicate = node.getOutgoingConnections("DUPLICATE");
		String onlyOnceEachDuplicatedKey = ElementParameterParser.getValue(node, "__ONLY_ONCE_EACH_DUPLICATED_KEY__");
		List<Map<String, String>> keyColumns = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__UNIQUE_KEY__");
		boolean hasKey = false;
		for(Map<String, String> keyColumn:keyColumns){
			if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
				hasKey = true;
				break;
			}
		}
		int ii = 0;
		if(hasKey){

    
	if (conns!=null) {
		if (conns.size()>0) {
			for (int i=0;i<conns.size();i++) {
				IConnection conn = conns.get(i);
				if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {

			    	 
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_2);
    					 
				}
			}
		}
	}
	
	for (int i=0; i<metadata.getListColumns().size();i++) {
		IMetadataColumn column = metadata.getListColumns().get(i);
		Map<String,String> keyColumn = keyColumns.get(i);
		if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
			boolean caseSensitive = ("true").equals(keyColumn.get("CASE_SENSITIVE"));
			JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
			if(javaType == JavaTypesManager.STRING) {
				if(caseSensitive){
		
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
				}else{

    stringBuffer.append(TEXT_7);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_10);
    
				}
			}else{

    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
			}
		}
	}

    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_12);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_17);
    
	for (int ij=0; ij<metadata.getListColumns().size();ij++) {
		IMetadataColumn column = metadata.getListColumns().get(ij);
		Map<String,String> keyColumn = keyColumns.get(ij);
		if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
			boolean caseSensitive = ("true").equals(keyColumn.get("CASE_SENSITIVE"));
			JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
			if(javaType == JavaTypesManager.STRING) {
				if(caseSensitive){
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
				}else{

    stringBuffer.append(TEXT_7);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_10);
    
				}
			}else{

    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
			}
		}
	}
		
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    
	if (connsUnique!=null) {
		if (connsUnique.size()>0) {
			for (int i=0;i<connsUnique.size();i++) {
				IConnection conn = connsUnique.get(i);
				if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {

    stringBuffer.append(TEXT_24);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_25);
    
	if(isLog4jEnabled){
	
    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_29);
    
	}
	
    stringBuffer.append(TEXT_30);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_32);
    
			    	 for (IMetadataColumn column: metadata.getListColumns()) {
			    	 
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_33);
    					 }
				}
			}
		}
	}

    stringBuffer.append(TEXT_34);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_35);
    
	if (connsDuplicate!=null) {
		if (connsDuplicate.size()>0) {
			for (int i=0;i<connsDuplicate.size();i++) {
				IConnection conn = connsDuplicate.get(i);
				if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
					if(("true").equals(onlyOnceEachDuplicatedKey)){
					
    stringBuffer.append(TEXT_36);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_17);
    
	for (int ik=0; ik<metadata.getListColumns().size();ik++) {
		IMetadataColumn column = metadata.getListColumns().get(ik);
		Map<String,String> keyColumn = keyColumns.get(ik);
		if(("true").equals(keyColumn.get("KEY_ATTRIBUTE"))){
			boolean caseSensitive = ("true").equals(keyColumn.get("CASE_SENSITIVE"));
			JavaType javaType = JavaTypesManager.getJavaTypeFromId(column.getTalendType());
			if(javaType == JavaTypesManager.STRING) {
				if(caseSensitive){
		
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
				}else{

    stringBuffer.append(TEXT_7);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_10);
    
				}
			}else{

    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_6);
    
			}
		}
	}
		
    stringBuffer.append(TEXT_37);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_38);
    
					}

    stringBuffer.append(TEXT_7);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_25);
    
	if(isLog4jEnabled){
	
    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_29);
    
	}
	
    stringBuffer.append(TEXT_30);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_31);
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_40);
    
			    	 for (IMetadataColumn column: metadata.getListColumns()) {
			    	 
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_33);
    					 }
					if(("true").equals(onlyOnceEachDuplicatedKey)){
					
    stringBuffer.append(TEXT_41);
    
					}
				}
			}
		}
	}

    stringBuffer.append(TEXT_42);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
	}else{
		if (conns!=null) {
			if (conns.size()>0) {
				for (int i=0;i<conns.size();i++) {
					IConnection conn = conns.get(i);
			    	if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
			    		for (IMetadataColumn column: metadata.getListColumns()) {
			    	 
    stringBuffer.append(conn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(connName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel() );
    stringBuffer.append(TEXT_33);
    						}
					}
				}
			}
		}
	}
	}
}

    stringBuffer.append(TEXT_44);
    return stringBuffer.toString();
  }
}
