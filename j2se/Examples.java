package j2se;

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
public class Examples {
    public Examples() {
  }
  /**
   * This is used to check a value is <b>prime</b>?
   * <br/>
   * <i>update 08-03-2018</i>
   * <br/>
   * @param n int
   * @return boolean
   */
  //Kiem tra so nguyen to
  public static boolean checkvalue(int n){
      //khai bao bien trung gian
      boolean flag=true;

      //Kiem tra
     if (n<2) {
         flag=false;
     }else{
         for(int v=2;v<=(int)(Math.sqrt(n));v++){
             if(n%v==0){
                 flag=false;
                 break;
             }
         }
     }

     return flag;
  }
  /**
   * This method is used to get UCLN from two parameters.
   * <br/>
   * <i>update 08-03-2018</i>
   * <br/>
   * @param a int
   * @param b int
   * @return int
   */
  //Kiem tra ucln
  public static int getUCLN(int a,int b){
      int UCLN=-1;

      if(a*b!=0){
          while (a != b) {
              if (a > b) {
                  a = a - b;

              } else {
                  b = b - a;

              }
          }
          UCLN=a;
      }

      return UCLN;
  }

  /**
  * This method is used to get UCLN from three program.
  * <br/>
  * <i>update 08-02-2018</i>
  * <br/>
  * @param a int
  * @param b int
  * @param c int
  * @return int
  */
  //Chong phuong thuc
  public static int getUCLN(int a,int b,int c){

      return Examples.getUCLN(Examples.getUCLN(a,b),c);
  }
  /**
   * chu vi tam giac.
   * </br>
   * <i>update 15-03-2018</i>
   * @param a int
   * @param b int
   * @param c int
   * @return int
   * @param args String[]
   */
  public static int getCVTG(int a,int b,int c){
      int cvtg=0;
      while(a+b<=c||b+c<=a||a+c<=b||a<=0||b<=0||c<=0){
          cvtg=a+b+c;
      }

      return cvtg;
  }
  /**
   * chu vi hinh tron
   * <i>update 22-3-2018</i>
   * @param r float
   * @return float
   */

  public static float getCVT(float r){
      float CVT=0;

      if(r>0){
           CVT=2*((float)Math.PI*r);
      }
      return CVT;
  }

  public static void main(String[] args) {


      //sinh ngau nhien mot gia tri
      int n=(int)(Math.random()*100);
      int m=(int)(Math.random()*100);

      //In ra man hinh ao
      System.out.println("gia tri cua n="+n);
      boolean flag = false;

      //Kiem tra co phai la nguyen to hay khong


      //Thong bao
      if(Examples.checkvalue(n)){
          System.out.println("la so nguyen to.");
      }else{
          System.out.println("khong la so nguyen to.");
      }



      //In ra man hinh
      System.out.println("UCLN cua n="+n);
      System.out.println("va cua m="+m);
      System.out.println("la:"+Examples.getUCLN(n,m));

      //chu vi tam giac
      int a=(int) (Math.random()*10);
      int b=(int) (Math.random()*10);
      int c=(int) (Math.random()*10);

      //tra gia tri
      System.out.println("gia tri cua a=" +a);
      System.out.println("gia tri cua b=" +b);
      System.out.println("gia tri cua c=" +c);
      System.out.println("gia tri cua chu vi tam giac=" +Examples.getCVTG(a,b,c));

      //chu vi hinh tron

     int r=(int) (Math.random()*10);
     System.out.println("gia tri cua r=" +r);
     System.out.println("chu vi hinh tron la=" +Examples.getCVT(r));

  }

}
