package net.sf.memoranda.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import net.sf.memoranda.GoogleMail;

public class GoogleMailTest {
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {

  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testValidEmails() {
    assertTrue(GoogleMail.IsValidEmail("me@example.com"));
    assertTrue(GoogleMail.IsValidEmail("this.is.valid@test.net"));
    assertTrue(GoogleMail.IsValidEmail("anony+mous@example.com"));
    assertTrue(GoogleMail.IsValidEmail("another%^$^123@sample.asu.edu"));
    assertTrue(GoogleMail.IsValidEmail("anony@test123.gov"));
    assertTrue(GoogleMail.IsValidEmail("!#$%&'+-/=.?^`{|}~@[1.0.0.127]"));
  }

  @Test
  public void testInvalidEmails() {
    assertFalse(GoogleMail.IsValidEmail("me@"));
    assertFalse(GoogleMail.IsValidEmail("@test.com"));
    assertFalse(GoogleMail.IsValidEmail("anony@@example.gov"));
    assertFalse(GoogleMail.IsValidEmail("not.valid.com"));
    assertFalse(GoogleMail.IsValidEmail("my.@test.com"));
    assertFalse(GoogleMail.IsValidEmail(".me@example.com"));
    assertFalse(GoogleMail.IsValidEmail("not_valid@test..com"));
    assertFalse(GoogleMail.IsValidEmail("this-isnt\\@valid.net"));
  }
}
