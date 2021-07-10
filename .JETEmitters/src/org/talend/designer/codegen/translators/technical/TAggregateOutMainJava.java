package org.talend.designer.codegen.translators.technical;

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

public class TAggregateOutMainJava
{
  protected static String nl;
  public static synchronized TAggregateOutMainJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TAggregateOutMainJava result = new TAggregateOutMainJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "\t";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = "operation_finder_";
  protected final String TEXT_4 = ".";
  protected final String TEXT_5 = " = ";
  protected final String TEXT_6 = ".clone();" + NL + "\t\t\t";
  protected final String TEXT_7 = ";" + NL + "\t\t\t";
  protected final String TEXT_8 = NL + NL + "\toperation_finder_";
  protected final String TEXT_9 = ".hashCodeDirty = true;" + NL + "\t" + NL + "\toperation_result_";
  protected final String TEXT_10 = " = hash_";
  protected final String TEXT_11 = ".get(operation_finder_";
  protected final String TEXT_12 = ");" + NL + "" + NL + "\t";
  protected final String TEXT_13 = NL + "\t\tboolean isFirstAdd_";
  protected final String TEXT_14 = " = false;" + NL + "\t";
  protected final String TEXT_15 = NL + NL + "\tif(operation_result_";
  protected final String TEXT_16 = " == null) { // G_OutMain_AggR_001" + NL + "" + NL + "\t\toperation_result_";
  protected final String TEXT_17 = " = new AggOperationStruct_";
  protected final String TEXT_18 = "();" + NL + "" + NL + "\t\t";
  protected final String TEXT_19 = "operation_result_";
  protected final String TEXT_20 = " = operation_finder_";
  protected final String TEXT_21 = ".clone();" + NL + "\t\t\t\t";
  protected final String TEXT_22 = ";" + NL + "\t\t\t\t";
  protected final String TEXT_23 = NL + "\t\t" + NL + "\t\t";
  protected final String TEXT_24 = NL + "\t\t\tisFirstAdd_";
  protected final String TEXT_25 = " = true;" + NL + "\t\t";
  protected final String TEXT_26 = NL + NL + "\t\thash_";
  protected final String TEXT_27 = ".put(operation_result_";
  protected final String TEXT_28 = ", operation_result_";
  protected final String TEXT_29 = ");" + NL + "\t" + NL + "\t} // G_OutMain_AggR_001" + NL + "" + NL + "" + NL + "\t";
  protected final String TEXT_30 = NL + "\t\t\t\tif(";
  protected final String TEXT_31 = " != null) { // G_OutMain_AggR_546" + NL + "\t\t\t\t";
  protected final String TEXT_32 = NL + "\t\t\t\t" + NL + "\t\t\t\tAggCountDistinctValuesStruct_";
  protected final String TEXT_33 = "_";
  protected final String TEXT_34 = " countDistinctValues_";
  protected final String TEXT_35 = " = new AggCountDistinctValuesStruct_";
  protected final String TEXT_36 = "();" + NL + "\t\t\t" + NL + "\t\t\t\t";
  protected final String TEXT_37 = "countDistinctValues_";
  protected final String TEXT_38 = ";" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_39 = NL + "\t\t\t\tcountDistinctValues_";
  protected final String TEXT_40 = ";" + NL + "\t\t\t\toperation_result_";
  protected final String TEXT_41 = ".distinctValues_";
  protected final String TEXT_42 = ".add(countDistinctValues_";
  protected final String TEXT_43 = ");" + NL + "\t\t\t\t";
  protected final String TEXT_44 = NL + "\t\t\t\toperation_result_";
  protected final String TEXT_45 = "_clmCount++;";
  protected final String TEXT_46 = ".count++;" + NL + "\t\t\t\t";
  protected final String TEXT_47 = "_count++;" + NL + "\t\t\t\t";
  protected final String TEXT_48 = NL + "\t\t\t\t\tif( " + NL + "\t\t\t\t\t\t";
  protected final String TEXT_49 = NL + "\t\t\t\t\t\t\toperation_result_";
  protected final String TEXT_50 = " == null || operation_result_";
  protected final String TEXT_51 = " instanceof java.lang.Comparable && " + NL + "\t\t\t\t\t\t\t((java.lang.Comparable) ";
  protected final String TEXT_52 = ").compareTo(operation_result_";
  protected final String TEXT_53 = ") ";
  protected final String TEXT_54 = " 0" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_55 = " == null || ";
  protected final String TEXT_56 = ".compareTo(operation_result_";
  protected final String TEXT_57 = NL + "\t\t\t\t\t) {" + NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_58 = ";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_59 = NL + "\t\t\t\t\tif(" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_60 = NL + "\t\t\t\t\t\t";
  protected final String TEXT_61 = " ";
  protected final String TEXT_62 = " operation_result_";
  protected final String TEXT_63 = " || isFirstAdd_";
  protected final String TEXT_64 = NL + "\t\t\t\t\tif(operation_result_";
  protected final String TEXT_65 = " == null) {" + NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_66 = " = (";
  protected final String TEXT_67 = ") 0;" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\t";
  protected final String TEXT_68 = " = new BigDecimal(0)";
  protected final String TEXT_69 = ";" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_70 = " = operation_result_";
  protected final String TEXT_71 = ".add(" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_72 = "new BigDecimal(";
  protected final String TEXT_73 = NL + "\t\t\t\t\t\t\t";
  protected final String TEXT_74 = "String.valueOf(";
  protected final String TEXT_75 = NL + "\t\t\t\t\t\t\t\t";
  protected final String TEXT_76 = ")";
  protected final String TEXT_77 = NL + "\t\t\t\t\t);" + NL + "\t\t\t\t\t";
  protected final String TEXT_78 = "utilClass_";
  protected final String TEXT_79 = ".checkedIADD( operation_result_";
  protected final String TEXT_80 = ", ";
  protected final String TEXT_81 = ".doubleValue(), ";
  protected final String TEXT_82 = ");" + NL + "\t\t\t\t\t\t";
  protected final String TEXT_83 = ".checkedIADD( (";
  protected final String TEXT_84 = ") operation_result_";
  protected final String TEXT_85 = "Value(), ";
  protected final String TEXT_86 = ");" + NL + "\t\t\t\t\t";
  protected final String TEXT_87 = NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_88 = " += ";
  protected final String TEXT_89 = "Value();" + NL + "\t\t\t\t\t";
  protected final String TEXT_90 = ", (";
  protected final String TEXT_91 = ")(operation_result_";
  protected final String TEXT_92 = "Value() + ";
  protected final String TEXT_93 = "Value());" + NL + "\t\t\t\t\t";
  protected final String TEXT_94 = NL + "\t\t\t\t\tif( ";
  protected final String TEXT_95 = " != null)" + NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_96 = ";";
  protected final String TEXT_97 = NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_98 = ";" + NL + "\t\t\t\t\t";
  protected final String TEXT_99 = NL + "\t\t\t\tif(isFirstAdd_";
  protected final String TEXT_100 = " || operation_result_";
  protected final String TEXT_101 = " == null";
  protected final String TEXT_102 = ") {" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_103 = ";" + NL + "\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_104 = NL + "\t\t\t\tif(operation_result_";
  protected final String TEXT_105 = ".length() > 0) {" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_106 = ".append(";
  protected final String TEXT_107 = ");" + NL + "\t\t\t\t} " + NL + "\t\t\t\t";
  protected final String TEXT_108 = " != null) {" + NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_109 = ".append(java.util.Arrays.toString(";
  protected final String TEXT_110 = "));" + NL + "\t\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_111 = "else if(operation_result_";
  protected final String TEXT_112 = "_firstEmpty){" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_113 = ");" + NL + "\t\t\t\t}" + NL + "\t\t\t\t\tif(operation_result_";
  protected final String TEXT_114 = " != null) {" + NL + "\t\t\t\t\t\tif(operation_result_";
  protected final String TEXT_115 = "_firstEmpty==false && (\"\").equals(String.valueOf(";
  protected final String TEXT_116 = "))){" + NL + "\t\t\t\t\t\t\toperation_result_";
  protected final String TEXT_117 = "_firstEmpty = true;" + NL + "\t\t\t\t\t\t}" + NL + "\t\t\t\t\t\toperation_result_";
  protected final String TEXT_118 = ".append(String.valueOf(";
  protected final String TEXT_119 = "// Load first one or union" + NL + "\t\t\t\tif (operation_result_";
  protected final String TEXT_120 = " == null) {" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_121 = ";" + NL + "\t\t\t\t} else {" + NL + "\t\t\t\t\toperation_result_";
  protected final String TEXT_122 = ".union(";
  protected final String TEXT_123 = ");" + NL + "\t\t\t\t}" + NL + "\t\t\t\t";
  protected final String TEXT_124 = ".add(";
  protected final String TEXT_125 = ".doubleValue());" + NL + "\t\t\t\t\t";
  protected final String TEXT_126 = ".add((double)";
  protected final String TEXT_127 = NL + "\t\t\t\t} // G_OutMain_AggR_546" + NL + "\t\t\t\t";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    
CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
INode node = (INode)codeGenArgument.getArgument();
String origin = ElementParameterParser.getValue(node, "__DESTINATION__");
String cid = origin;

boolean useFinancialPrecision = "true".equals(ElementParameterParser.getValue(node, "__USE_FINANCIAL_PRECISION__"));

boolean checkTypeOverflow = "true".equals(ElementParameterParser.getValue(node, "__CHECK_TYPE_OVERFLOW__"));
boolean checkUlp = "true".equals(ElementParameterParser.getValue(node, "__CHECK_ULP__"));
String listDelimiter = ElementParameterParser.getValue(node, "__LIST_DELIMITER__");

IConnection inputConn = null;
IMetadataTable inputMetadataTable = null;
IMetadataTable outputMetadataTable = null;
java.util.List<IMetadataColumn> inputColumns = null;
java.util.List<IMetadataColumn> outputColumns = null;


int FUNCTION = 0;
int INPUT_COLUMN = 1;
int IGNORE_NULL = 2;
int OUTPUT_COLUMN = 3;

String SUM = "sum";
String COUNT = "count";
String MAX = "max";
String MIN = "min";
String FIRST = "first";
String LAST = "last";
String AVG = "avg";
String COUNT_DISTINCT = "distinct";
String LIST = "list";
String LIST_OBJECT = "list_object";
String STD_DEV = "std_dev";
String UNION = "union";


List<? extends IConnection> incomingConnections = node.getIncomingConnections();
if (incomingConnections != null && !incomingConnections.isEmpty()) {
	for (IConnection conn : incomingConnections) {
		if (conn.getLineStyle().hasConnectionCategory(IConnectionCategory.DATA)) {
			inputConn = conn;
			inputMetadataTable = conn.getMetadataTable();
			inputColumns = inputMetadataTable.getListColumns();
			break;
		}
	}
}

List<IMetadataTable> mestadataTableListOut = node.getMetadataList();
if (mestadataTableListOut!=null && mestadataTableListOut.size()>0) { // T_AggR_600
    outputMetadataTable = mestadataTableListOut.get(0);
	if(outputMetadataTable != null) {
		outputColumns = outputMetadataTable.getListColumns();
	}
}

if(inputConn != null) { // T_OutMain_AggR_501

	List<Map<String, String>> operations = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__OPERATIONS__");
	List<Map<String, String>> groupbys = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__GROUPBYS__");
	
	java.util.Map<String,IMetadataColumn> inputKeysColumns = new java.util.HashMap<String,IMetadataColumn>();
	java.util.Map<String,IMetadataColumn> inputValuesColumns = new java.util.HashMap<String,IMetadataColumn>();
	java.util.Map<String,IMetadataColumn> outputValuesColumns = new java.util.HashMap<String,IMetadataColumn>();
	
	int sizeOperations = operations.size();
	int sizeGroupbys = groupbys.size();
	String lastInputColumn = null;
	if(sizeGroupbys>0){
		lastInputColumn = groupbys.get(sizeGroupbys-1).get("INPUT_COLUMN");
	}


	if(inputColumns != null) { // T_AggR_144
		for (IMetadataColumn column: inputColumns) { // T_AggR_145
	
			for(int i = 0; i < sizeGroupbys; i++){ // T_AggR_113
				String columnname = groupbys.get(i).get("INPUT_COLUMN");
				if(column.getLabel().equals(columnname)){ // T_AggR_114
					inputKeysColumns.put(columnname, column);
					break;
	        	} // T_AggR_114
			} // T_AggR_113
					
			for(int i = 0; i < sizeOperations; i++){ // T_AggR_713
				String columnname = operations.get(i).get("INPUT_COLUMN");
	        	if(column.getLabel().equals(columnname)){ // T_AggR_714
	       			inputValuesColumns.put(columnname, column);
					break;
	       		} // T_AggR_714
			} // T_AggR_713
					
		} // T_AggR_145
	} // T_AggR_144
	
	if(outputColumns != null) { // T_AggR_744
		for (IMetadataColumn column: outputColumns) { // T_AggR_745
	
			for(int i = 0; i < sizeOperations; i++){ // T_AggR_713
				String columnname = operations.get(i).get("OUTPUT_COLUMN");
	        	if(column.getLabel().equals(columnname)){ // T_AggR_714
	       			outputValuesColumns.put(columnname, column);
					break;
	       		} // T_AggR_714
			} // T_AggR_713
	
		} // T_AggR_745
	} // T_AggR_744
	
	
	for (IMetadataColumn column : inputColumns) {
		if(inputKeysColumns.containsKey(column.getLabel())) {
			if (column.getTalendType().equals("id_Dynamic")) {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_6);
    
			} else {
			
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_7);
    
			}
		}
	}
	
	
	List<String[]> funinOperations = new java.util.ArrayList<String[]>();
	boolean hasOperationFirst = false;
	next:
	for(int i=0; i<sizeOperations; i++){
		Map<String, String> operation = operations.get(i);
		String fun = operation.get("FUNCTION");
		if(FIRST.equals(fun) || LAST.equals(fun) || MIN.equals(fun) || MAX.equals(fun)) {
			hasOperationFirst = true;
		}
		
		String in = operation.get("INPUT_COLUMN");
		String out = operation.get("OUTPUT_COLUMN");
		String ignoreNull = operation.get("IGNORE_NULL");
		
		/*
		if(("sum").equals(fun) || ("count").equals(fun)){
			for(int j=0; j<sizeOperations; j++){
				Map<String, String> tOperation = operations.get(j);
				if(("avg").equals(tOperation.get("FUNCTION")) && tOperation.get("INPUT_COLUMN").equals(in)){
					continue next;
				}
			}
		}
		for(int j = 0; j < i; j++){ //skip duplicate operation
			Map<String, String> tOperation = operations.get(j);
			if(tOperation.get("FUNCTION").equals(fun) && tOperation.get("INPUT_COLUMN").equals(in)){
				continue next;
			}
		}
		*/
		
		String[] funin = new String[4];
		funin[FUNCTION]=fun;
		funin[INPUT_COLUMN]=in;
		funin[OUTPUT_COLUMN]=out;
		funin[IGNORE_NULL]=ignoreNull;
		funinOperations.add(funin);
	}
	
	
	
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_11);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_12);
    
