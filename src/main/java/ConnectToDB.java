import java.sql.*;

/**
 * Created by Jayz on 24/02/2017.
 */
public class ConnectToDB {


    public String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public String JDBC_URL = "jdbc:derby:derbyDB;create=true";
    public String JDBC_URL_1 = "jdbc:derby:";
    public String JDBC_URL_2 = ";create=true";
    public String db_name = "x";



    private Connection con1;

    public ConnectToDB(String dbname) {
        db_name = dbname;
    }

    public Statement accessDataBase(){
        Statement statement = null;

        try {
            JDBC_URL = JDBC_URL_1+db_name+JDBC_URL_2;
            Class.forName(DRIVER).newInstance();
            Connection con = DriverManager.getConnection(JDBC_URL);//Connect to the database
            con1 = con;
            statement = con.createStatement();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


        return statement;

    }
}
