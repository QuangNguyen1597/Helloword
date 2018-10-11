package soap.ads.user;

import soap.*;
import soap.object.*;
import java.util.*;

public class UserControl {
    private UserModel um;
    public UserControl(ConnectionPool cp) {
        this.um = new UserModel(cp);
    }

    protected void finalize()  throws Throwable{
        this.um = null;
        super.finalize();
    }
    public ConnectionPool getCp(){
       return this.um.getCp();
   }
   public void releaseConnection(){
       this.um.releaseConnection();
   }

   //---------------------------------

   public boolean addUser(UserObject item){
       return this.um.addUser(item);
   }
   public boolean editUser(UserObject item){
       return this.um.editUser(item);
   }
   public boolean delUser(UserObject item){
       return this.um.delUser(item);
   }
   //Chuyen dieu khien
   public UserObject getUserObject(int id){
       return this.um.getUserObject(id);
   }
   //Chuyen dieu khien
   public UserObject getUserObject(String username, String userpass){
       return this.um.getUserObject(username, userpass);
   }
   public String view(UserObject similar, short page, byte total){
       //Lay DS doi tuong
       ArrayList items = this.um.getUserObject(similar,page,total);
       return UserLibrary.viewUsers(items);
   }



    public static void main(String[] args) {
        //Tao bo quan ly ket noi
       ConnectionPool cp = new ConnectionPoolImpl();
       //Tao doi tuong thuc thi chuc nang

       UserControl uc = new UserControl(cp);
       //Lay du lieu cau truc HTML DS nguoi su dung
       String view = uc.view(null,(short)1,(byte)15);
       System.out.print(view);

    }
}
