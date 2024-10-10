package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExuNonSelectQuery {
     public void m1() throws Exception {
    Connection conn=	DriverManager.getConnection("jdbc:mysql://localhost:3306/kcsm22Adv","root","12345") ;
         Statement stat=conn.createStatement();
         int result=stat.executeUpdate(null);
         System.out.println(result);
    
     }
}
