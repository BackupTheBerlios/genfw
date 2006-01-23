package com.sympedia.density.gen;

import java.util.*;
import org.eclipse.emf.common.util.*;
import org.eclipse.emf.ecore.*;
import com.sympedia.density.gen.deploy.*;

public class ContainerBase
{
  protected static String nl;
  public static synchronized ContainerBase create(String lineSeparator)
  {
    nl = lineSeparator;
    ContainerBase result = new ContainerBase();
    nl = null;
    return result;
  }

  protected final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package ";
  protected final String TEXT_2 = ".impl;" + NL + "" + NL + "" + NL + "import ";
  protected final String TEXT_3 = ".*;" + NL + "import com.sympedia.density.*;" + NL + "import com.sympedia.density.impl.*;" + NL + "import com.sympedia.util.*;" + NL + "import java.util.*;" + NL + "" + NL + "" + NL + "public class ";
  protected final String TEXT_4 = NL + "  extends Container_Base" + NL + "  implements I";
  protected final String TEXT_5 = NL + "{" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Cached contexts" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_6 = NL + "  private ";
  protected final String TEXT_7 = "Context ";
  protected final String TEXT_8 = "Context;" + NL;
  protected final String TEXT_9 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Object creation and lyfecycle" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "" + NL + "  public ";
  protected final String TEXT_10 = "()" + NL + "  {" + NL + "    super(\"";
  protected final String TEXT_11 = "\", \"";
  protected final String TEXT_12 = "\", ";
  protected final String TEXT_13 = "true";
  protected final String TEXT_14 = "false";
  protected final String TEXT_15 = ");" + NL + "  }" + NL + "" + NL + "  protected List<IContext> createContexts()" + NL + "  {" + NL + "    List<IContext> contexts = new ArrayList<IContext>();";
  protected final String TEXT_16 = NL + "    contexts.add(";
  protected final String TEXT_17 = "Context = create";
  protected final String TEXT_18 = "Context());";
  protected final String TEXT_19 = NL + "    return contexts;" + NL + "  }";
  protected final String TEXT_20 = NL + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Public accessor methods for the component instances" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_21 = NL + "  public final ";
  protected final String TEXT_22 = " get";
  protected final String TEXT_23 = "()" + NL + "  {" + NL + "    List<IComponent> toBeInitialized = new ArrayList<IComponent>();";
  protected final String TEXT_24 = NL + "    ";
  protected final String TEXT_25 = " result = doGet";
  protected final String TEXT_26 = "(toBeInitialized);" + NL + "    initializeInstances(toBeInitialized);" + NL + "    return result;" + NL + "  }" + NL;
  protected final String TEXT_27 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Internal accessor methods for the component instances" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_28 = NL + "  protected ";
  protected final String TEXT_29 = " doGet";
  protected final String TEXT_30 = "(List<IComponent> toBeInitialized)" + NL + "  {" + NL + "    return (";
  protected final String TEXT_31 = ")";
  protected final String TEXT_32 = "Context.getInstance(toBeInitialized);" + NL + "  }" + NL;
  protected final String TEXT_33 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Internal context creation methods" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_34 = NL + "  protected ";
  protected final String TEXT_35 = "Context create";
  protected final String TEXT_36 = "Context()" + NL + "  {" + NL + "    return new ";
  protected final String TEXT_37 = "Context(this);" + NL + "  }" + NL;
  protected final String TEXT_38 = NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL + "  // Internal IContext classes" + NL + "  /////////////////////////////////////////////////////////////////////////////////////" + NL;
  protected final String TEXT_39 = NL + "  public static class ";
  protected final String TEXT_40 = "Context" + NL + "    extends ";
  protected final String TEXT_41 = "Singleton";
  protected final String TEXT_42 = "Prototype";
  protected final String TEXT_43 = "Context_Base" + NL + "    implements ";
  protected final String TEXT_44 = ".IContext" + NL + "  {" + NL + "    public ";
  protected final String TEXT_45 = "Context(IContainer container)" + NL + "    {" + NL + "      super(container, \"";
  protected final String TEXT_46 = "\", ";
  protected final String TEXT_47 = ", ";
  protected final String TEXT_48 = ");" + NL + "    }" + NL + "" + NL + "    public IComponent createInstance()" + NL + "    {";
  protected final String TEXT_49 = NL + "      ";
  protected final String TEXT_50 = " instance = new ";
  protected final String TEXT_51 = "();" + NL + "      instance.setContext(this);" + NL + "      return instance;" + NL + "    }" + NL + "" + NL + "    public void populateInstance(IComponent instance, List<IComponent> toBeInitialized)" + NL + "    {";
  protected final String TEXT_52 = NL + "      ((";
  protected final String TEXT_53 = ")instance).set";
  protected final String TEXT_54 = "(";
  protected final String TEXT_55 = ");";
  protected final String TEXT_56 = NL + "      ((";
  protected final String TEXT_57 = ")instance).set";
  protected final String TEXT_58 = "(((";
  protected final String TEXT_59 = "Impl)getContainer()).doGet";
  protected final String TEXT_60 = "(toBeInitialized));";
  protected final String TEXT_61 = NL + "    }";
  protected final String TEXT_62 = NL;
  protected final String TEXT_63 = NL + "    public ";
  protected final String TEXT_64 = " ";
  protected final String TEXT_65 = "(List<IComponent> toBeInitialized)" + NL + "    {" + NL + "      // TODO NOT OK for singletons ;-(" + NL + "      PrototypeContext_Base context = ((";
  protected final String TEXT_66 = "_Base)getContainer()).";
  protected final String TEXT_67 = "Context;" + NL + "      IComponent instance = context.createInstance();" + NL + "      context.addInstance(instance);" + NL + "      toBeInitialized.add(instance);" + NL + "      return (";
  protected final String TEXT_68 = ")instance;" + NL + "    }";
  protected final String TEXT_69 = NL + NL + "\t@Override" + NL + "    public void notifyComponentInitialized(IComponent instance) throws Exception" + NL + "    {" + NL + "      super.notifyComponentInitialized(instance);";
  protected final String TEXT_70 = NL + "      ((";
  protected final String TEXT_71 = ")instance).get";
  protected final String TEXT_72 = "().addEventListener(instance);";
  protected final String TEXT_73 = NL + "      ((IMDE)getContainer()).get";
  protected final String TEXT_74 = "().addEventListener(instance);";
  protected final String TEXT_75 = NL + "    }" + NL + "" + NL + "\t@Override" + NL + "    public void notifyComponentDisposed(IComponent instance) throws Exception" + NL + "    {";
  protected final String TEXT_76 = NL + "      ((";
  protected final String TEXT_77 = ")instance).get";
  protected final String TEXT_78 = "().removeEventListener(instance);";
  protected final String TEXT_79 = NL + "      ((IMDE)getContainer()).get";
  protected final String TEXT_80 = "().removeEventListener(instance);";
  protected final String TEXT_81 = NL + "      BeanHelper.dispose(((";
  protected final String TEXT_82 = ")instance).get";
  protected final String TEXT_83 = "());";
  protected final String TEXT_84 = NL + "      super.notifyComponentDisposed(instance);" + NL + "    }" + NL + "  }";
  protected final String TEXT_85 = NL + "}";
  protected final String TEXT_86 = NL;

