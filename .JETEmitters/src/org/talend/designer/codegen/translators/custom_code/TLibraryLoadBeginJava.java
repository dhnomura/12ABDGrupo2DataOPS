package org.talend.designer.codegen.translators.custom_code;

import org.talend.core.model.process.INode;
import org.talend.designer.codegen.config.CodeGeneratorArgument;
import org.talend.core.model.process.ElementParameterParser;
import java.util.List;
import java.util.Map;

public class TLibraryLoadBeginJava
{
  protected static String nl;
  public static synchronized TLibraryLoadBeginJava create(String lineSeparator)
  {
    nl = lineSeparator;
    TLibraryLoadBeginJava result = new TLibraryLoadBeginJava();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL + NL + "String[] libPaths_";
  protected final String TEXT_4 = " = new String[] { ";
  protected final String TEXT_5 = " ";
  protected final String TEXT_6 = ", ";
  protected final String TEXT_7 = " };" + NL + "" + NL + "java.util.List<java.net.URL> libURL_";
  protected final String TEXT_8 = " = new java.util.ArrayList<>();" + NL + "" + NL + "for(String lib_";
  protected final String TEXT_9 = ":libPaths_";
  protected final String TEXT_10 = ") {" + NL + "\tString separator_";
  protected final String TEXT_11 = " = System.getProperty(\"path.separator\");" + NL + "\tString[] jarFiles_";
  protected final String TEXT_12 = " = lib_";
  protected final String TEXT_13 = ".split(separator_";
  protected final String TEXT_14 = ");\t" + NL + "\tfor(String jarFile_";
  protected final String TEXT_15 = " : jarFiles_";
  protected final String TEXT_16 = ") {" + NL + "\t\tlibURL_";
  protected final String TEXT_17 = ".add( new java.io.File(jarFile_";
  protected final String TEXT_18 = ").toURI().toURL() );" + NL + "\t}" + NL + "}" + NL + "java.net.URL[] libURLArray_";
  protected final String TEXT_19 = " = libURL_";
  protected final String TEXT_20 = ".toArray(new java.net.URL[] {});" + NL + "ClassLoader threadClassLoader_";
  protected final String TEXT_21 = " = Thread.currentThread().getContextClassLoader();" + NL + "java.net.URLClassLoader newthreadClassLoader_";
  protected final String TEXT_22 = " = new java.net.URLClassLoader(libURLArray_";
  protected final String TEXT_23 = ", threadClassLoader_";
  protected final String TEXT_24 = ");" + NL + "Thread.currentThread().setContextClassLoader(newthreadClassLoader_";
  protected final String TEXT_25 = ");";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
    CodeGeneratorArgument codeGenArgument = (CodeGeneratorArgument) argument;
    INode node = (INode)codeGenArgument.getArgument();
    String cid = node.getUniqueName();
    List<Map<String, String>> hotLibs = (List<Map<String,String>>)ElementParameterParser.getObjectValue(node, "__HOTLIBS__");

    stringBuffer.append(TEXT_2);
     if(hotLibs!=null&&hotLibs.size() > 0){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_4);
     for(Map<String, String> item : hotLibs) {
    stringBuffer.append(TEXT_5);
    stringBuffer.append(item.get("LIBPATH") );
    stringBuffer.append(TEXT_6);
    }
    stringBuffer.append(TEXT_7);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_8);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_9);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_10);
    stringBuffer.append(cid );
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
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_18);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_19);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_20);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_21);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_22);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_23);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_24);
    stringBuffer.append(cid );
    stringBuffer.append(TEXT_25);
    }
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
