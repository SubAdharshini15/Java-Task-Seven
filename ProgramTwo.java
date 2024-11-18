package Programs;

public class ProgramTwo {
	public static void main(String[] args) {
		methodForArrayException();
		methodForStringException();
	}

	public static void methodForArrayException() {
		try {
			String[] array = new String[2];
			array[0] = "Suba";
			array[1] = "Dharshini";
			int c = array.length;
			System.out.println("Array Length : "+c);
			System.out.println(array[0]);
			System.out.println(array[1]);
			System.out.println(array[2]);
			}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Your are not able to fetch the element from array more than length 2");
			System.out.println("===================================================================");
		}

	}
	

	public static void methodForStringException() {
		try {
			String a = "Happy Birthday";
			int length = a.length();
			System.out.println("String Length : " + length);
			System.out.println("String index at 2  : " + a.charAt(2));
			System.out.println("String index at 15 : " + a.charAt(15));
		} catch (StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Your are not able fetch char from string more than length 14");
		}

	}
}
