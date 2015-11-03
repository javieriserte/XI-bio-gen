package org.jiserte.misc.ConservationImage.renderer;

import java.awt.image.BufferedImage;

import org.jiserte.misc.ConservationImage.color.ColoringStrategy;

public interface Renderer {

	public BufferedImage 		render								(ColoringStrategy color, double[] data, int windowLen);

	public DrawingLayout      getDefaultLayout                    ();

	public void setLayout(DrawingLayout layout);
	
	public boolean isDefault();
	
	public void setDefault(boolean isDefault);
	
}
