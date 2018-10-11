package soap.ads.user;

import soap.object.*;
import java.util.*;

public class UserLibrary {
    public UserLibrary() {
    }
    public static String viewUsers(ArrayList<UserObject> items){
        String tmp = "<table cellspacing=0>\n";
        tmp += "<tr>";
        tmp += "<th>STT</th>";
        tmp += "<th>Tên đăng nhập</th>";
        tmp += "<th>Tên đầy đủ</th>";
        tmp += "<th>Địa chỉ</th>";
        tmp += "<th>Hộp thư</th>";
        tmp += "<th>Điện thoại</th>";
        tmp += "<th>Lần đăng nhập</th>";
        tmp += "<th colspan=2>Thực hiện</th>";
        tmp += "<th>ID</th></tr>\n";
        int NO=0;
        for(UserObject item: items){
            tmp +=(++NO%2==0)? "<tr class=EVEN>" : "<tr>";
            tmp += "<td class=NO>" + (NO) + "</td>";
            tmp += "<td class=NAME>" + item.getUser_name() + "</td>";
            tmp += "<td class=NAME>" + item.getUser_fullname() + "</td>";
            tmp += "<td>" + item.getUser_address() + "</td>";
            tmp += "<td>" + item.getUser_email() + "</td>";
            tmp += "<td class=CT>" + item.getUser_homephone() + "</td>";
            tmp += "<td class=CT>" + item.getUser_logined() + "</td>";
            tmp += "<td class=ED ><a href=\"/adv/user/ae?id"+item.getUser_id()+"\">Sửa</a></td>";
            tmp += "<td class=ED>Xóa</td>";
            tmp += "<td class=ID>" + item.getUser_id() + "</td>";
        }
        tmp += "</tr>\n";
        tmp += "";
        tmp += "";
        tmp += "";
        tmp += "</table>";
        return tmp;
    }




}
