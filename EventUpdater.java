/**
 * EventUpdater.java 
 * Created on 2.10.2016
 * 
 * Package: net.sf.memoranda
 * 
 * @author Dan Carmody
 */

package net.sf.memoranda;

import java.util.Calendar; 
import java.util.Date;
import java.util.GregorianCalendar;
import net.sf.memoranda.date.CalendarDate;
import net.sf.memoranda.util.Local;
import nu.xom.Attribute;
import nu.xom.Element;


public class EventUpdater implements Event, Comparable  {

	/*
	 * Constructor One
	 * @param -- basic param with no new events updated
	 */
	
	/*
	 * Constructor Two
	 * @param event -- takes in a previous event from the events maanger(?)
	 */
	
	/*
	 * Constructor Three
	 * @param event -- event to be updated
	 * @param status -- new status of the event (current, will happen, just happend)
	 */
	
	/*
	 * Main accssors and getters
	 * will need at least one for events, stack of events, status, and stack of status.
	 *!! look into doing a hash map for the events and their updates.
	 */
	
	/*
	 *  update event -- check if already is current status
	 * if current status throw an exception
	 * (i.e can't change birthday from happening to happening)
	 * return void because should only access through the appropriate getter
	 * @param event -- event to update
	 * @param changedStatus -- new status for the event.
	 * @return void -- will not return anything, just changes the data
	 */
	
	/*
	 * check status -- checks to see if the current day of the event is here. If it is, calls to the update event
	 * and changes the status from upcoming to current. 
	 * !! may need to create a calendar object for it to work properly, essentially, grab the current day,
	 * compare it to the day the event occurs, if they're the same, change the event to current, if it's past
	 * change to happened, else keep to upcoming.
	 * @param event -- current event
	 * @param date -- date to check
	 * @return void -- just modifying the data
	 */
	
	/*
	 * send Notification -- look into adding email functionality to it, the bench mark should may already exist?
	 * once a certain amount of days before the event takes place (so think current day versus set day) send an
	 * email to the user for the upcoming event.
	 * !! last thing to work on
	 * @param event -- current event
	 * @param dateSet -- the date for when the email should be sent
	 * @param currentDate -- the date currently
	 * @return email -- email which is a buffered stream(?)
	 */
	
	/*
	 * To string method -- essentially sending the data as a string or anything to let it be red by the system.
	 * @param event -- current event
	 * @param status -- updated status. 
	 * @return string -- string representation of the updated event to get shown
	 */
}
