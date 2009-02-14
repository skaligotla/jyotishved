/**
 * 
 */
package com.google.code.jyotishved.model.planets;

import java.util.ArrayList;

import com.google.code.jyotishved.model.IZodiacSign;
import com.google.inject.Singleton;

/**
 * @author <a href='mailto:rahul.thakur.xdev@gmail.com'>Rahul Thakur</a>
 * @since 1.0
 * @version $Id$
 */
@Singleton
public final class Mercury extends AbstractPlanet {

	public Mercury() {
		super();
		// setup properties
		this.name = "Mercury";
		this.exaltationSign = null; // TODO
		this.fallSign = null; // TODO
		this.lordshipSigns = new ArrayList<IZodiacSign>(); // TODO
		this.siderealPeriod = 0.241F * 365.0F; // Covert to days
		this.synodicPeriod = 115.9F;
	}

}
