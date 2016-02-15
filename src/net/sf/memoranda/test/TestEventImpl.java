/**
 * File: Test class for EventImpl
 */
package net.sf.memoranda.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author nnmeyer1
 *
 */
public class TestEventImpl {
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		_elem = new nu.xom.Element("test");
		_elem.addAttribute(new nu.xom.Attribute("note", "This is a note"));
		_el = new net.sf.memoranda.EventImpl(_elem);
	}

	/**
	 * 
	 */
	@Test
	public void testGetNote() {
		assertEquals("This is a note", _el.getNote());
	}

	private nu.xom.Element _elem;
	private net.sf.memoranda.EventImpl _el;
}
