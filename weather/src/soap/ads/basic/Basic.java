package soap.ads.basic;

import soap.ConnectionPool;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public interface Basic {
    //PreparedStatement pre : Da duoc biên dịch và truyền giá trị
    public boolean add(PreparedStatement pre);
    public boolean edit(PreparedStatement pre);
    public boolean del(PreparedStatement pre);

    public ResultSet get(String sql,int value);
    public ResultSet get(String sql, String name, String pass);
    public ResultSet gets(String sql);
    public ResultSet[] gets(String[] sqls);
    //Điều khiển quản lý kết nối chuyen sang ShareControl
    public ConnectionPool getCP();
    public void releaseConnection();

}
