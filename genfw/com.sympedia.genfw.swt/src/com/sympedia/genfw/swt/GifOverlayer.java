/**
 * <copyright>
 * </copyright>
 *
 * $Id: GifOverlayer.java,v 1.1 2006/03/06 07:56:47 stepper Exp $
 */
package com.sympedia.genfw.swt;


import com.sympedia.genfw.Generator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gif Overlayer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.swt.GifOverlayer#getOverlayURL <em>Overlay URL</em>}</li>
 *   <li>{@link com.sympedia.genfw.swt.GifOverlayer#isUnderlay <em>Underlay</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.swt.SwtPackage#getGifOverlayer()
 * @model
 * @generated
 */
public interface GifOverlayer extends Generator
{
  /**
   * Returns the value of the '<em><b>Overlay URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Overlay URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Overlay URL</em>' attribute.
   * @see #setOverlayURL(String)
   * @see com.sympedia.genfw.swt.SwtPackage#getGifOverlayer_OverlayURL()
   * @model
   * @generated
   */
  String getOverlayURL();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.swt.GifOverlayer#getOverlayURL <em>Overlay URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Overlay URL</em>' attribute.
   * @see #getOverlayURL()
   * @generated
   */
  void setOverlayURL(String value);

  /**
   * Returns the value of the '<em><b>Underlay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Underlay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Underlay</em>' attribute.
   * @see #setUnderlay(boolean)
   * @see com.sympedia.genfw.swt.SwtPackage#getGifOverlayer_Underlay()
   * @model
   * @generated
   */
  boolean isUnderlay();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.swt.GifOverlayer#isUnderlay <em>Underlay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Underlay</em>' attribute.
   * @see #isUnderlay()
   * @generated
   */
  void setUnderlay(boolean value);

} // GifOverlayer
