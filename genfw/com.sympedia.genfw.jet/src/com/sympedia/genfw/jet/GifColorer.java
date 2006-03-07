/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw.jet;


import com.sympedia.genfw.Generator;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gif Colorer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sympedia.genfw.jet.GifColorer#getIconURL <em>Icon URL</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.GifColorer#getColorKey1 <em>Color Key1</em>}</li>
 *   <li>{@link com.sympedia.genfw.jet.GifColorer#getColorKey2 <em>Color Key2</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sympedia.genfw.jet.JetPackage#getGifColorer()
 * @model
 * @generated
 */
public interface GifColorer extends Generator
{
  /**
   * Returns the value of the '<em><b>Icon URL</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon URL</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon URL</em>' attribute.
   * @see #setIconURL(String)
   * @see com.sympedia.genfw.jet.JetPackage#getGifColorer_IconURL()
   * @model required="true"
   * @generated
   */
  String getIconURL();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jet.GifColorer#getIconURL <em>Icon URL</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon URL</em>' attribute.
   * @see #getIconURL()
   * @generated
   */
  void setIconURL(String value);

  /**
   * Returns the value of the '<em><b>Color Key1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Key1</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Key1</em>' attribute.
   * @see #setColorKey1(String)
   * @see com.sympedia.genfw.jet.JetPackage#getGifColorer_ColorKey1()
   * @model
   * @generated
   */
  String getColorKey1();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jet.GifColorer#getColorKey1 <em>Color Key1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Key1</em>' attribute.
   * @see #getColorKey1()
   * @generated
   */
  void setColorKey1(String value);

  /**
   * Returns the value of the '<em><b>Color Key2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color Key2</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color Key2</em>' attribute.
   * @see #setColorKey2(String)
   * @see com.sympedia.genfw.jet.JetPackage#getGifColorer_ColorKey2()
   * @model
   * @generated
   */
  String getColorKey2();

  /**
   * Sets the value of the '{@link com.sympedia.genfw.jet.GifColorer#getColorKey2 <em>Color Key2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color Key2</em>' attribute.
   * @see #getColorKey2()
   * @generated
   */
  void setColorKey2(String value);

} // GifColorer