  public String generate(Object argument)
  {
    StringBuffer stringBuffer = new StringBuffer();
    
/***************************************************************************
 * Copyright (c) 2006 Eike Stepper, Fuggerstr. 39, 10777 Berlin, Germany.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Eike Stepper - initial API and implementation
 **************************************************************************/

Container container = (Container)argument;
EList allDeployments = container.getAllDeployments();
EList deployments = DeploymentSorter.sort(allDeployments);

    stringBuffer.append(TEXT_1);
    stringBuffer.append(container.getPackageName());
    stringBuffer.append(TEXT_2);
    stringBuffer.append(container.getPackageName());
    stringBuffer.append(TEXT_3);
    stringBuffer.append(GenUtil.getContainerName(container));
    stringBuffer.append(TEXT_4);
    stringBuffer.append(container.getName());
    stringBuffer.append(TEXT_5);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_6);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(deployment.getId());
    stringBuffer.append(TEXT_8);
    }
    stringBuffer.append(TEXT_9);
    stringBuffer.append(GenUtil.getContainerName(container));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(container.getName());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(container.getPackageName());
    stringBuffer.append(TEXT_12);
    if (container.isIncomplete()) {
    stringBuffer.append(TEXT_13);
    } else {
    stringBuffer.append(TEXT_14);
    }
    stringBuffer.append(TEXT_15);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_16);
    stringBuffer.append(deployment.getId());
    stringBuffer.append(TEXT_17);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_18);
    }
    stringBuffer.append(TEXT_19);
    if (!deployments.isEmpty()) {
    stringBuffer.append(TEXT_20);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_21);
    stringBuffer.append(GenUtil.getTypeName(deployment.getComponent()));
    stringBuffer.append(TEXT_22);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(TEXT_24);
    stringBuffer.append(GenUtil.getTypeName(deployment.getComponent()));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_26);
    }
    stringBuffer.append(TEXT_27);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_28);
    stringBuffer.append(GenUtil.getTypeName(deployment.getComponent()));
    stringBuffer.append(TEXT_29);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(GenUtil.getTypeName(deployment.getComponent()));
    stringBuffer.append(TEXT_31);
    stringBuffer.append(deployment.getId());
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next();
    stringBuffer.append(TEXT_34);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_35);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_36);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_37);
    }
    }
    if (!deployments.isEmpty()) {
    stringBuffer.append(TEXT_38);
    for (Iterator it = deployments.iterator(); it.hasNext();) { Deployment deployment = (Deployment)it.next(); String className = GenUtil.getFullPackageName(deployment.getComponent().getEPackage()) + ".impl." + deployment.getComponent().getName() + "Impl";
    stringBuffer.append(TEXT_39);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_40);
    if (deployment.isSingleton()) {
    stringBuffer.append(TEXT_41);
    } else {
    stringBuffer.append(TEXT_42);
    }
    stringBuffer.append(TEXT_43);
    stringBuffer.append(GenUtil.getFullAbstractBaseName(deployment.getComponent()));
    stringBuffer.append(TEXT_44);
    stringBuffer.append(GenUtil.capitalize(deployment.getId()));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(deployment.getId());
    stringBuffer.append(TEXT_46);
    stringBuffer.append(Boolean.toString(deployment.isInitialized()));
    if (deployment.isSingleton()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(Boolean.toString(deployment.isLazy()));
    }
    stringBuffer.append(TEXT_48);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_50);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_51);
    for (Iterator it2 = deployment.getDependencies().iterator(); it2.hasNext();) { 
      Dependency dep = (Dependency)it2.next();
      if (dep instanceof Parameter) { 
        Parameter parm = (Parameter)dep;
    stringBuffer.append(TEXT_52);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_53);
    stringBuffer.append(GenUtil.capitalize(parm.getFeature().getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(parm.getValueString());
    stringBuffer.append(TEXT_55);
    } else { 
        Reference ref = (Reference)dep; 
        if (GenUtil.isNormalDependency(ref.getFeature())) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_57);
    stringBuffer.append(GenUtil.capitalize(ref.getFeature().getName()));
    stringBuffer.append(TEXT_58);
    stringBuffer.append(container.getName());
    stringBuffer.append(TEXT_59);
    stringBuffer.append(GenUtil.capitalize(ref.getTarget().getId()));
    stringBuffer.append(TEXT_60);
    }
    }
    }
    stringBuffer.append(TEXT_61);
    if (!deployment.getCreators().isEmpty()) {
    stringBuffer.append(TEXT_62);
    for (Iterator it2 = deployment.getCreators().iterator(); it2.hasNext();) { Creator creator = (Creator)it2.next();
    stringBuffer.append(TEXT_63);
    stringBuffer.append(GenUtil.getTypeName(creator.getOperation().getEType()));
    stringBuffer.append(TEXT_64);
    stringBuffer.append(creator.getOperation().getName());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(container.getName());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(creator.getProduct().getId());
    stringBuffer.append(TEXT_67);
    stringBuffer.append(GenUtil.getTypeName(creator.getOperation().getEType()));
    stringBuffer.append(TEXT_68);
    stringBuffer.append(GenUtil.newline(it2.hasNext()));
    }
    }
    stringBuffer.append(TEXT_69);
    for (Iterator it2 = deployment.getDependencies().iterator(); it2.hasNext();) { Dependency dep = (Dependency)it2.next();
    if (dep instanceof Reference) { Reference ref = (Reference)dep; if (ref.isListen()) {
    stringBuffer.append(TEXT_70);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_71);
    stringBuffer.append(GenUtil.capitalize(ref.getFeature().getName()));
    stringBuffer.append(TEXT_72);
    }}
    }
    for (Iterator it2 = deployment.getListeners().iterator(); it2.hasNext();) { Listener listener = (Listener)it2.next();
    stringBuffer.append(TEXT_73);
    stringBuffer.append(GenUtil.capitalize(listener.getNotifier().getId()));
    stringBuffer.append(TEXT_74);
    }
    stringBuffer.append(TEXT_75);
    for (Iterator it2 = deployment.getDependencies().iterator(); it2.hasNext();) { Dependency dep = (Dependency)it2.next();
    if (dep instanceof Reference) { Reference ref = (Reference)dep; if (ref.isListen()) {
    stringBuffer.append(TEXT_76);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(GenUtil.capitalize(ref.getFeature().getName()));
    stringBuffer.append(TEXT_78);
    }}
    }
    for (Iterator it2 = deployment.getListeners().iterator(); it2.hasNext();) { Listener listener = (Listener)it2.next();
    stringBuffer.append(TEXT_79);
    stringBuffer.append(GenUtil.capitalize(listener.getNotifier().getId()));
    stringBuffer.append(TEXT_80);
    }
    for (Iterator it2 = deployment.getDependencies().iterator(); it2.hasNext();) { Dependency dep = (Dependency)it2.next();
    if (dep instanceof Reference) { Reference ref = (Reference)dep; if (ref.getTarget().isPrototype() && GenUtil.isNormalDependency(ref.getFeature())) {
    stringBuffer.append(TEXT_81);
    stringBuffer.append(className);
    stringBuffer.append(TEXT_82);
    stringBuffer.append(GenUtil.capitalize(ref.getFeature().getName()));
    stringBuffer.append(TEXT_83);
    }}
    }
    stringBuffer.append(TEXT_84);
    stringBuffer.append(GenUtil.newline(it.hasNext()));
    }
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(TEXT_86);
    return stringBuffer.toString();
  }
}
