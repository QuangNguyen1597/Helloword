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
public class Person {
    public static final String FIRSTNAME="NO FIRSTNAME";//hang
   public static final String LASTNAME="NO LASTNAME";//hang
   public static final byte AGE= 0;//hang
   public static final Address ADDRESS=new Address();

   //Classes variables
   private static int count=0;

   //Object's properties
   private String firstName;//khai bao danh sach thuoc tinh
   private String lastName;//khai bao danh sach thuoc tinh
   private byte age;//khai bao danh sach thuoc tinh

   private Address address;

   //Constructor methods
   public Person(){
       //this.firstName="No FirstName";
       //this.lastName="No LastName";
       //this.age= 0;

       this(Person.FIRSTNAME,Person.LASTNAME,Person.AGE,Person.ADDRESS);
   }

   public Person(byte age){
        this(Person.FIRSTNAME,Person.LASTNAME,age,Person.ADDRESS);

   }

   public Person(String FirstName,String LastName,byte Age,Address address){
       this.firstName= FirstName;
       this.lastName= LastName;
       this.age= Age;
       //this.address=address;
       this.address=new Address(address);

       //Tang bien dem doi tuong
       Person.count++;

   }

   //getter methods
   public String getFisrtName(){
       return this.firstName;
   }
   public String getLastName(){
       return this.lastName;
   }
   public byte getAge(){
       return this.age;
   }
   public Address getAddress(){
       return this.address;
   }

   //setter methods
   public Person setFisrtName(String FirstName){
       this.firstName=FirstName;
       return this;
   }
   public Person setLastName(String LastName){
       this.lastName=LastName;
       return this;
   }
   public Person setAge(byte Age){
       this.age=Age;
       return this;
   }
   public Person setAddress(Address address){
       this.address=new Address(address);
       return this;
   }
   public Person setAddress(String CityName,String DistrictName,String StreetName){
       this.address=new Address(CityName,DistrictName,StreetName);
       return this;
   }


   //Other methods
   public String toString(){
       return lastName+" "+firstName+" - "+age;
   }
   public static int getCountPerson(){
       return Person.count;
   }

   protected void finalize() throws Throwable{
       Person.count--;
       super.finalize();
   }

   public static void main(String[] agrs){
       Address addr=new Address("Ha noi","Ba Dinh","Nhon");

       //Tao doi tuong
       Person p;
       Person p1=new Person();
       Person p2=new Person((byte) 21);
       Person p3=new Person("Trung","Nguyen Van",(byte) 21, addr);

       System.out.println(p3);

   }

}
