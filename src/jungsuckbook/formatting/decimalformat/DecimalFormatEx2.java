package jungsuckbook.formatting.decimalformat;

import java.text.DecimalFormat;
import java.text.ParseException;

public class DecimalFormatEx2 {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat(("#,###.##"));
		DecimalFormat df2 = new DecimalFormat("#.###E0");


		try {
			Number num = df.parse("1,234,567.89");

			System.out.println("num :" + num);

			double d = num.doubleValue();
			System.out.println("d :" + d);

			System.out.println(df2.format(num));


		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
