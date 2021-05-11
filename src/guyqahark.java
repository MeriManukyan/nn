import java.sql.*;

public class guyqahark {
    public static void main(String[] args) {
        String dbName = "university";
        String dbPort = "1434";
        String dbUser = "mm";
        String dbPassword = "mm";
        ResultSet resultSet = null;
        try  {
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://nn:" + dbPort + ";databaseName="
                    + dbName, dbUser, dbPassword); // try to connect with your attributes
            Statement statement = conn.createStatement();
            System.out.println("d");
            // Create and execute a SELECT SQL statement.
//            String selectSql = "SELECT * from [university].[dbo].[student]";
//            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
//            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
