import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jayz on 24/02/2017.
 */
public class QuearyDB {

    Statement st;

    public QuearyDB(String dbName) {
        ConnectToDB cdb = new ConnectToDB(dbName);
        st = cdb.accessDataBase();
    }

    public ResultSet fullOuterJoinDerby(String columns, String tables, String joinCondition) {//put
        // password ,username and salt value to

        return null;
    }

    public ResultSet fullOuterJoinRowset(String columns, String tables, String joinCondition) {//put password ,username and salt value to

        return null;
    }

    public  ArrayList<HashMap<String, Object>> fullOuterJoinNestedLoop(String columns, String tables, String joinCondition) throws SQLException {//put password ,username and salt value

        String query_1 = "SELECT * FROM ";
        String query_2 = "SELECT * FROM ";
        String column[] = null;

        if (!columns.equals("*")) {
            column = columns.split(",");
        }

        String table[] = tables.split(",");
        query_1 = query_1 + table[0];
        query_2 = query_2 + table[2];

        ResultSet rs1 = st.executeQuery(query_1);
        ResultSetMetaData metaData1 = rs1.getMetaData();
        int columnCount1 = metaData1.getColumnCount();

        ResultSet rs2 = st.executeQuery(query_2);

        ResultSetMetaData metaData2 = rs1.getMetaData();
        int columnCount2 = metaData2.getColumnCount();

        String conditions[] = joinCondition.split(",");

        int tabl1_index = 0;
        int tabl2_index = 0;

        for (int i = 1; i <= columnCount1; i++) {
            if (metaData1.getColumnLabel(i).equalsIgnoreCase(conditions[0])) {
                tabl1_index = i;
            }
        }

        for (int j = 1; j <= columnCount1; j++) {
            if (metaData2.getColumnLabel(j).equalsIgnoreCase(conditions[1])) {
                tabl2_index = j;
            }
        }

        ArrayList<HashMap<String, Object>> results = new ArrayList<HashMap<String, Object>>();

        while (rs1.next()) {
            Object obj1 = rs1.getObject(conditions[0]);

            while (rs2.next()) {
                Object obj2 = rs2.getObject(conditions[1]);

                if (obj1.equals(obj2)) {
                    HashMap<String, Object> row = new HashMap<String, Object>();
                    for (int i = 1; i <= columnCount1; i++) {
                        if (columns.equals("*")) {
                            row.put(metaData1.getColumnLabel(i), rs1.getObject(i));
                        }else{
                            if(Arrays.asList(column).contains(metaData1.getColumnLabel(i))){
                                row.put(metaData1.getColumnLabel(i), rs1.getObject(i));
                            }
                        }
                    }

                    for (int j = 1; j <= columnCount1; j++) {
                        if (columns.equals("*")) {
                            row.put(metaData2.getColumnLabel(j), rs2.getObject(j));
                        }else{
                            if(Arrays.asList(column).contains(metaData1.getColumnLabel(j))){
                                row.put(metaData1.getColumnLabel(j), rs1.getObject(j));
                            }
                        }
                        
                    }
                    results.add(row);
                }
            }

        }

        return results;
    }

}
