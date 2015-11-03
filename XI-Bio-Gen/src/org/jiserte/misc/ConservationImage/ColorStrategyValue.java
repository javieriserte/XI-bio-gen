package org.jiserte.misc.ConservationImage;

import org.jiserte.misc.ConservationImage.color.BlackColoringStrategy;
import org.jiserte.misc.ConservationImage.color.ColoringStrategy;
import org.jiserte.misc.ConservationImage.color.LightRedBlueColoringStrategy;
import org.jiserte.misc.ConservationImage.color.RedBlueColoringStrategy;
import cmdGA2.returnvalues.ReturnValueParser;

public class ColorStrategyValue extends ReturnValueParser<ColoringStrategy> {
	
	///////////////////////////////////////////
	// Class Constants
	public final String LIGHTREDBLUE = "LIGHTREDBLUE";
	public final String REDBLUE = "REDBLUE";
	public final String BLACK = "BLACK";
	///////////////////////////////////////////
	
	///////////////////////////////////////////
	// Public Interface
	@Override
	public ColoringStrategy parse(String token) {
	String st = token.trim();
		
		st = st.replaceAll("\"", "");
		st = st.replaceAll("\'", "");
		
		if (st.equalsIgnoreCase(BLACK)) {
			
			return new BlackColoringStrategy();
			
		} else 
			
		if (st.equalsIgnoreCase(LIGHTREDBLUE)) {
			
			return new LightRedBlueColoringStrategy();
			
		} else 
			
		if (st.equalsIgnoreCase(REDBLUE)) {
			
			return new RedBlueColoringStrategy();
			
		} else {
			
			return null;
			
		}
	}
	// End of Public Interface
	///////////////////////////////////////

}
