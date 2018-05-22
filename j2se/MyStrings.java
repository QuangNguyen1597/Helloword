package j2se;

import java.util.ArrayList;
/**
 * <p>Title: </p>
 *
 * <p>Description: JP1708 project</p>
 *
 * <p>Copyright: Copyright (c) 2018</p>
 *
 * <p>Company: </p>
 *
 * @author Quang
 * @version 1.0
 */
public class MyStrings {
    public MyStrings() {
  }

  /**
   * Dem so ky tu co trong chuoi
   * 3/4/2018
   */

  public static int countChar(String str, char ch, boolean isIgnoreCase){
      int count=0;
      if(isIgnoreCase){
          str = str.toLowerCase();
          ch = Character.toLowerCase(ch);
      }
      for(int i=0;i<str.length();i++){
          if(str.charAt(i)==ch){
              count++;
          }
      }
      return count;
  }

  public static String formatString(String str){
      //Danh sach cac ki tu dac biet
      char[] chs = {
                   '~', '`', '!', '@', '#','$',
                   '%', '^', '&', '*', '(',')',
                   '-', '_', '=', '+', '\\' , '|',
                   '"', '\'', '}', '}', '[', ']',
                   ';', ':', ',', '<', '.', '>',
                   '/', '?'
      };

      //Loai bo ky tu dac biet
      for(char ch:chs){
          str = str.replace(ch,' ');
      }
      //cat bo khoang trong dau , cuoi
      str = str.trim();

      //loai bo dau cach thua trong chuoi
      while(str.indexOf("  ")!=-1){
          str = str.replace("  "," ");
      }
      return str;
  }

  public static int countWords(String str){
      str = MyStrings.formatString(str);
      return MyStrings.countChar(str,' ', false)+1;
  }
  /**
   * Dem so luong cac ky tu trong chuoi
   * 3/4/2018
   * @param str String
   * @return int
   */

  public static ArrayList frequencyChar(String str, boolean isIgnoreCase){
      if(isIgnoreCase){
          str = str.toLowerCase();
      }

      //Lay danh sach cac ky tu khac nhau trong chuoi
      String chs = "";
      char ch;
      String tmp=str.trim();
      for(int i=0;i<tmp.length();i++){
          ch = tmp.charAt(i);
          if(ch!=' '){
              chs += ch;
              tmp = tmp.replace(ch,' ');
          }
      }

      ArrayList fres = new ArrayList(chs.length());

      int count;
      for(int i=0;i<chs.length();i++){
          ch = chs.charAt(i);
          count = MyStrings.countChar(str,ch,isIgnoreCase);
          fres.add("["+ch+","+count+"]");
      }
      return fres;
  }
  /**
   * Cat ra mot so luong tu trong mot chuoi
   * @param str String
   * @param nWords byte
   * @return String
   */
  public static String getWords(String str, byte nWords){
      //Chuan hoa
      str = MyStrings.formatString(str);

      //Xac dinh vi tri de cat
      int  i;
      int count=0;
      for(i=0;i<str.length();i++){
          if(str.charAt(i)==' '){
              count++;

          }
          if(count>=nWords){
              break;
          }
      }

      //Thuc hien cat
      if(i<str.length()-1){
          return str.substring(0, i)+"...";

      }else{
          return str;
      }

  }
  public static void main(String[] args) {
      String str=" Cong  hoa xa   hoi  chu nghia   Viet Nam";



      System.out.println(MyStrings.getWords(str,(byte) 4));
  }
  //Viet hoa ten rieng
  //so sanh muc do giong nhau cua hai ky tu
  //Muc do giong nhau cua hai ky tu

}
