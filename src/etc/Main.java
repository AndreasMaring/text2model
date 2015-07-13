package etc;

import java.io.FileNotFoundException;

import processing.FrameNetWrapper;
import processing.WordNetWrapper;

public class Main {
	
	private static Test tt = new Test();
	private static String text = "The Customer Service Representative sends a Mortgage offer to the customer and waits for"
+" a reply. If the customer calls or writes back declining the mortgage, the case details are"
+" updated and the work is then archived prior to cancellation. If the customer sends back the" 
+" completed offer documents and attaches all prerequisite documents then the case is moved"
+" to administration for completion. If all pre-requisite documents are not provided a message" 
+" is generated to the customer requesting outstanding documents. If no answer is received" 
+" after 2 weeks, the case details are updated prior to archive and cancellation. ";

	
	public static void main(String[] args) throws FileNotFoundException{
		WordNetWrapper.init();
		FrameNetWrapper.init();
		tt.testing(text, false);
	}

}

/*

 
The Customer Service Representative sends a Mortgage offer to the customer and waits for 
a reply. If the customer calls or writes back declining the mortgage, the case details are 
updated and the work is then archived prior to cancellation. If the customer sends back the 
completed offer documents and attaches all prerequisite documents then the case is moved 
to administration for completion. If all pre-requisite documents are not provided a message 
is generated to the customer requesting outstanding documents. If no answer is received 
after 2 weeks, the case details are updated prior to archive and cancellation.

*/