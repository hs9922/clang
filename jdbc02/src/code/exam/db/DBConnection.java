package code.exam.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*싱글톤을 이용한 DB커넥션 객체만들기
 * 싱글톤이란 자주 사용하는 객체를 정적키워드로 구현하여
 * 해당객체가 존재할때는 새로생성하지 않고 사용하도록 한다.
 * 사용객체가 닫혔거나 존재하지 않을때만 생성하여,
 * 메모리의 효율을 증대할 수 있다. 
 **/


public class DBConnection {

	private static Connection conn; // 연결용

	
	private final static String DRIVER_NAME="org.mariadb.jdbc.Driver";
	private final static String DB_URL="jdbc:mariadb://localhost:13306/web_week";
	private final static String USER_NAME="root";
	private final static String PASSWORD="123456";
	
	//생성자를 통한 선언을 막아야함.
	private DBConnection(){}
	
	public static Connection getConnection(){
		try{
		//커넥션이 없거나 닫혔을 경우만 새로 생성
		if(conn==null||conn.isClosed()) {
		 makeConnection();
		}
		}catch(Exception e) {
			System.out.println("SQL 에러!!");
			e.printStackTrace();//오류 추적하여 출력하는 기능
		}
		return conn;
	}
    private static void makeConnection() throws Exception{
    	 Class.forName(DRIVER_NAME);
         conn=DriverManager.getConnection(DB_URL,USER_NAME,PASSWORD);
    }
    
    public static void close(PreparedStatement pstmt, ResultSet res) {
    	
    	try {
    		if(res!=null) {
    			res.close();
    		}
    		if(pstmt!=null) {
    			pstmt.close();
    		}
    	}catch(Exception e) {
    		System.out.println("close Error!");
    		e.printStackTrace();//오류 추적하여 출력하는 기능
    	}
    }
    public static void close(PreparedStatement pstmt) {
    	
    	try {
    		if(pstmt!=null) {
    			pstmt.close();
    		}
    	}catch(Exception e) {
    		System.out.println("close Error!");
    		e.printStackTrace();//오류 추적하여 출력하는 기능
    	}
    }
    
    public static void close(Connection conn) {
    	
    	try {
    		if(conn!=null) {
    			conn.close();
    		}
    	}catch(Exception e) {
    		System.out.println("close Error!");
    		e.printStackTrace();//오류 추적하여 출력하는 기능
    	}
    }
	
}
/*insert update delete는 결과의 성공 실패 미실행으로 나눔
insert, update, delete가 성공시

각각 실행한 개수만큼 숫자를 리턴
즉 성공하면 무조건 0보다 크다.

update, 와 delete는 0(미실행)이 나올 수 있음
변경 및 삭제 조건이 맞지 않을 경우 실행하지 않음

결론
insert, update delete는 0보다 커야 성공
0이하이면 실패*/
