import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Jayz on 24/02/2017.
 */

public class QuearyDB {

    Statement st;

    public QuearyDB() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        st = ConnectToDB.getInstance().accessDataBase();
    }


    public ResultSet storePassword(String query) throws SQLException {//put password ,username and salt value to the database


        st.executeUpdate(query);
        String name="";
        return null;
    }

}
