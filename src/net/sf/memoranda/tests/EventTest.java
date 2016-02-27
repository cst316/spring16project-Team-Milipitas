/*
  File:       EventTest.java
  Author:     rbaker11
  Date:       02/27/2016

  Description:    Tests the Event class's methods.
*/

package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.Event;
import net.sf.memoranda.EventsManager;

/**
  Class:      EventTest

  Description:    Tests the Event class's methods.
*/
public class EventTest {
  private Event e1;
  private Event e2;
  private Event e3;

  private Event e4;
  private Event e5;
  private Event e6;

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
    e1 = EventsManager.createEvent(new CalendarDate(10,2,2016),
                                    12,
                                    0,
                                    "Test Event 1: Good Email",
                                    "cst316milpitas@gmail.com",
                                    "");
    e2 = EventsManager.createEvent(new CalendarDate(11,2,2016),
                                    9,
                                    0,
                                    "Test Event 2: Bad Email",
                                    "@@@@@",
                                    "");
    e3 = EventsManager.createEvent(new CalendarDate(12,5,2016),
                                    12,
                                    0,
                                    "Test Event 3: Note",
                                    "This is a sample note.");


    e4 = EventsManager.createRepeatableEvent(EventsManager.REPEAT_DAILY,
                                              new CalendarDate(10,2,2016),
                                              new CalendarDate(11,2,2016),
                                              0,
                                              12,
                                              0,
                                              "Test Event 4: Repeat Daily",
                                              "",
                                              false);

    e5 = EventsManager.createRepeatableEvent(EventsManager.REPEAT_YEARLY,
                                              new CalendarDate(5,1,2016),
                                              new CalendarDate(5,1,2020),
                                              1,
                                              10,
                                              30,
                                              "Test Event 5: Repeat Yearly",
                                              "cscscscs..com",
                                              "",
                                              true);

