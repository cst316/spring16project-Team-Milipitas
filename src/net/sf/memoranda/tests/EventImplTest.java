package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

//import nu.xom.Element;

public class EventImplTest {
	
	/**
	 * Method: testGetNote
	 * 
	 * Description: Tests getNote in EventImpl
	 */
	@Test
	public void testGetNote() {
		nu.xom.Element e = new nu.xom.Element("testNoteElement");
		e.addAttribute(new nu.xom.Attribute("note", "This is a note"));
		net.sf.memoranda.EventImpl el = new net.sf.memoranda.EventImpl(e);
		assertEquals(el.getNote(), "This is a note");
	}

	/**
	 * Method: testGetNote
	 * 
	 * Description: Tests getEmail in EventImpl.
	 */
	@Test
	public void testGetEmail() {
		nu.xom.Element e = new nu.xom.Element("testEmailElement");
		e.addAttribute(new nu.xom.Attribute("email", "thisisanemail@gmail.com"));
		net.sf.memoranda.EventImpl el = new net.sf.memoranda.EventImpl(e);
		assertEquals(el.getEmail(), "thisisanemail@gmail.com");
	}
}
