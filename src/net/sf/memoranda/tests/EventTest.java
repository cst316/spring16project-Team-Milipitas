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

public class EventTest {
	private Event e1;
	private Event e2;
	private Event e3;

	private Event e4;
	private Event e5;
	private Event e6;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		e1 = EventsManager.createEvent(new CalendarDate(10,2,2016),
																		12,
																		0,
																		"Test Event 1: Good Email",
																		"cst316milpitas@gmail.com",
																		"");
		e2 = EventsManager.createEvent(new CalendarDate(11,2,2016),
																		12,
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

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void getIdTest() {

	}

	@Test
  public void getHourTest() {

  }

  @Test
  public void getMinuteTest() {

  }

  @Test
  public void getTextTest() {

  }

  @Test
  public void getNoteTest() {

  }

  @Test
	public void getContentTest() {

  }

  @Test
  public void getRepeatTest() {

  }

  @Test
  public void getStartDateTest() {

  }

  @Test
  public void getEndDateTest() {

  }

  @Test
  public void getPeriodTest() {

  }

  @Test
  public void isRepeatableTest() {

  }

  @Test
  public void getTimeTest() {

  }

  @Test
  public void getTimeStringTest() {

  }

  @Test
	public void getWorkingDaysTest() {

	}

	@Test
  public void getEmailTest() {

  }

  @Test
  public void sendEmailTest() {

  }
}
