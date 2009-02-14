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
public final class Sun extends AbstractPlanet {

	public Sun() {
		super();
		// setup properties
		this.name = "Sun";
		this.exaltationSign = null; // TODO
		this.fallSign = null; // TODO
		this.lordshipSigns = new ArrayList<IZodiacSign>(); // TODO
		this.siderealPeriod = null; // TODO: Check!
		this.synodicPeriod = null; // TODO: Check!
	}

}
