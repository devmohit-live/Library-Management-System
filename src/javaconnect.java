
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class javaconnect {
     Connection conn;
    public static  Connection ConnecrDB(){
        try{
           Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/libm","root","");
            //System.out.println("databse connection success");
            return conn;
        }catch(ClassNotFoundException | SQLException e){
     return (Connection) e;
    }
        
    }
}
