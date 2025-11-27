package jungsuckbook.formatting.messageformat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.MessageFormat;

import javax.sql.DataSource;

public class MessageFormatEx {

	// DB 연결하기

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		final String TABLE_NAME = "tbl_member";

		String msg = "INSERT INTO " + TABLE_NAME + " VALUES (''{0}'', ''{1}'', ''{2}'', ''{3}'');";

		String[][] arr = {{"user04", "1111", "이자바", "b86936c7-5111-4d89-9351-e39d822ca1bc"}};

		final String url = "";
		final String user = "";
		final String password = "";

		try (Connection conn = DriverManager.getConnection(url, user, password)) {

			String sql = MessageFormat.format(msg, (Object)arr[0]);

			System.out.println(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}


