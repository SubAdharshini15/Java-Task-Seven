package Programs;

import java.util.ArrayList;
import java.util.List;

public class ProgramSeven {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("Apple");
		myList.add("Banana");
		myList.add("Carrot");
		System.out.println("List is : " + myList);

		String[] myArray = myList.toArray(new String[0]);

		for (String array : myArray) {
			System.out.println("Array is : " + array);
		}

	}
}
