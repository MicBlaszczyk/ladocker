import java.sql.*;
import java.util.Scanner;

class Main {
    public static void main(String args[]){
        try {
            //połączenie z bazą
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://pwcho2018-83722:3306/mydb", "mblaszczyk", "root");
            Statement statement = conn.createStatement();

            //tworzenie tabeli
            String ct = "CREATE TABLE IF NOT EXISTS users (username VARCHAR(30), password VARCHAR(30), name VARCHAR(30));";
            statement.executeUpdate(ct);

            //uzupełnianie tabeli
            for(int i=0; i<3; i++){
                String username = "user";
                String password = "pass";
                String name = "name";
                String query = "INSERT INTO users VALUES('"+username+"', '"+password+"', '"+name+"');";
                statement.executeUpdate(query);
            }

            //wyświetlanie tabeli
            String query = "select * from users;";
            ResultSet rs = statement.executeQuery(query);

            System.out.println("Users:");
            while (rs.next())
            {
                String username = rs.getString("username");
                String password = rs.getString("password");
                String name = rs.getString("name");
                System.out.print(username + " " + password + " " + name + "\n");
            }
            while(true){
                //nieskonczona petla zapobiegajaca restartom kontenera
            }
        }
        catch(Exception e){
            //jeśli coś się nie powiedzie błąd zostanie przechwycony
            System.out.print("Exception :( ");
        }
    }
}
