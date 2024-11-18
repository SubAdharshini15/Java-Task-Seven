package Programs;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFour {
	public static void main(String[] args) {
		String path = "D:\\Guvi Notes\\File Operation\\Example1.txt";

		File file = new File(path);

		FileReader fr;

		try {
			fr = new FileReader(file);
			fr.read();
			fr.close();

		} catch (IOException e) {
			System.out.println("File Not Found in the Specified Path");
			e.printStackTrace();

		}

	}
}
