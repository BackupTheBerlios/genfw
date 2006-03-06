/**
 * <copyright>
 * </copyright>
 *
 * $Id: GifOverlayerImpl.java,v 1.1 2006/03/06 07:56:47 stepper Exp $
 */
package com.sympedia.genfw.swt.impl;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.ImageLoader;

import com.sympedia.genfw.GenLib;
import com.sympedia.genfw.GenfwPackage;
import com.sympedia.genfw.impl.GeneratorImpl;
import com.sympedia.genfw.swt.GifOverlayer;
import com.sympedia.genfw.swt.SwtPackage;
import com.sympedia.genfw.swt.util.OverlayImageDescriptor;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gif Overlayer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sympedia.genfw.swt.impl.GifOverlayerImpl#getOverlayURL <em>Overlay URL</em>}</li>
 *   <li>{@link com.sympedia.genfw.swt.impl.GifOverlayerImpl#isUnderlay <em>Underlay</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GifOverlayerImpl extends GeneratorImpl implements GifOverlayer
{
  /**
   * The default value of the '{@link #getOverlayURL() <em>Overlay URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverlayURL()
   * @generated
   * @ordered
   */
  protected static final String OVERLAY_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOverlayURL() <em>Overlay URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOverlayURL()
   * @generated
   * @ordered
   */
  protected String overlayURL = OVERLAY_URL_EDEFAULT;

  /**
   * The default value of the '{@link #isUnderlay() <em>Underlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnderlay()
   * @generated
   * @ordered
   */
  protected static final boolean UNDERLAY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isUnderlay() <em>Underlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isUnderlay()
   * @generated
   * @ordered
   */
  protected boolean underlay = UNDERLAY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GifOverlayerImpl()
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
    return SwtPackage.eINSTANCE.getGifOverlayer();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOverlayURL()
  {
    return overlayURL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOverlayURL(String newOverlayURL)
  {
    String oldOverlayURL = overlayURL;
    overlayURL = newOverlayURL;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GIF_OVERLAYER__OVERLAY_URL,
              oldOverlayURL, overlayURL));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isUnderlay()
  {
    return underlay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnderlay(boolean newUnderlay)
  {
    boolean oldUnderlay = underlay;
    underlay = newUnderlay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SwtPackage.GIF_OVERLAYER__UNDERLAY,
              oldUnderlay, underlay));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass,
          NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
      case SwtPackage.GIF_OVERLAYER__ROOT:
        if (eContainer != null) msgs = eBasicRemoveFromContainer(msgs);
        return eBasicSetContainer(otherEnd, SwtPackage.GIF_OVERLAYER__ROOT, msgs);
      default:
        return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
      }
    }
    if (eContainer != null) msgs = eBasicRemoveFromContainer(msgs);
    return eBasicSetContainer(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass,
          NotificationChain msgs)
  {
    if (featureID >= 0)
    {
      switch (eDerivedStructuralFeatureID(featureID, baseClass))
      {
      case SwtPackage.GIF_OVERLAYER__ROOT:
        return eBasicSetContainer(null, SwtPackage.GIF_OVERLAYER__ROOT, msgs);
      default:
        return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
      }
    }
    return eBasicSetContainer(null, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain eBasicRemoveFromContainer(NotificationChain msgs)
  {
    if (eContainerFeatureID >= 0)
    {
      switch (eContainerFeatureID)
      {
      case SwtPackage.GIF_OVERLAYER__ROOT:
        return eContainer
                .eInverseRemove(this, GenfwPackage.GEN_LIB__GENERATORS, GenLib.class, msgs);
      default:
        return eDynamicBasicRemoveFromContainer(msgs);
      }
    }
    return eContainer
            .eInverseRemove(this, EOPPOSITE_FEATURE_BASE - eContainerFeatureID, null, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Object eGet(EStructuralFeature eFeature, boolean resolve)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
    case SwtPackage.GIF_OVERLAYER__ROOT:
      return getRoot();
    case SwtPackage.GIF_OVERLAYER__NAME:
      return getName();
    case SwtPackage.GIF_OVERLAYER__OVERLAY_URL:
      return getOverlayURL();
    case SwtPackage.GIF_OVERLAYER__UNDERLAY:
      return isUnderlay() ? Boolean.TRUE : Boolean.FALSE;
    }
    return eDynamicGet(eFeature, resolve);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eSet(EStructuralFeature eFeature, Object newValue)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
    case SwtPackage.GIF_OVERLAYER__ROOT:
      setRoot((GenLib)newValue);
      return;
    case SwtPackage.GIF_OVERLAYER__NAME:
      setName((String)newValue);
      return;
    case SwtPackage.GIF_OVERLAYER__OVERLAY_URL:
      setOverlayURL((String)newValue);
      return;
    case SwtPackage.GIF_OVERLAYER__UNDERLAY:
      setUnderlay(((Boolean)newValue).booleanValue());
      return;
    }
    eDynamicSet(eFeature, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void eUnset(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
    case SwtPackage.GIF_OVERLAYER__ROOT:
      setRoot((GenLib)null);
      return;
    case SwtPackage.GIF_OVERLAYER__NAME:
      setName(NAME_EDEFAULT);
      return;
    case SwtPackage.GIF_OVERLAYER__OVERLAY_URL:
      setOverlayURL(OVERLAY_URL_EDEFAULT);
      return;
    case SwtPackage.GIF_OVERLAYER__UNDERLAY:
      setUnderlay(UNDERLAY_EDEFAULT);
      return;
    }
    eDynamicUnset(eFeature);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean eIsSet(EStructuralFeature eFeature)
  {
    switch (eDerivedStructuralFeatureID(eFeature))
    {
    case SwtPackage.GIF_OVERLAYER__ROOT:
      return getRoot() != null;
    case SwtPackage.GIF_OVERLAYER__NAME:
      return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
    case SwtPackage.GIF_OVERLAYER__OVERLAY_URL:
      return OVERLAY_URL_EDEFAULT == null ? overlayURL != null : !OVERLAY_URL_EDEFAULT
              .equals(overlayURL);
    case SwtPackage.GIF_OVERLAYER__UNDERLAY:
      return underlay != UNDERLAY_EDEFAULT;
    }
    return eDynamicIsSet(eFeature);
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
    result.append(" (overlayURL: ");
    result.append(overlayURL);
    result.append(", underlay: ");
    result.append(underlay);
    result.append(')');
    return result.toString();
  }

  /**
   * @ADDED
   */
  public byte[] doGenerate(Object inputObject, String targetPath, IProgressMonitor monitor)
          throws Exception
  {
    String url = getOverlayURL();
    if (url == null || url.length() == 0) return null;
    URL overURL = new URL(url);
    // TODO add input path to context

    InputStream overStream = overURL.openStream();
    ImageData overData = loadImageData(overStream);
    if (overData == null) return null;

    URL baseURL = extractURL(inputObject);
    if (baseURL == null) return null;
    // TODO add input path to context

    InputStream baseStream = baseURL.openStream();
    ImageData baseData = loadImageData(baseStream);
    if (baseData == null) return null;

    OverlayImageDescriptor result = new OverlayImageDescriptor(baseData, overData, isUnderlay());

    ByteArrayOutputStream stream = new ByteArrayOutputStream();
    ImageLoader imageLoader = new ImageLoader();
    imageLoader.data = new ImageData[] {result.getImageData()};
    imageLoader.save(stream, SWT.IMAGE_GIF);

    return stream.toByteArray();
  }

  /**
   * @ADDED
   */
  protected ImageData loadImageData(InputStream inputStream) throws IOException
  {
    if (inputStream == null) return null;

    try
    {
      ImageLoader imageLoader = new ImageLoader();
      ImageData[] datas = imageLoader.load(inputStream);
      return datas[0];
    }
    finally
    {
      inputStream.close();
    }
  }
} //GifOverlayerImpl
