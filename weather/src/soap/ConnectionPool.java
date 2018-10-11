package soap;

import java.sql.*;

public interface ConnectionPool {
    //Xin ket noi
    public Connection getConnection(String objectName) throws SQLException;

    //Tra ve ket noi
    public void releaseConnection(Connection con, String objectName) throws SQLException;

}
