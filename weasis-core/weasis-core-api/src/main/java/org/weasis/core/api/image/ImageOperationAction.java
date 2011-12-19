/*******************************************************************************
 * Copyright (c) 2010 Nicolas Roduit.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse  License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nicolas Roduit - initial API and implementation
 ******************************************************************************/
package org.weasis.core.api.image;

import java.awt.image.RenderedImage;

import org.weasis.core.api.gui.ImageOperation;

public interface ImageOperationAction extends Cloneable {

    RenderedImage getRenderedImage(RenderedImage imageSource, ImageOperation imageOperation);

    RenderedImage getRenderedImageNode();

    String getOperationName();

    void clearNode();

    Object clone() throws CloneNotSupportedException;
}
