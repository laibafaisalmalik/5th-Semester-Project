//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import javax.swing.JOptionPane;

/**
 *
 * @author laiba
 */
//public class DbConnectivity {
//    public static void main(String[] args){
////         username=username1.getText();
////        Email=email1.getText();
////        password=password1.getText();
////        phonenum=contact1.getText();
//       
//        try{  
//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
//
////here sonoo is database name, root is username and password 
//
//    try (Connection con = DriverManager.getConnection(  
//            "jdbc:sqlserver://HP-ENVY\\SQLEXPRESS;databaseName=BusTicketReservationSystem;integratedSecurity=true")) {
//        //here sonoo is database name, root is username and password
//        Statement stmt=con.createStatement();
//        //Scanner sc = new Scanner(System.in);
//    // stmt.executeUpdate("INSERT INTO Registration(username,password,email,contact) VALUES(?,?,?,?)");
//
////     String sqlQ = "INSERT INTO Registration(username,password,email,contact) VALUES(?,?,?,?)";
////PreparedStatement sqlstatement = con.prepareStatement(sqlQ);
////sqlstatement.setString(1, username);
////sqlstatement.setString(2, password);
////sqlstatement.setString(3, Email);
////sqlstatement.setString(4, phonenum);
////sqlstatement.executeUpdate();
////sqlstatement.close();
////     
////        ResultSet rs=stmt.executeQuery("select * from Registration");
////        System.out.println("*USERNAME*\t"+"*PASSWORD*\t"+" "+"*EMAIL*\t"+"      \t"+"*CONTACT*");
////        
////        while(rs.next())
////          
////            System.out.println(rs.getString(1)+"\t"+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3)+"\t"+"\t"+rs.getString(4));  
//    }
//} catch(Exception e){ System.out.println(e);
//}
//
//       
//       
//    }
//}
