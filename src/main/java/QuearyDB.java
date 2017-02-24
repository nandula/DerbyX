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


    public ResultSet fullOuterJoinDerby(String query) throws SQLException {//put password ,username and salt value to

        st.executeUpdate(query);

        return null;
    }
    public ResultSet fullOuterJoinRowset(String query) throws SQLException {//put password ,username and salt value to

        st.executeUpdate(query);

        return null;
    }
    public ResultSet fullOuterJoinNestedLoop(String query) throws SQLException {//put password ,username and salt value
        // to

        st.executeUpdate(query);

        return null;
    }

}
