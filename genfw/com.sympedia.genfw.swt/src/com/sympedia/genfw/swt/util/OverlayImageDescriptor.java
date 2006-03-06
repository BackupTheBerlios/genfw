package com.sympedia.genfw.swt.util;


import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.Point;


public class OverlayImageDescriptor extends CompositeImageDescriptor
{
  private ImageData baseData;

  private ImageData overlayData;

  private Point size;

  private boolean underlay;

  public OverlayImageDescriptor(ImageData baseData, ImageData overlayData, boolean underlay)
  {
    this.baseData = baseData;
    this.overlayData = overlayData;
    this.underlay = underlay;

    final int width = Math.max(baseData.width, overlayData.width);
    final int height = Math.max(baseData.height, overlayData.height);
    size = new Point(width, height);
  }

  protected void drawCompositeImage(int width, int height)
  {
    if (underlay) drawImage(overlayData, 0, 0);
    drawImage(baseData, 0, 0);
    if (!underlay) drawImage(overlayData, 0, 0);
  }

  protected Point getSize()
  {
    return size;
  }
}
