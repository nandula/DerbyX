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


    public ResultSet fullOuterJoinDerby(String columns, String tables, String joinCondition) throws SQLException {//put
        // password ,username and salt value to



        return null;
    }
    public ResultSet fullOuterJoinRowset(String columns, String tables, String joinCondition) throws SQLException {//put password ,username and salt value to



        return null;
    }
    public ResultSet fullOuterJoinNestedLoop(String columns, String tables, String joinCondition) throws SQLException {//put password ,username and salt value
        // to


        String name="";
        return null;
    }

}