    e6 = EventsManager.createRepeatableEvent(EventsManager.REPEAT_WEEKLY,
                                              new CalendarDate(5,1,2016),
                                              new CalendarDate(1,1,2018),
                                              2,
                                              18,
                                              37,
                                              "Test Event 6: Repeat Weekly",
                                              "Another Sample Note",
                                              false);
  }

  /**
   * Tears down the EventTest class
   * @throws Exception if there is a problem tearing down the class
   */
  @After
  public void tearDown() throws Exception {
  }

  /**
   * Tests the getID() method of Event.
   */
  @Test
  public void getIdTest() {
    String temp = e1.getId();
    assertTrue(e1.getId() == temp);

    temp = e2.getId();
    assertTrue(e2.getId() == temp);

    assertFalse(e3.getId() == temp);

    assertFalse(e4.getId() == temp);

    temp = e5.getId();
    assertTrue(e5.getId() == temp);

    temp = e6.getId();
    assertTrue(e6.getId() == temp);
  }

  /**
   * Tests the getHour() method of Event.
   */
  @Test
  public void getHourTest() {
    assertTrue(e1.getHour() == 12);
    assertTrue(e2.getHour() == 9);
    assertFalse(e3.getHour() == 9);

    assertFalse(e4.getHour() == 10);
    assertTrue(e5.getHour() == 10);
    assertTrue(e6.getHour() == 18);
  }

  /**
   * Tests the getMinute() method of Event.
   */
  @Test
  public void getMinuteTest() {
    assertTrue(e1.getMinute() == 0);
    assertFalse(e2.getMinute() == 10);
    assertTrue(e3.getMinute() == 0);

    assertFalse(e4.getMinute() == 30);
    assertTrue(e5.getMinute() == 30);
    assertTrue(e6.getMinute() == 37);
  }

  /**
   * Tests the getText() method of Event.
   */
  @Test
  public void getTextTest() {
    assertTrue(e1.getText().equals("Test Event 1: Good Email"));
    assertTrue(e2.getText().equals("Test Event 2: Bad Email"));
    assertFalse(e3.getText().equals(""));

    assertTrue(e4.getText().equals("Test Event 4: Repeat Daily"));
    assertFalse(e5.getText().equals("Test Event 4: Repeat Daily"));
    assertTrue(e6.getText().equals("Test Event 6: Repeat Weekly"));
  }

  /**
   * Tests the getNote() method of Event.
   */
  @Test
  public void getNoteTest() {
    assertTrue(e1.getNote().equals(""));
    assertFalse(e2.getNote().equals("This is a sample note."));
    assertTrue(e3.getNote().equals("This is a sample note."));

    assertTrue(e4.getNote().equals(""));
    assertFalse(e5.getNote().equals("Another Sample Note"));
    assertTrue(e6.getNote().equals("Another Sample Note"));
  }

  /**
   * Tests the getRepeat() method of Event.
   */
  @Test
  public void getRepeatTest() {
    assertTrue(e1.getRepeat() == EventsManager.NO_REPEAT);
    assertFalse(e2.getRepeat() == EventsManager.REPEAT_DAILY);
    assertFalse(e3.getRepeat() == EventsManager.REPEAT_WEEKLY);

    assertTrue(e4.getRepeat() == EventsManager.REPEAT_DAILY);
    assertTrue(e5.getRepeat() == EventsManager.REPEAT_YEARLY);
    assertFalse(e6.getRepeat() == EventsManager.REPEAT_YEARLY);
  }

  /**
   * Tests the getStartDate() method of Event.
   */
  @Test
  public void getStartDateTest() {
    assertTrue(e1.getStartDate() == null);
    assertTrue(e2.getStartDate() == null);
    assertFalse(new CalendarDate(5,1,2016).equals(e3.getStartDate()));

    assertFalse(e4.getStartDate() == null);
    assertTrue(new CalendarDate(5,1,2016).equals(e5.getStartDate()));
    assertTrue(new CalendarDate(5,1,2016).equals(e6.getStartDate()));
  }

  /**
   * Tests the getEndDate() method of Event.
   */
  @Test
  public void getEndDateTest() {
    assertTrue(e1.getEndDate() == null);
    assertTrue(e2.getEndDate() == null);
    assertFalse(new CalendarDate(5,1,2016).equals(e3.getEndDate()));

    assertFalse(e4.getEndDate() == null);
    assertTrue(new CalendarDate(5,1,2020).equals(e5.getEndDate()));
    assertTrue(new CalendarDate(1,1,2018).equals(e6.getEndDate()));
  }

  /**
   * Tests the getPeriod() method of Event.
   */
  @Test
  public void getPeriodTest() {
    assertTrue(e1.getPeriod() == 0);
    assertTrue(e2.getPeriod() == 0);
    assertFalse(e3.getPeriod() == 1);

    assertTrue(e4.getPeriod() == 0);
    assertFalse(e5.getPeriod() == 2);
    assertTrue(e6.getPeriod() == 2);
  }

  /**
   * Tests the isRepeatable() method of Event.
   */
  @Test
  public void isRepeatableTest() {
    assertFalse(e1.isRepeatable());
    assertFalse(e2.isRepeatable());
    assertFalse(e3.isRepeatable());

    assertTrue(e4.isRepeatable());
    assertTrue(e5.isRepeatable());
    assertTrue(e6.isRepeatable());
  }

  /**
   * Tests the getWorkingDays() method of Event.
   */
  @Test
  public void getWorkingDaysTest() {
    assertFalse(e1.getWorkingDays());
    assertFalse(e2.getWorkingDays());
    assertFalse(e3.getWorkingDays());

    assertFalse(e4.getWorkingDays());
    assertTrue(e5.getWorkingDays());
    assertFalse(e6.getWorkingDays());
  }

  /**
   * Tests the getEmail() method of Event.
   */
  @Test
  public void getEmailTest() {
    assertTrue("cst316milpitas@gmail.com".equals(e1.getEmail()));
    assertFalse("cst316milpitas@gmail.com".equals(e2.getEmail()));
    assertTrue(e3.getEmail() == null);

    assertTrue(e4.getEmail() == null);
    assertTrue("cscscscs..com".equals(e5.getEmail()));
    assertTrue(e6.getEmail() == null);
  }

  /**
   * Tests the sendEmail() method of Event.
   */
  @Test
  public void sendEmailTest() {
    assertTrue(e1.sendEmail());
    assertFalse(e2.sendEmail());
    assertFalse(e3.sendEmail());

    assertFalse(e4.sendEmail());
    assertFalse(e5.sendEmail());
    assertFalse(e6.sendEmail());
  }
}
