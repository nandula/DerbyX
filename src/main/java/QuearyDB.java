import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
   
    public ResultSet fullOuterJoinNestedLoop(String columns, String tables, String joinCondition) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {//put password ,username and salt value

        String query_1 = "SELECT * FROM ";
        String query_2 = "SELECT * FROM ";
        
        Statement st_1 = ConnectToDB.getInstance().accessDataBase();
        
        if (!columns.equals("*")) {
            String column[] = columns.split(",");
        } 
        
        String table[] = tables.split(",");
        query_1 = query_1 + table[0];
        query_2 = query_2 + table[2];
        
        ResultSet rs1 = st_1.executeQuery(query_1);
        ResultSetMetaData metaData1 = rs1.getMetaData();
        int columnCount1 = metaData1.getColumnCount();
        
        Statement st_2 = ConnectToDB.getInstance().accessDataBase();
        
        ResultSet rs2 = st_2.executeQuery(query_2);
        
        ResultSetMetaData metaData2 = rs1.getMetaData();
        int columnCount2 = metaData2.getColumnCount();      
        
        String conditions[] = joinCondition.split(",");
        
        int tabl1_index=0;
        int tabl2_index=0;
        
        for(int i=1;i<=columnCount1;i++){
            if (metaData1.getColumnLabel(i).equalsIgnoreCase(conditions[0])){
                tabl1_index = i;
            }
        }
        
        for(int j=1;j<=columnCount1;j++){
            if (metaData2.getColumnLabel(j).equalsIgnoreCase(conditions[1])){
                tabl2_index = j;
            }
        }
        
        
        
        ArrayList<HashMap<String, Object>> results = new ArrayList<HashMap<String, Object>>();
        
        while(rs1.next()){
            Object obj1 = rs1.getObject(conditions[0]);
            
        }
        
        
        
        return null;
    }

}
