/**
 * 
 */
package com.google.code.jyotishved;

import static org.junit.Assert.fail;
import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.google.code.jyotishved.model.planets.Sun;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * @author <a href='mailto:rahul.thakur.xdev@gmail.com'>Rahul Thakur</a>
 * @since 1.0
 * @version $Id$
 */
public class TestPlanet {

	@Inject
	Sun sun;

	@Before
	public void setUp() {
		PlanetsModule coreMOdule = new PlanetsModule();
		Injector injector = Guice.createInjector(coreMOdule);
		injector.injectMembers(this);
	}

	/**
	 * Test method for
	 * {@link com.google.code.jyotishved.model.IPlanet#getName()}.
	 */
	@Test
	public void testName() {
		Assert.assertEquals("Sun", sun.getName());
	}

	/**
	 * Test method for
	 * {@link com.google.code.jyotishved.model.IPlanet#getLordshipSigns()}.
	 */
	@Test
	public void testGetLordshipSigns() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.google.code.jyotishved.model.IPlanet#getExaltationSign()}.
	 */
	@Test
	public void testGetExaltationSign() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.google.code.jyotishved.model.IPlanet#getFallSign()}.
	 */
	@Test
	public void testGetFallSign() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSynodicPeriod() {
		Assert.assertEquals(null, sun.getSynodicPeriod());
	}

	@Test
	public void testGetSiderealPeriod() {
		Assert.assertEquals(null, sun.getSiderealPeriod());
	}

}
