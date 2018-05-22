package j2se;

import java.util.*;
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
public class MyArrays {
    public MyArrays() {
     }
     public static int[] generateArray(int n){
         //Mang trung gian
         int[] arrInt=new int[n];

         //Sinh ngau nhien phan tu trong mang

         for(int i=0;i<n;i++){
             arrInt[i]=(int)(Math.random()*100);
         }

         return arrInt;
     }
     public static int[][] generateArray(int rows,int cols){
         //Mang trung gian
         int[][] arrInt=new int[rows][cols];

         //sinh ngau nhien phan tu;
         for(int i=0;i<rows;i++){
             arrInt[i]=MyArrays.generateArray(cols);
         }

         return arrInt;
     }

     public static Person[] generatePerson(int n){
         //Mang ket qua
         Person[] list=new Person[n];

         //Danh sach ten
         String[] firstNames={
                   "Tuan","Quang","Trung","Tien","Anh","Loc","Tai",
                   "Quan","Manh","Long","Cong","Hieu","Mai","Ngoc",
                   "Thinh","Vinh","Duc","Ha","Thuong","Son","Phuoc",
                   "Chien","Chieu","Dat","Don","Thai","Kien","Huynh",
                   "Tinh","Hung","Tam","Hoan","Thin","Huy","Doanh"
         };
         String[] lastNames={

                   "Nguyen","Dinh","Le","Tran","Ngo","Ta","Co",
                   "La","Nguyen","Duong","Luyen","Ly","Ho","Mac",
                   "Ma","Phan","Pham","Dao","Doan","Quach","Dam"

         };
         //Sinh cac phan tu danh sach
         int index;
         for(int i=0;i<n;i++){
             //Khoi tao bo nho cho phan tu mang
             list[i]=new Person();

             //Sinh ngau nhien ten
             index=(int)(Math.random()*firstNames.length);
             list[i].setFisrtName(firstNames[index]);

             //Sinh ngau nhien ho
             index=(int)(Math.random()*lastNames.length);
             list[i].setLastName(lastNames[index]);

             index=(int)(Math.random()*120);
             list[i].setAge((byte) index);
         }
         return list;
     }

     public static int[] sortedArray(int [] arrInt, boolean isINC){
         //Xac dinh huong sap xep
         int ori=isINC ?1:-1;

         //Sap xep
         int tmp;
         for(int i=0;i<arrInt.length-1;i++){
             for(int j=i+1;j<arrInt.length;j++){
                 if (arrInt[i] * ori > arrInt[j] * ori) {
                     tmp = arrInt[i]; //luu lai gia tri
                     arrInt[i] = arrInt[j]; //gan gia tri moi
                     arrInt[j] = tmp; //lay lai gia tri cu
                 }
             }
         }
         return arrInt;
     }

     //Tim so nguyen to va sap xep la nguyen to dau mang ko la nguyen to cuoi mang theo tang dan

     public static int[] filterArray(int [] arrInt, boolean isINC){
         //Sap xep
         arrInt=MyArrays.sortedArray(arrInt,isINC);

         //tach nguyen to
         int[] temp1=new int[arrInt.length];//nguyento
         int[] temp2=new int[arrInt.length];//ko la nguyen to
         int t1=0,t2=0;
         for(int value:arrInt){
             if(Examples.checkvalue(value)){
                 temp1[t1++]=value;
             }else{
                 temp2[t2++]=value;
             }
         }

         //Ghep mang
         for(int i=t1;i<temp1.length;i++){
             temp1[i]=temp2[i-t1];
         }
         return temp1;

     }


     public static Person[] searchPerson(Person[] list,String name){
        //Khai bao mang ket qua
        Person[] results=null;

        //dem so ket qua
        int count=0;
        for(Person p:list){
            if(p.getFisrtName().contains(name)){
                count++;
            }
        }

        //Khoi tao mang ket qua
        results=new Person[count];

        //Ghi nhan lai ket qua
        count =0;
        for(Person p:list){
            if(p.getFisrtName().contains(name)){
                results[count++] = p;
            }
        }
        return results;
     }
     /**
      * 3/4/2018
      * @param list Person[]
      * @param name String
      * @return ArrayList
      */
     public static ArrayList searchPersonV2(Person[] list,String name){
         ArrayList results=new ArrayList();
         for(Person p:list){
             if(p.getFisrtName().contains(name)){
                 results.add(p);
             }
         }
         return results;
     }
     //Print methods
     public static void printArray(int[] arrInt){
         for(int value:arrInt){
             System.out.print(value+" ");
         }
         System.out.println();
     }

     public static void printArray(int [][] arrInt){
         for(int[] row:arrInt){
             MyArrays.printArray(row);
         }
     }

     public static void printPerson(Person[] list){
         for(Person p:list){
             System.out.println(p);
         }

     }
     public static void printPerson(ArrayList persons){
         Person p;
         for(int i=0;i<persons.size();i++){
             p = (Person)persons.get(i);
             System.out.println(p);
         }
     }

     public static void printPersonV2(ArrayList<Person> list){
         for(Person p:list){
             System.out.println(p);
         }

     }
     public static void main(String[] args) {
         //Sinh mang
         Person[] list=MyArrays.generatePerson(20);


         //In
         MyArrays.printPerson(list);

         System.out.print("\n\n-----------------------\n\n");


         ArrayList results=MyArrays.searchPersonV2(list,"Trung");
         MyArrays.printPerson(results);


     }
     //sapxepmang hai chieu theo thu tu nao day
     //loc ra cac phan tu co gia tri nho hon phan tu trung binh
     //tinh tan suat xuat hien cua mot gia tri trong mang

}
