package kr.or.bit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SingletonHelper {
    private static Connection conn = null;
    
    private void Connection() {}

//    public static Connection getConnection(String dsn) {
//        if(conn==null) {
//            try {
//                if (dsn.equalsIgnoreCase("oracle")) {
//                    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "bituser", "1234");
//                } else if (dsn.equalsIgnoreCase("mysql")) {
//                    conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/bituser?serverTimezone=UTC", "bit", "1004");
//                }
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
//        }
//       return conn;
//    }
    
    public static Connection getConnection(String dsn) {
		if(conn != null) {
			System.out.println("conn is not null");
			return conn;
		}
		try {
			  if(dsn.equals("oracle")) {
				  Class.forName("oracle.jdbc.OracleDriver");
				  conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","bituser","1004");
			  }else if(dsn.equals("mysql")) {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  conn = DriverManager.getConnection("jdbc:mysql://192.168.0.3:3306/sampledb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=true","kosta","1004");
			  }

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("conn return");
		return conn; 
	}
    
    public static void dbClose() {
		if(conn != null) {
			try {
				 conn.close();//연결해제 (DB 연결 끊기)
				 conn = null; //참조를  null 만는다  
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

     public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}