package design.test;

/**
 * haeco
 *
 * @author tolstoy.chen
 * @date 2023/10/23 15:35
 */
import java.sql.*;

public class SqlServerExample {
    public static void main(String[] args) {
        //String url = "jdbc:sqlserver://10.222.2.6:1433;databaseName=test;user=sa;password=12345678";
        //String url = "jdbc:sqlserver://localhost:1433;databaseName=test;user=sa;password=12345678Aa";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=test;user=cdcuser;password=12345678Aa";

        try {
            // 加载驱动程序
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // 建立数据库连接
            Connection connection = DriverManager.getConnection(url);

            // 创建 SQL 查询
            //String sql = "SELECT * FROM student";
           String sql = "SELECT * FROM student";

            // 创建 Statement 对象
            Statement statement = connection.createStatement();

            // 执行查询
            ResultSet resultSet = statement.executeQuery(sql);

            // 遍历结果集并输出数据
            while (resultSet.next()) {
                String column1 = resultSet.getString("sname");
                String column2 = resultSet.getString("sage");
                // 获取其他列的数据...

                System.out.println("Column1: " + column1 + ", Column2: " + column2);
            }

            // 关闭连接
            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
