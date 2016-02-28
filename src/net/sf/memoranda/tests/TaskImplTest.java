package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import net.sf.memoranda.Project;

public class TaskImplTest {
	
	/**
	 * Method: testGetNote
	 * 
	 * Description: This method tests the getNote() functionality of TaskImpl.
	 * 
	 * Additional information and analysis: 
	 * Because of the way Tasks are implemented in the program itself, it is
	 * difficult to create a Task (TaskImpl) purely individually. 
	 * Based on what I saw in the programs it is hard to implement a task without
	 * actually having that task written to file and saved.  So what I did was use
	 * the built in functionality with a null task list to assign and use a TaskImpl
	 * object to test it's getNote();
	 */
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
	
	/**
	 * Method: TestSetNote
	 * 
	 * Description: Tests to ensure setNote within TaskImpl works properly.
	 * 
	 * Additional Information: setNote is used in getNote but it does not explore
	 * both paths of 1) note already exists and 2) note does not exist in the list of children
	 * in Element.
	 */
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
		
		ti = null; //marked for garbage collection.
		el = null; //marked for garbage collection.
		/****End Second *****/
	}
	

}
