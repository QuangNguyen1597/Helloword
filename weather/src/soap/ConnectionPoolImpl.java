package soap;

import java.util.*;
import java.sql.*;


public class ConnectionPoolImpl implements ConnectionPool{

    private String driver;

    //Duong dan thuc thi MySQL
    private String url;

    //Tai khoan lam viec voi MySQL
    private String name;
    private String pass;

    //Doi tuong luu tru ket noi
    private Stack pool;

    public ConnectionPoolImpl() {

        this.driver = "com.mysql.jdbc.Driver";

        this.url="jdbc:mysql://localhost:3306/weather";

        this.name="jp1708_Quang";
        this.pass="123456";

        this.loadDriver();

        this.pool= new Stack();

    }
    private void loadDriver() {
        try {
            Class.forName(this.driver).newInstance();
        } catch (ClassNotFoundException ex) {
        } catch (IllegalAccessException ex) {
        } catch (InstantiationException ex) {
        }
    }

    public Connection getConnection(String objectName) throws SQLException {
        if(this.pool.isEmpty()){
            System.out.println(objectName + " have created a new connection");
            return DriverManager.getConnection(this.url, this.name, this.pass);
        }else {
            //lay tu ngan xep
            System.out.println(objectName + " have popped the connection.");
                    return (Connection)this.pool.pop();

        }

    }

    public void releaseConnection(Connection con, String objectName) throws
            SQLException {
        System.out.println(objectName+" have pushed the connection.");
        this.pool.push(con);
    }

    protected void finallize()throws Throwable{
        this.pool.clear();
        this.pool = null;

        super.finalize();
        System.out.println("CP is closed.");
       }

    public static void main(String[] args){

    }
}
