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
package com.sympedia.genfw.presentation;


import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;


public class MultiLineDialog extends TitleAreaDialog
{
  protected ILabelProvider labelProvider;

  protected EObject object;

  protected EStructuralFeature feature;

  protected String displayName;

  private String result;

  private Control textArea;

  public MultiLineDialog(Shell parentShell, ILabelProvider labelProvider, EObject object,
          EStructuralFeature feature, String value, String displayName)
  {
    super(parentShell);
    setShellStyle(getShellStyle() | SWT.RESIZE);
    this.labelProvider = labelProvider;
    this.object = object;
    this.feature = feature;
    this.displayName = displayName;
    result = value;
  }

  public String getResult()
  {
    return result;
  }

  protected void configureShell(Shell shell)
  {
    super.configureShell(shell);
    shell.setText(displayName);
    shell.setImage(labelProvider.getImage(feature));
    shell.setSize(600, 500);
  }

  protected Control createDialogArea(Composite parent)
  {
    Composite mainArea = (Composite)super.createDialogArea(parent);

    Composite control = new Composite(mainArea, SWT.NONE);
    control.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    GridLayout layout = new GridLayout();
    layout.marginLeft = IDialogConstants.BUTTON_MARGIN;
    layout.marginTop = IDialogConstants.BUTTON_MARGIN;
    layout.marginRight = IDialogConstants.BUTTON_MARGIN;
    layout.marginBottom = IDialogConstants.BUTTON_MARGIN;
    control.setLayout(layout);

    initializeDialogUnits(control);

    textArea = createTextControl(control);
    textArea.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

    setTitle(displayName);
    setMessage("Edit the " + displayName + " property of the " + object.eClass().getName() + ".");

    Dialog.applyDialogFont(mainArea);
    return mainArea;
  }

  protected Control createTextControl(Composite control)
  {
    Text text = new Text(control, SWT.MULTI | SWT.WRAP | SWT.V_SCROLL | SWT.BORDER);
    if (result != null) text.setText(result);
    return text;
  }

  @Override
  protected void okPressed()
  {
    result = getTextValue();
    super.okPressed();
  }

  protected String getTextValue()
  {
    return ((Text)textArea).getText();
  }
}
