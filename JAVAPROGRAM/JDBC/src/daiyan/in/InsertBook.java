package daiyan.in;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertBook {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb?useSSL=false";
//	private static final String DB_URL = "jdbc:mysql://localhost:3306/advjdb";

	private static final String DB_UNAME = "root";

	private static final String DB_PWD = "Alam@123";

	private static final String SELECT_SQL = "SELECT * FROM BOOKS WHERE BOOK_ID = 101";

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PWD);

		Statement stmt = con.createStatement();

		ResultSet rs = stmt.executeQuery(SELECT_SQL);

		if (rs.next()) {
			int bookid = rs.getInt("BOOK_ID");
			String name = rs.getString("BOOK_NAME");
			double price = rs.getDouble("BOOK_PRINCE");

			System.out.println(bookid);
			System.out.println(name);
			System.out.println(price);
		} else {
			System.out.println("No Records Found");
		}
		con.close();
	}
}
		