import java.sql.*;

/**
 * Created by Jayz on 24/02/2017.
 */
public class ConnectToDB {


    public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    public static final String JDBC_URL = "jdbc:derby:derbyDB;create=true";

    private static ConnectToDB singleton = new ConnectToDB();

    private Connection con1;

    private ConnectToDB() {//A private Constructor prevents any other class from instantiating.
    }
    public static ConnectToDB getInstance() {//This return the singleton object instance at Class level
        return singleton;
    }

    public Statement accessDataBase() throws ClassNotFoundException, SQLException, IllegalAccessException,
            InstantiationException {
        Statement statement = null;

            Class.forName(DRIVER).newInstance();
            Connection con = DriverManager.getConnection(JDBC_URL);//Connect to the database
            con1 = con;
            statement = con.createStatement();

        return statement;

    }
}
