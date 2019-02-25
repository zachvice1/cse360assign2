/**  Zachary Weiss
 *  ID: 585 
 *  Student ID: 1201217619
 *  cse360 assignment #2
 */

package cse360assign2;

/** This is a Calculator Class
 *   Which performs Add, sub, mult, div, and contains a history string
 *   to keep track of all operations made in order.
 */
public class Calculator {

private int total;
private String History="0";	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value;
		History = History + " + " + Integer.toString(value);
		
	}
	
	public void subtract (int value) {
		total = total - value;
		History = History + " - " + Integer.toString(value);	
		}
	
	public void multiply (int value) {
		total = total * value;
		History = History + " * " + Integer.toString(value);
	}
	
	public void divide (int value) {
		
		if(value == 0) 
			total = 0;
		else 
			total = total / value;
		
		History = History + " / " + Integer.toString(value);
		
		
	}
	
	public String getHistory () {
		return History;
	}

}


