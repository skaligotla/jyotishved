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
public final class Venus extends AbstractPlanet {

	public Venus() {
		super();
		// setup properties
		this.name = "Venus";
		this.exaltationSign = null; // TODO
		this.fallSign = null; // TODO
		this.lordshipSigns = new ArrayList<IZodiacSign>(); // TODO
		this.siderealPeriod = 0.615F * 365.0F; // Convert to days
		this.synodicPeriod = 583.9F;
	}

}
