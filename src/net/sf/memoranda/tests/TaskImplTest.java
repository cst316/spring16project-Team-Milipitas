package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class TaskImplTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void TestGetNote() {
		String note = "this is a note";
		nu.xom.Element el = new nu.xom.Element("noteTest");
		el.addAttribute(new nu.xom.Attribute("note", note));
		net.sf.memoranda.TaskImpl ti = new net.sf.memoranda.TaskImpl(el, null);
		assertEquals(ti.getNote(), note);
	}
	
	@Test
	public void TestSetNote() {
		//First test tests if note already exists.
		String note = "this is a note";
		nu.xom.Element el = new nu.xom.Element("noteTest");
		el.addAttribute(new nu.xom.Attribute("note", note));
		net.sf.memoranda.TaskImpl ti = new net.sf.memoranda.TaskImpl(el, null);
		ti.setNote(note);
		
		assertEquals(ti.getNote(), note);
		
		ti = null;//marked for garbage collection
		el = null;//marked for garbage collection
		
		//Second test tests if note does not exist yet.
		el = new nu.xom.Element("noteTest2");
		ti = new net.sf.memoranda.TaskImpl(el, null);
		ti.setNote(note);
		assertEquals(ti.getNote(), note);
		
		ti = null;//marked for garbage collection
		el = null;//marked for garbage collection
	}
	

}
