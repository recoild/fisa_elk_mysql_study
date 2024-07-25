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

public class ElkMySqlTest {
    @Test
    public void insertGroup1() {
        try {
            // 데이터베이스 연결
            try (Connection connection = DBUtil.getConnection()) {
                System.out.println("연결 성공!");

                // 예제 쿼리 실행
                String query = "insert into titanic select * from titanic_raw tr where tr.pclass = 1"; // 쿼리
                try (PreparedStatement statement = connection.prepareStatement(query);) {
                    // insert문 실행 후 리턴값 출력
                    int result = statement.executeUpdate();
                    System.out.println("결과: " + result);
                } catch (SQLException e) {
                    e.printStackTrace();
                    throw new RuntimeException(e);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
