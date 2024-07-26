package com.example.titanic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.example.utils.DBUtil;

public class TitanicService {
    public void insertGroup(int pclass) throws Exception {
        try {
            // 데이터베이스 연결
            try (Connection connection = DBUtil.getConnection()) {
                System.out.println("연결 성공!");

                // 예제 쿼리 실행
                String query = "INSERT INTO titanic (passengerid, survived, pclass, name,age, gender, sibsp, parch, ticket, fare, cabin, embarked, updated_at)\r\n"
                        + //
                        "SELECT passengerid, survived, pclass, name, \r\n" + //
                        " CAST(age AS DOUBLE) AS age, -- 나이 데이터 변환\r\n" + //
                        " gender, sibsp, parch, ticket, fare, cabin, embarked, NOW() AS updated_at\r\n" + //
                        "FROM titanic_raw\r\n" + //
                        "where pclass = ?;"; // 쿼리
                // String query = "insert into titanic select * from titanic_raw where pclass =
                // ?;";
                try (PreparedStatement statement = connection.prepareStatement(query);) {
                    statement.setInt(1, pclass);

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
