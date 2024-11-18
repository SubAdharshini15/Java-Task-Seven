package Programs;

import java.util.ArrayList;
import java.util.List;

public class ProgramFive {

	public static void main(String[] args) {
	
		List<String> myList = new ArrayList<String>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.removeAll(myList);
		
		System.out.println(myList);

	}

}
