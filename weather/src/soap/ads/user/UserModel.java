package soap.ads.user;

import soap.*;
import soap.object.*;
import java.sql.*;
import java.util.*;

public class UserModel {
    private User u;
    public UserModel(ConnectionPool cp) {
        this.u = new UserImpl(cp);
    }

    protected void finalize() throws Throwable{
        this.u = null;
        super.finalize();
    }
    public ConnectionPool getCp(){
        return this.u.getCP();
    }
    public void releaseConnection(){
        this.u.releaseConnection();
    }
    public boolean addUser(UserObject item){
        return this.u.addUser(item);
    }
    public boolean editUser(UserObject item){
        return this.u.editUser(item);
    }
    public boolean delUser(UserObject item){
        return this.u.delUser(item);
    }

    public UserObject getUserObject(int id){
       UserObject item = null;
       ResultSet rs = this.u.getUser(id);
       if(rs!=null){
           try {
               if (rs.next()) {
                   item = new UserObject();
                   item.setUser_id(rs.getInt("user_id"));
                   item.setUser_name(rs.getString("user_name"));
                   item.setUser_fullname(rs.getString("user_fullname"));
                   item.setUser_email(rs.getString("user_email"));
                   item.setUser_address(rs.getString("user_address"));
                   item.setUser_homephone(rs.getString("user_homephone"));
                   item.setUser_permission(rs.getByte("user_permission"));
                   item.setUser_logined(rs.getShort("user_logined"));
               }
           } catch (SQLException ex) {
               ex.printStackTrace();
           }
       }
       return item;
   }
   public UserObject getUserObject(String username, String userpass){
      UserObject item = null;
      ResultSet rs = this.u.getUser(username,userpass);
      if(rs!=null){
          try {
              if (rs.next()) {
                  item = new UserObject();
                  item.setUser_id(rs.getInt("user_id"));
                  item.setUser_name(rs.getString("user_name"));
                  item.setUser_fullname(rs.getString("user_fullname"));
                  item.setUser_email(rs.getString("user_email"));
                  item.setUser_address(rs.getString("user_address"));
                  item.setUser_homephone(rs.getString("user_homephone"));
                  item.setUser_permission(rs.getByte("user_permission"));
                  item.setUser_logined(rs.getShort("user_logined"));
              }
          } catch (SQLException ex) {
              ex.printStackTrace();
          }
      }
      return item;
  }
  public ArrayList getUserObject(UserObject similar, short page, byte total){
      ArrayList items = new ArrayList();
      UserObject item = null;
      int at = (page-1)*total;
      ResultSet rs = this.u.getUsers(similar, at, total);
      if(rs!=null){
          try {
              while(rs.next()) {
                  item = new UserObject();
                  item.setUser_id(rs.getInt("user_id"));
                  item.setUser_name(rs.getString("user_name"));
                  item.setUser_fullname(rs.getString("user_fullname"));
                  item.setUser_email(rs.getString("user_email"));
                  item.setUser_address(rs.getString("user_address"));
                  item.setUser_homephone(rs.getString("user_homephone"));
                  item.setUser_permission(rs.getByte("user_permission"));
                  item.setUser_logined(rs.getShort("user_logined"));

                  //Dua doi tuong vao mang
                  items.add(item);
              }
          } catch (SQLException ex) {
              ex.printStackTrace();
          }
      }
      return items;
  }


}
