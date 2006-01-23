package com.sympedia.density.gen;

import com.sympedia.density.gen.arch.*;

public class ManifestMf
{
  protected static String nl;
  public static synchronized ManifestMf create(String lineSeparator)
  {
    nl = lineSeparator;
    ManifestMf result = new ManifestMf();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "Manifest-Version: 1.0" + NL + "Bundle-ManifestVersion: 2" + NL + "Bundle-Name: XXX Plug-in" + NL + "Bundle-SymbolicName: ";
  protected final String TEXT_2 = NL + "Bundle-Version: 1.0.0" + NL + "Bundle-Vendor: SYMPEDIA" + NL + "Bundle-Localization: plugin" + NL + "Require-Bundle: com.sympedia.density;visibility:=reexport" + NL + "Export-Package: ";
  protected final String TEXT_3 = ",";
  protected final String TEXT_4 = NL + " ";
  protected final String TEXT_5 = ".internal";
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
PluginProject project = (PluginProject)argument;

    stringBuffer.append(TEXT_1);
    stringBuffer.append(project.getProjectName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(project.getProjectName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(TEXT_4);
    stringBuffer.append(project.getProjectName());
    stringBuffer.append(TEXT_5);
    stringBuffer.append(TEXT_6);
    return stringBuffer.toString();
  }
}
