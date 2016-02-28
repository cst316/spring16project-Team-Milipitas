/**
 * File: AllTests.java
 * Description: The java test suite class for running all java test classes.
 */
package net.sf.memoranda.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalendarDateTest.class, EventImplTest.class, EventTest.class, GoogleMailTest.class, TaskImplTest.class,
		TaskTest.class })

/**
 * Class: AllTests
 * @author Nathan
 * 
 * Description: Test class to run all tests.
 *
 */
public class AllTests {

}
