package chepter3.lang.string.method;

public class StringSplitJoinMain {

	public static void main(String[] args) {
		String str = "Apple,Banana,Orange";

		// split()
		String[] splitStr = str.split(",");
		for (String s : splitStr) {
			System.out.println(s);
		}

		String joinStr = "";

		// join()
		String[] array = {"Apple", "Banana", "Orange"};
		joinStr = String.join(",", array);
		System.out.println(joinStr);
	}
}
