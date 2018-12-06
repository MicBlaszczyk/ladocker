import java.sql.*;
import java.util.Scanner;
java.util.concurrent.TimeUnit

class Main {
    public static void main(String args[])
    {
        TimeUnit.SECONDS.sleep(15);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://mysql:3306/mydb", "mbl", "root");
            Statement statement = conn.createStatement();

            String ct = "CREATE TABLE IF NOT EXISTS users (username VARCHAR(30), password VARCHAR(30), name VARCHAR(30));";
            statement.executeUpdate(ct);

            String dr = "DELETE FROM users";
            statement.executeUpdate(dr);

            String username1 = "ziemniaki";
            String password1 = "pyrki";
            String name1 = "Filip";

            String username2 = "cebula";
            String password2 = "cebulka1";
            String name2 = "Piotr";

            String query1 = "INSERT INTO users VALUES('"+username1+"', '"+password1+"', '"+name1+"');";
            statement.executeUpdate(query1);

            String query2 = "INSERT INTO users VALUES('"+username2+"', '"+password2+"', '"+name2+"');";
            statement.executeUpdate(query2);

            String query = "select * from users;";
            ResultSet rs = statement.executeQuery(query);

            System.out.println("Users:");
            while (rs.next())
            {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String name = rs.getString("name");

                System.out.print(username);
                System.out.print(", ");
                System.out.print(password);
                System.out.print(", ");
                System.out.println(name);
            }

            while(true)
            {                 System.out.print("#");
}
        }
        catch(Exception e)
        {

        }
    }
}
