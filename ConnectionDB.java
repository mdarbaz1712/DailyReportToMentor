
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement; 
public class ConnectionDB {
    public static void main(String[] args) throws Exception {
        String url="jdbc:mysql://localhost:3306/mydb";
        String uname="root";
        String password="arbaz123456";
        String query="Select * from student";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,uname,password); 
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(query);
        while(rs.next()){
            System.out.println(rs.getString("roll")+" "+rs.getString("name1")+" "+rs.getString("class"));
        }
        System.out.println("Hello");
        st.close();
        con.close();

    }
}