	if(hasOperationFirst) {
	
    stringBuffer.append(TEXT_13);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_14);
    
	}
	
    stringBuffer.append(TEXT_15);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_16);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_17);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_18);
    
		for (IMetadataColumn column : inputColumns) {
			if(inputKeysColumns.containsKey(column.getLabel())) {
				if (column.getTalendType().equals("id_Dynamic")) {
				
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_21);
    
				} else {
				
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_22);
    
				}
			}
		}
		
    stringBuffer.append(TEXT_23);
    
		if(hasOperationFirst) {
		
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    
		}
		
    stringBuffer.append(TEXT_26);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_27);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_28);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_29);
    
		
	
	
	
	int sizeOps = funinOperations.size();
	String tInputColumn =null;

	boolean hasAlreadyCountProperty = false;
	boolean hasAlreadyCountDistinctProperty = false;
	for(int j = 0; j < sizeOps; j++){ // T_OutMain_AggR_546
		String[] funin = funinOperations.get(j);
		
		String function = funin[FUNCTION];
		String inputColumnName = funin[INPUT_COLUMN];
		String outputColumnName = funin[OUTPUT_COLUMN];
		boolean ignoreNull = ("true").equals(funin[IGNORE_NULL]);

		IMetadataColumn outputColumn = outputValuesColumns.get(outputColumnName);
		IMetadataColumn inputColumn = inputValuesColumns.get(inputColumnName);
		JavaType outputJavaType = JavaTypesManager.getJavaTypeFromId(outputColumn.getTalendType());
		JavaType inputJavaType = JavaTypesManager.getJavaTypeFromId(inputColumn.getTalendType());
		boolean isBasePrimitive = JavaTypesManager.isJavaPrimitiveType(outputJavaType, false);
		boolean isSelectedPrimitive = JavaTypesManager.isJavaPrimitiveType(outputJavaType, outputColumn.isNullable());
		boolean isInputColumnPrimitive = JavaTypesManager.isJavaPrimitiveType(inputJavaType, inputColumn.isNullable());
		String primitiveTypeToGenerate = JavaTypesManager.getTypeToGenerate(outputJavaType.getId(), false);

		boolean outputIsNumber = JavaTypesManager.isNumberType(outputJavaType, false);
		boolean outputIsObject = outputJavaType == JavaTypesManager.OBJECT;
		boolean outputIsGeometry = false;
		boolean inputIsGeometry = false;
		try {
			outputIsGeometry = outputJavaType == JavaTypesManager.getJavaTypeFromId("id_Geometry");
		} catch (IllegalArgumentException e) {
		}
		boolean outputIsList = outputJavaType == JavaTypesManager.LIST;
		boolean outputIsString = outputJavaType == JavaTypesManager.STRING;
		boolean outputIsBigDecimal = outputJavaType == JavaTypesManager.BIGDECIMAL;
		boolean outputIsDate = outputJavaType == JavaTypesManager.DATE;
		boolean outputIsLong = outputJavaType == JavaTypesManager.LONG;
		boolean outputIsDecimal = outputJavaType == JavaTypesManager.FLOAT || outputJavaType == JavaTypesManager.DOUBLE || outputIsBigDecimal;
		
		boolean outputIsByte = outputJavaType == JavaTypesManager.BYTE;
		boolean outputIsShort = outputJavaType == JavaTypesManager.SHORT;
		
		boolean inputIsNumber = JavaTypesManager.isNumberType(inputJavaType, false);
		boolean inputIsObject = inputJavaType == JavaTypesManager.OBJECT;
		try {
			inputIsGeometry = inputJavaType == JavaTypesManager.getJavaTypeFromId("id_Geometry");
		} catch (IllegalArgumentException e) {
		}
		boolean inputIsBoolean = inputJavaType == JavaTypesManager.BOOLEAN;
		boolean inputIsList = inputJavaType == JavaTypesManager.LIST;
		boolean inputIsString = inputJavaType == JavaTypesManager.STRING;
		boolean inputIsDate = inputJavaType == JavaTypesManager.DATE;
		boolean inputIsBigDecimal = inputJavaType == JavaTypesManager.BIGDECIMAL;
		boolean inputIsByteArray = inputJavaType == JavaTypesManager.BYTE_ARRAY;
		boolean inputIsDecimal = inputJavaType == JavaTypesManager.FLOAT || inputJavaType == JavaTypesManager.DOUBLE || inputIsBigDecimal;

		boolean forceUseBigDecimal = 
			(function.equals(SUM) || function.equals(AVG)) 
			&& inputIsDecimal
			&& outputIsDecimal
			&& useFinancialPrecision
		;
	
		boolean sameInOutType = outputJavaType == inputJavaType;

		boolean isValidTypeForOperation = 
			(function.equals(SUM) || function.equals(AVG)) && inputIsNumber && outputIsNumber
			|| function.equals(MIN) && sameInOutType && !inputIsList && !inputIsByteArray && !inputIsBoolean 
			|| function.equals(MAX) && sameInOutType && !inputIsList && !inputIsByteArray && !inputIsBoolean
			|| function.equals(FIRST) && sameInOutType
			|| function.equals(LAST) && sameInOutType
			|| function.equals(LIST) && outputIsString
			|| function.equals(LIST_OBJECT) && outputIsList
			|| function.equals(COUNT) && outputIsNumber
			|| function.equals(UNION) && outputIsGeometry
			|| function.equals(COUNT_DISTINCT) && outputIsNumber
			|| function.equals(STD_DEV) && inputIsNumber && outputIsNumber
		;
		
		// use double type as the sum for avg when the type of output column is byte, int, long, short, double, float
		boolean forceUseDoubleAvgSum = false; 

		if(AVG.equals(function) ) {
			forceUseDoubleAvgSum = !outputIsBigDecimal && !outputIsLong; // the type of output column can't be BigDecimal
			if(!forceUseBigDecimal) {
				forceUseBigDecimal = outputIsLong;
			}
		}
		
		if(isValidTypeForOperation) { // T_OutMain_AggR_745
		
			if(ignoreNull && !isInputColumnPrimitive) { // T_OutMain_AggR_545
			
				
    stringBuffer.append(TEXT_30);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_31);
    
				
			} // T_OutMain_AggR_545
			

			if(function.equals(COUNT_DISTINCT)){
				
    stringBuffer.append(TEXT_32);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_34);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_35);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_36);
    
				for (IMetadataColumn column : inputColumns) {
					if(inputKeysColumns.containsKey(column.getLabel())) {
				
						
    stringBuffer.append(TEXT_37);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(column.getLabel());
    stringBuffer.append(TEXT_38);
    
						
					}
				}
				
    stringBuffer.append(TEXT_39);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_40);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_41);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_42);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_43);
    
			}
			
			if(function.equals(COUNT)) {

    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_45);
    
			}

			if(!hasAlreadyCountProperty && function.equals(COUNT)) {
				hasAlreadyCountProperty = true;
				
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_46);
    
			}
			
			if(outputIsNumber && function.equals(AVG)){
					
				
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_47);
    
				
			}
			if(function.equals(MIN) || function.equals(MAX)){
			
				String operator = ">";
				if(function.equals(MIN)) {
					operator = "<";
				}
	
	
	
				if(inputIsString || inputIsDate || inputIsObject || inputIsBigDecimal) {
				
					
    stringBuffer.append(TEXT_48);
    if(inputIsObject) {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_50);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_51);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_52);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_53);
    stringBuffer.append(operator);
    stringBuffer.append(TEXT_54);
    } else {
    stringBuffer.append(TEXT_49);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_55);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_56);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_53);
    stringBuffer.append(operator);
    stringBuffer.append(TEXT_54);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_58);
    
				
				} else {
				
					
    stringBuffer.append(TEXT_59);
     if(outputColumn.isNullable()) { 
							
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_55);
    
						}
    stringBuffer.append(TEXT_60);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_61);
    stringBuffer.append(operator);
    stringBuffer.append(TEXT_62);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_60);
     if(!outputColumn.isNullable()) { 
							
    stringBuffer.append(TEXT_63);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_61);
    
						}
    stringBuffer.append(TEXT_57);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_58);
    
				}
			
			} else if(function.equals(SUM) || function.equals(AVG)){
	
				if(!isSelectedPrimitive && isBasePrimitive && !forceUseBigDecimal) {
					
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_66);
    stringBuffer.append( forceUseDoubleAvgSum?"double":primitiveTypeToGenerate );
    stringBuffer.append(TEXT_67);
    
				}
	
				if(outputIsBigDecimal || forceUseBigDecimal) {
	
					
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_65);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_68);
    stringBuffer.append(outputColumn.getPrecision()==null? "":".setScale(" + outputColumn.getPrecision().intValue()+")" );
    stringBuffer.append(TEXT_69);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_71);
    if(!inputIsBigDecimal || forceUseBigDecimal) {
							
    stringBuffer.append(TEXT_72);
    
						}
    stringBuffer.append(TEXT_73);
    if(forceUseBigDecimal) {
								
    stringBuffer.append(TEXT_74);
    
							}
    stringBuffer.append(TEXT_75);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_73);
    if(forceUseBigDecimal) {
								
    stringBuffer.append(TEXT_76);
    
							}
    stringBuffer.append(TEXT_60);
    if(!inputIsBigDecimal || forceUseBigDecimal) {
							
    stringBuffer.append(TEXT_76);
    
						}
    stringBuffer.append(TEXT_77);
    
			
				} else if(inputIsBigDecimal && !outputIsBigDecimal) {
				
					if(checkTypeOverflow || checkUlp) {
						if(forceUseDoubleAvgSum) {
						
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_81);
    stringBuffer.append( checkTypeOverflow );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkUlp );
    stringBuffer.append(TEXT_82);
    
						} else {
						
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( primitiveTypeToGenerate);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM);
    stringBuffer.append(TEXT_80);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(primitiveTypeToGenerate);
    stringBuffer.append(TEXT_85);
    stringBuffer.append( checkTypeOverflow );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkUlp );
    stringBuffer.append(TEXT_86);
    
						}
					}
					
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(forceUseDoubleAvgSum?"double":primitiveTypeToGenerate);
    stringBuffer.append(TEXT_89);
    
				
				} else {
				
					if(checkTypeOverflow || checkUlp) {
						if(forceUseDoubleAvgSum) {
						
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_79);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_80);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkTypeOverflow );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkUlp );
    stringBuffer.append(TEXT_82);
    
						} else {
						
    stringBuffer.append(TEXT_78);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_83);
    stringBuffer.append( primitiveTypeToGenerate);
    stringBuffer.append(TEXT_84);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_90);
    stringBuffer.append( primitiveTypeToGenerate);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkTypeOverflow );
    stringBuffer.append(TEXT_80);
    stringBuffer.append( checkUlp );
    stringBuffer.append(TEXT_82);
    
						}
					}
					if(outputColumn.isNullable() && (outputIsByte || outputIsShort)){
					
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_66);
    stringBuffer.append(forceUseDoubleAvgSum?"double":primitiveTypeToGenerate);
    stringBuffer.append(TEXT_91);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(forceUseDoubleAvgSum?"double":primitiveTypeToGenerate);
    stringBuffer.append(TEXT_92);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(primitiveTypeToGenerate);
    stringBuffer.append(TEXT_93);
    
					}else{
						if(inputColumn.isNullable()  ){
					
    stringBuffer.append(TEXT_94);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_95);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_96);
    
					} else {
    stringBuffer.append(TEXT_97);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append( SUM );
    stringBuffer.append(TEXT_88);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_98);
    
				    }
				   }
				}
			} else if(function.equals(FIRST)){
					
				
    stringBuffer.append(TEXT_99);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_61);
    if(ignoreNull) {
    stringBuffer.append(TEXT_100);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_101);
    }
    stringBuffer.append(TEXT_102);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_103);
    
				
			} else if(function.equals(LAST)){
					
				
    stringBuffer.append(TEXT_87);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_22);
    
				
			} else if(function.equals(LIST)){
					
				
    stringBuffer.append(TEXT_104);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_105);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( listDelimiter );
    stringBuffer.append(TEXT_107);
    
				if(inputIsByteArray) {
				
    stringBuffer.append(TEXT_64);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_108);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_109);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_110);
    
				} else {
				
    stringBuffer.append(TEXT_111);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_112);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_106);
    stringBuffer.append( listDelimiter );
    stringBuffer.append(TEXT_113);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_114);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_115);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_116);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_117);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_118);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_110);
    
				}
			} else if(function.equals(UNION)){
				
    stringBuffer.append(TEXT_119);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_120);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_5);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_121);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_70);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_122);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName );
    stringBuffer.append(TEXT_123);
    
 			} else if(function.equals(LIST_OBJECT)){
					
				
    stringBuffer.append(TEXT_44);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_124);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_43);
    
				
			} else if(function.equals(STD_DEV)){

				if(inputIsBigDecimal) {
	
					
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_124);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_125);
    
			
				} else {
				
					
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(outputColumnName );
    stringBuffer.append(TEXT_33);
    stringBuffer.append(function );
    stringBuffer.append(TEXT_126);
    stringBuffer.append(inputConn.getName() );
    stringBuffer.append(TEXT_4);
    stringBuffer.append(inputColumnName  );
    stringBuffer.append(TEXT_86);
    
					
				}
				
			}
			
			if(ignoreNull && !isInputColumnPrimitive) { // T_OutMain_AggR_545
			
				
    stringBuffer.append(TEXT_127);
    
				
			} // T_OutMain_AggR_545

		} // T_OutMain_AggR_745	
	} // T_OutMain_AggR_546

} // T_OutMain_AggR_501


    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
