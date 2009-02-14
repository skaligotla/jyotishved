/**
 * 
 */
package com.google.code.jyotishved.model;

import java.util.List;

/**
 * Specifies the contract for the behaviours we expect a Planet extension to
 * exhibit.
 * 
 * @author <a href='mailto:rahul.thakur.xdev@gmail.com'>Rahul Thakur</a>
 * @since 1.0
 * @version $Id$
 * @see For Sidereal/Synodic Periods <a
 *      href='http://en.wikipedia.org/wiki/Orbital_period'>See here</a>
 */
public interface IPlanet {

	/**
	 * Returns the name of the Planet as String.
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * Returns a list of {@link IZodiacSign} owned by this Planet.
	 * <p>
	 * A Planet has one or more {@link IZodiacSign} or House(s) that is the
	 * owner of. A Planet gives good results in its own sign.
	 * <p>
	 * Note, however, out of the 12 signs there is one where a Planet for give
	 * <b>Best</b> results - this known as sign of Exhaltation.
	 * 
	 * @return
	 */
	public List<IZodiacSign> getLordshipSigns();

	/**
	 * Out of the 12 signs there is one where a Planet for give <b>Best</b>
	 * results - this known as sign of Exhaltation.
	 * 
	 * @return
	 * @see IPlanet#getLordshipSigns()
	 */
	public IZodiacSign getExaltationSign();

	/**
	 * Out of the 12 signs there is one where a Planet for give <b>Worst</b>
	 * results - this known as sign of Fall.
	 * 
	 * @return
	 */
	public IZodiacSign getFallSign();

	/**
	 * The sidereal period is the time that it takes the object to make one full
	 * orbit around the Sun, relative to the stars. This is considered to be an
	 * object's true orbital period.
	 * <p>
	 * Sidereal period, as indicated by the accuracy of sidereal time, is an
	 * actual measure of a complete orbit relative to the stars (since the stars
	 * are unmoving - or at least moving very slowly).
	 * 
	 * @return Sidereal Period in days.
	 * @see <a href=
	 *      'http://astronomyonline.org/Science/SiderealSynodicPeriod.asp'>Sider
	 *      e a l /Synodic Periods</a>
	 */
	public Float getSiderealPeriod();

	/**
	 *The synodic period is the time that it takes for the object to reappear
	 * at the same point in the sky, relative to the Sun, as observed from
	 * Earth; i.e. returns to the same elongation (and planetary phase).
	 * <p>
	 * This is the time that elapses between two successive conjunctions with
	 * the Sun and is the object's Earth-apparent orbital period. The synodic
	 * period differs from the sidereal period since Earth itself revolves
	 * around the Sun.
	 * 
	 * @return Synodic period in Days.
	 * @see <a href=
	 *      'http://astronomyonline.org/Science/SiderealSynodicPeriod.asp'>Sidere
	 *      a l / S y n o d i c Period</a>
	 */
	public Float getSynodicPeriod();

}
