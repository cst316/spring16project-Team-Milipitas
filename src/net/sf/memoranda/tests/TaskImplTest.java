package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.memoranda.Project;

public class TaskImplTest {

	/*@Test
	public void test() {
		fail("Not yet implemented");
	}*/
	
	@Test
	public void TestGetNote() {
		/*el.addAttribute(new nu.xom.Attribute("note", note));
		net.sf.memoranda.TaskImpl ti = new net.sf.memoranda.TaskImpl(el, null);
		assertEquals(ti.getNote(), note);*/
		
		String note = "this is a note";
		nu.xom.Element el = new nu.xom.Element("note");
		net.sf.memoranda.TaskImpl ti = new net.sf.memoranda.TaskImpl(el, null);
		ti.setNote(note);
		assertEquals(ti.getNote(), note);
	}
	
	@Test
	public void TestSetNote() {
		
		//First tests when note does not already exists.
		/****Begin First *****/
		String note = "this is a note";
		String note2 = "this is a second note";
		nu.xom.Element el = new nu.xom.Element("anyname");
		net.sf.memoranda.TaskImpl ti = new net.sf.memoranda.TaskImpl(el, null);
		ti.setNote(note);
		assertEquals(ti.getNote(), note);
		
		ti = null; //marked for garbage collection.
		el = null; //marked for garbage collection.
		/****End First *****/
		
		
		//Second tests when note already exists.
		/****Begin Second *****/
		el = new nu.xom.Element("note");
		ti = new net.sf.memoranda.TaskImpl(el, null);
		ti.setNote(note);
		ti.setNote(note2);
		assertEquals(ti.getNote(), note2);
		
		ti = null;
		el = null;
		/****End Second *****/
	}
	

}
