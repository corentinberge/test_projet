package test_jdbc;

import java.sql.*;

public class test {

	public static void main() {
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mysql://%/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"test",
					"");
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
