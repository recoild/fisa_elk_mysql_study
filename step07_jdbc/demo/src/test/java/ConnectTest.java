import org.junit.Before;
import org.junit.Test;

import com.example.utils.DBUtil;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectTest {
    // private String driver;
    // private String url;
    // private String username;
    // private String password;

    // @Before
    // public void setup() {
    // try {
    // Properties p = new Properties();
    // p.load(new FileInputStream("src/main/resources/db.properties"));
    // driver = p.getProperty("jdbc.driver");
    // Class.forName(driver);

    // url = p.getProperty("jdbc.url");
    // username = p.getProperty("jdbc.username");
    // password = p.getProperty("jdbc.password");
    // } catch (Exception e) {
    // e.printStackTrace();
    // }
    // }

    // @Before
    // public void setup() {
    // try {
    // System.out.println("ConnectTest setup");
    // Class.forName("oracle.jdbc.driver.OracleDriver");
    // System.out.println("ConnectTest setup - driver:
    // oracle.jdbc.driver.OracleDriver");
    // } catch (Exception e) {
    // e.printStackTrace();
    // throw new RuntimeException(e);
    // }
    // }

    @Test
    public void connectOracle() {
        // ojdbc11 연동 - java sdk 21 버전 이상에서는 ojdbc11을 사용해야 함
        try {
            // 데이터베이스 연결
            try (Connection connection = DBUtil.getConnection()) {
                System.out.println("연결 성공!");

                // 예제 쿼리 실행
                String query = "SELECT * FROM emp"; // 쿼리
                try (PreparedStatement statement = connection.prepareStatement(query);
                        ResultSet resultSet = statement.executeQuery()) {

                    // 결과 처리
                    while (resultSet.next()) {
                        System.out.println("데이터: " + resultSet.getString("ename"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new SQLException(e);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SQLException(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Test
    public void preparedStatementTestOracle() {
        // ojdbc11 연동 - java sdk 21 버전 이상에서는 ojdbc11을 사용해야 함
        try {
            // 데이터베이스 연결
            try (Connection connection = DBUtil.getConnection()) {
                System.out.println("연결 성공!");

                // 예제 쿼리 실행
                String query = "insert into dept values(?,?,?)"; // 쿼리

                try (PreparedStatement statement = connection.prepareStatement(query)) {
                    statement.setInt(1, 120);
                    statement.setString(2, "IT");
                    statement.setString(3, "Seoul");

                    int result = statement.executeUpdate();
                    System.out.println("result: " + result);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void connectMySQL() {
        // mysql-connector-java 연동
        try {
            // 데이터베이스 연결
            try (Connection connection = DBUtil.getConnection()) {
                System.out.println("연결 성공!");

                // 예제 쿼리 실행
                String query = "SELECT * FROM emp"; // 쿼리
                try (PreparedStatement statement = connection.prepareStatement(query);
                        ResultSet resultSet = statement.executeQuery()) {

                    // 결과 처리
                    while (resultSet.next()) {
                        System.out.println("데이터: " + resultSet.getString("ename"));
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
