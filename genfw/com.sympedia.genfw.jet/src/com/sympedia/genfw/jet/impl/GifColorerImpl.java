/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.jet.impl;


import com.sympedia.genfw.impl.GeneratorImpl;
import com.sympedia.genfw.jet.GifColorer;
import com.sympedia.genfw.jet.JetPackage;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.codegen.ecore.genmodel.impl.GenBaseImpl;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gif Colorer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jet.impl.GifColorerImpl#getIconURL <em>Icon URL</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.impl.GifColorerImpl#getColorKey1 <em>Color Key1</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.impl.GifColorerImpl#getColorKey2 <em>Color Key2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GifColorerImpl extends GeneratorImpl implements GifColorer
{
  /**
   * The default value of the '{@link #getIconURL() <em>Icon URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconURL()
   * @generated
   * @ordered
   */
  protected static final String ICON_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIconURL() <em>Icon URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIconURL()
   * @generated
   * @ordered
   */
  protected String iconURL = ICON_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getColorKey1() <em>Color Key1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorKey1()
   * @generated
   * @ordered
   */
  protected static final String COLOR_KEY1_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColorKey1() <em>Color Key1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorKey1()
   * @generated
   * @ordered
   */
  protected String colorKey1 = COLOR_KEY1_EDEFAULT;

  /**
   * The default value of the '{@link #getColorKey2() <em>Color Key2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorKey2()
   * @generated
   * @ordered
   */
  protected static final String COLOR_KEY2_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColorKey2() <em>Color Key2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorKey2()
   * @generated
   * @ordered
   */
  protected String colorKey2 = COLOR_KEY2_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GifColorerImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EClass eStaticClass()
  {
    return JetPackage.Literals.GIF_COLORER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIconURL()
  {
    return iconURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIconURL(String newIconURL)
  {
    String oldIconURL = iconURL;
    iconURL = newIconURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JetPackage.GIF_COLORER__ICON_URL,
              oldIconURL, iconURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColorKey1()
  {
    return colorKey1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorKey1(String newColorKey1)
  {
    String oldColorKey1 = colorKey1;
    colorKey1 = newColorKey1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JetPackage.GIF_COLORER__COLOR_KEY1,
              oldColorKey1, colorKey1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColorKey2()
  {
    return colorKey2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorKey2(String newColorKey2)
  {
    String oldColorKey2 = colorKey2;
    colorKey2 = newColorKey2;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, JetPackage.GIF_COLORER__COLOR_KEY2,
              oldColorKey2, colorKey2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
    case JetPackage.GIF_COLORER__ICON_URL:
      return getIconURL();
    case JetPackage.GIF_COLORER__COLOR_KEY1:
      return getColorKey1();
    case JetPackage.GIF_COLORER__COLOR_KEY2:
      return getColorKey2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
    case JetPackage.GIF_COLORER__ICON_URL:
      setIconURL((String)newValue);
      return;
    case JetPackage.GIF_COLORER__COLOR_KEY1:
      setColorKey1((String)newValue);
      return;
    case JetPackage.GIF_COLORER__COLOR_KEY2:
      setColorKey2((String)newValue);
      return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
    case JetPackage.GIF_COLORER__ICON_URL:
      setIconURL(ICON_URL_EDEFAULT);
      return;
    case JetPackage.GIF_COLORER__COLOR_KEY1:
      setColorKey1(COLOR_KEY1_EDEFAULT);
      return;
    case JetPackage.GIF_COLORER__COLOR_KEY2:
      setColorKey2(COLOR_KEY2_EDEFAULT);
      return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
    case JetPackage.GIF_COLORER__ICON_URL:
      return ICON_URL_EDEFAULT == null ? iconURL != null : !ICON_URL_EDEFAULT.equals(iconURL);
    case JetPackage.GIF_COLORER__COLOR_KEY1:
      return COLOR_KEY1_EDEFAULT == null ? colorKey1 != null : !COLOR_KEY1_EDEFAULT
              .equals(colorKey1);
    case JetPackage.GIF_COLORER__COLOR_KEY2:
      return COLOR_KEY2_EDEFAULT == null ? colorKey2 != null : !COLOR_KEY2_EDEFAULT
              .equals(colorKey2);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (iconURL: ");
    result.append(iconURL);
    result.append(", colorKey1: ");
    result.append(colorKey1);
    result.append(", colorKey2: ");
    result.append(colorKey2);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    String iconURL = getIconURL();
    if (iconURL == null || iconURL.length() == 0) return null;
    String iconPath = FileLocator.toFileURL(new URL(iconURL)).getFile();

    String colorKey1 = getColorKey1();
    if (colorKey1 == null || colorKey1.length() == 0)
    {
      colorKey1 = null;
      if (inputObject instanceof String[])
      {
        String[] keys = (String[])inputObject;
        if (keys.length >= 1)
        {
          colorKey1 = keys[0];
        }
      }
    }

    String colorKey2 = getColorKey2();
    if (colorKey2 == null || colorKey2.length() == 0)
    {
      colorKey2 = null;
      if (inputObject instanceof String[])
      {
        String[] keys = (String[])inputObject;
        if (keys.length >= 2)
        {
          colorKey2 = keys[1];
        }
      }
    }

    return generateGIF(iconPath, colorKey1, colorKey2);
  }

  /**
   * @ADDED
   */
  protected byte[] generateGIF(String iconPath, String colorKey1, String colorKey2)
          throws ClassNotFoundException, SecurityException, NoSuchMethodException,
          IllegalArgumentException, InstantiationException, IllegalAccessException,
          InvocationTargetException
  {
    Class gifEmitterClass = Class.forName(GenBaseImpl.class.getName() + "$GIFEmitter");
    Constructor ctor = gifEmitterClass.getDeclaredConstructor(new Class[] {String.class});
    ctor.setAccessible(true);
    Object gifEmitter = ctor.newInstance(new Object[] {iconPath});
    ctor.setAccessible(false); // TODO try/finally

    Method method = gifEmitterClass.getDeclaredMethod("generateGIF", new Class[] {String.class,
            String.class});
    method.setAccessible(true);
    byte[] result = (byte[])method.invoke(gifEmitter, new Object[] {colorKey1, colorKey2});
    method.setAccessible(false); // TODO try/finally

    return result;
  }
} //GifColorerImpl
