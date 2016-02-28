package net.sf.memoranda.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalendarDateTest.class, EventImplTest.class, EventTest.class, GoogleMailTest.class, TaskImplTest.class,
		TaskTest.class })
public class AllTests {

}
