/**
 * 
 */
package com.google.code.jyotishved.model.planets;

import java.util.List;

import com.google.code.jyotishved.model.IPlanet;
import com.google.code.jyotishved.model.IZodiacSign;

/**
 * Extensions should set the properties to appropriate values.
 * 
 * @author <a href='mailto:rahul.thakur.xdev@gmail.com'>Rahul Thakur</a>
 * @since 1.0
 * @version $Id$S
 */
public abstract class AbstractPlanet implements IPlanet {

	/**
	 * Name of the Planet.
	 */
	protected String name;

	/**
	 * House/Zodiac Sign of Lordship.
	 */
	protected List<IZodiacSign> lordshipSigns;

	/**
	 * House/Zodiac Sign of exhaltation.
	 */
	protected IZodiacSign exaltationSign;

	/**
	 * House/Zodiac Sign of fall.
	 */
	protected IZodiacSign fallSign;

	protected Float siderealPeriod;

	protected Float synodicPeriod;

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getExaltationSign()
	 */
	@Override
	public IZodiacSign getExaltationSign() {
		return this.exaltationSign;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getFallSign()
	 */
	@Override
	public IZodiacSign getFallSign() {
		return this.fallSign;
	}

	/**
	 * {@inheritDoc}S
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getLordshipSigns()
	 */
	@Override
	public List<IZodiacSign> getLordshipSigns() {
		return this.lordshipSigns;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getName()
	 */
	@Override
	public String getName() {
		return this.name;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getSiderealPeriod()
	 */
	@Override
	public Float getSiderealPeriod() {
		return this.siderealPeriod;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.google.code.jyotishved.model.IPlanet#getSynodicPeriod()
	 */
	@Override
	public Float getSynodicPeriod() {
		return this.synodicPeriod;
	}

}
