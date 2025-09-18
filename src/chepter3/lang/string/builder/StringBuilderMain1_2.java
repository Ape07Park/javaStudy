package chepter3.lang.string.builder;

public class StringBuilderMain1_2 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();

		sb.append("A").append("B").append("C").append("D")
			.insert(4, "Java")
			.delete(4, 8)
			.reverse()
			.toString();

		System.out.println("string = " + sb);

		// String -> StringBuilder로 변환
		String str = "ab";
		StringBuilder s = new StringBuilder(str);
	}
}
