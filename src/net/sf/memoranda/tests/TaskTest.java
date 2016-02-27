/*
  File:       TaskTest.java
  Author:     rbaker11
  Date:       02/27/2016

  Description:    Tests the Task getColor() and setColor() methods.
*/

package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.memoranda.Task;
import net.sf.memoranda.TaskImpl;
import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.util.Util;

import nu.xom.Attribute;
import nu.xom.Element;


/**
  Class:      TaskTest

  Description:    Tests the Task getColor() and setColor() methods.
*/
public class TaskTest {
  private Task t1;
  private Task t2;

  /**
   * Sets up before making the EventTest class
   * @throws Exception problem with setting up the class
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  /**
   * Tears down the after taking down the EventTest class
   * @throws Exception problem with tearing down the class
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  /**
   * Sets up the EventTest class
   * @throws Exception if there is a problem setting up
   */
  @Before
  public void setUp() throws Exception {
    t1 = createTask(new CalendarDate(5,1,2016),
                    new CalendarDate(6,1,2016),
                    "Test Task 1",
                    Task.PRIORITY_LOWEST,
                    0,
                    "Task Description.",
                    null);

    t2 = createTask(new CalendarDate(5,1,2016),
                    new CalendarDate(6,1,2016),
                    "Test Task 1",
                    Task.PRIORITY_LOWEST,
                    0,
                    "Task Description.",
                    null);
  }

  /**
   * Tears down the EventTest class
   * @throws Exception if there is a problem tearing down the class
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Tests the getColor() and setColor() methods in Task.
   */
  @Test
  public void getsetColorTest() {
    t1.setColor(9);
    t2.setColor(-5);
    assertTrue(t1.getColor() == 9);
    assertFalse(t2.getColor() == -5);
    t1.setColor(1);
    assertTrue(t1.getColor() == 1);
    assertTrue(t2.getColor() == -1);
  }

  private Task createTask(CalendarDate startDate, CalendarDate endDate, String text, int priority, long effort, String description, String parentTaskId) {
    Element el = new Element("task");
    el.addAttribute(new Attribute("startDate", startDate.toString()));
    el.addAttribute(new Attribute("endDate", endDate != null? endDate.toString():""));
    String id = Util.generateId();
    el.addAttribute(new Attribute("id", id));
    el.addAttribute(new Attribute("progress", "0"));
    el.addAttribute(new Attribute("effort", String.valueOf(effort)));
    el.addAttribute(new Attribute("priority", String.valueOf(priority)));

    Element txt = new Element("text");
    txt.appendChild(text);
    el.appendChild(txt);

    Element desc = new Element("description");
    desc.appendChild(description);
    el.appendChild(desc);

    return new TaskImpl(el, null);
  }
}
