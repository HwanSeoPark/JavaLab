package com.intheeast.exceptions.trywithresources;

import java.sql.*;

/*
 <!-- https://mvnrepository.com/artifact/com.mysql/mysql-connector-j -->
 <dependency>
    <groupId>com.mysql</groupId>
    <artifactId>mysql-connector-j</artifactId>
    <version>8.3.0</version>
 </dependency>

 * Java Project를 IDE에서 사용하고 있다면, Build Path에 포함시켜야 함
	Eclipse:
	Package Explorer에서 
	   1. 해당 프로젝트 우클릭 → Properties → Java Build Path → Libraries 탭 선택.
	   2. classpath 아이템 선택 후
	   3. Add External JARs 버튼 클릭.
	   4. .m2 디렉토리에서 mysql-connector-java-8.3.0.jar 선택 후 OK
 */
public class CoffeesTableExample {

    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/testdb?serverTimezone=UTC";
        String username = "root";
        String password = "1234";

        try (Connection con = DriverManager.getConnection(jdbcURL, username, password)) {
            System.out.println("데이터베이스 연결 성공!");

            // 1. COFFEES 테이블이 없으면 생성
            createCoffeesTableIfNotExists(con);

            // 2. COFFEES 테이블 데이터가 없으면 샘플 데이터 삽입
            insertSampleDataIfNotExists(con);

            // 3. 테이블 조회
            viewTable(con);

        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // COFFEES 테이블 생성
    public static void createCoffeesTableIfNotExists(Connection con) throws SQLException {
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS COFFEES (
                COF_NAME VARCHAR(32) NOT NULL PRIMARY KEY,
                SUP_ID INT NOT NULL,
                PRICE FLOAT,
                SALES INT,
                TOTAL INT
            )
            """;

        try (Statement stmt = con.createStatement()) {
            stmt.executeUpdate(createTableSQL);
            System.out.println("COFFEES 테이블 확인 및 생성 완료");
        }
    }

    // COFFEES 테이블 데이터 삽입 (없을 때만)
    public static void insertSampleDataIfNotExists(Connection con) throws SQLException {
//        String countQuery = "SELECT COUNT(*) FROM COFFEES";
        String countQuery = "SELECT COUNT(*) FROM HONECHA";
        
        // 다음 try는 try with resource일 뿐...
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(countQuery)) {

            rs.next();
            int count = rs.getInt(1);

            if (count == 0) {
                System.out.println("샘플 데이터 삽입 중...");
                String insertSQL = """
                    INSERT INTO COFFEES (COF_NAME, SUP_ID, PRICE, SALES, TOTAL) VALUES
                    ('Colombian', 101, 7.99, 0, 0),
                    ('French_Roast', 49, 8.99, 0, 0),
                    ('Espresso', 150, 9.99, 0, 0),
                    ('Colombian_Decaf', 101, 8.99, 0, 0),
                    ('French_Roast_Decaf', 49, 9.99, 0, 0)
                    """;

                stmt.executeUpdate(insertSQL);
                
                System.out.println("샘플 데이터 삽입 완료");
            } else {
                System.out.println("이미 데이터가 존재합니다 (삽입 생략)");
            }
        } catch (SQLException e) {
        	System.out.println("SQLException:" + e.getMessage());
        }
    }

    // COFFEES 테이블 조회
    public static void viewTable(Connection con) throws SQLException {
        String query = "SELECT COF_NAME, SUP_ID, PRICE, SALES, TOTAL FROM COFFEES";

        try (Statement stmt = con.createStatement()) {
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("=== COFFEES 테이블 ===");
            while (rs.next()) {
                String coffeeName = rs.getString("COF_NAME");
                int supplierID = rs.getInt("SUP_ID");
                float price = rs.getFloat("PRICE");
                int sales = rs.getInt("SALES");
                int total = rs.getInt("TOTAL");

                System.out.println(coffeeName + ", " + supplierID + ", " +
                                   price + ", " + sales + ", " + total);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    // 예외 출력 유틸리티
    public static void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.err.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}