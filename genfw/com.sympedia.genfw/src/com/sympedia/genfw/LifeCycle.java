/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sympedia.genfw;


import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Cycle</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see com.sympedia.genfw.GenfwPackage#getLifeCycle()
 * @model abstract="true"
 *        annotation="http://www.topcased.org/uuid uuid='1138872040968290'"
 * @generated
 */
public interface LifeCycle extends EObject
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model genappAnnotation="http://www.topcased.org/uuid uuid='113887234659333'"
   *        annotation="http://www.topcased.org/uuid uuid='1138872040968291'"
   * @generated
   */
  void initialize(GenApp genapp) throws Exception;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model genappAnnotation="http://www.topcased.org/uuid uuid='113887234659337'"
   *        annotation="http://www.topcased.org/uuid uuid='1138872040968292'"
   * @generated
   */
  void dispose(GenApp genapp);

} // LifeCycle
