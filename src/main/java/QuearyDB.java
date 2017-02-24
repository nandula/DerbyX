import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Jayz on 24/02/2017.
 */

public class QuearyDB {

    Statement st;

    public QuearyDB(String dbName){
        ConnectToDB cdb = new ConnectToDB(dbName);
        st = cdb.accessDataBase();
    }


    public ResultSet fullOuterJoinDerby(String columns, String tables, String joinCondition){//put
        // password ,username and salt value to



        return null;
    }
    public ResultSet fullOuterJoinRowset(String columns, String tables, String joinCondition){//put password ,username and salt value to



        return null;
    }
    public ResultSet fullOuterJoinNestedLoop(String columns, String tables, String joinCondition) {//put password ,username and salt value
        
        return null;
    }

}
