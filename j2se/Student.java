package j2se;

public class Student extends Person {

    //constants
    public static final String ID="(2018)00000000000";
    public static final String SPECIALLY="NONE";


    //properties
    private String id;
    private String specially;

    //constructor methods
    public Student() {
        this(Student.FIRSTNAME, Student.LASTNAME, Student.AGE, Student.ADDRESS
                ,Student.ID, Student.SPECIALLY);

    }
    public Student(String firstName, String lastName, byte age,
                   Address address,
                   String id, String specially){
        //khoi tao doi tuong cha
        super(firstName, lastName, age, address);

        //thiet lap thong tin doituong con
        this.id=id;
        this.specially=specially;
    }

    //getter, setter methods
    public String getSpecially() {
        return specially;
    }

    public String getId() {
        return id;
    }

    public void setSpecialy(String specially) {
        this.specially = specially;
    }

    public void setId(String id) {
        this.id = id;
    }

    //Others method
    public String toString(){
        return super.toString()+" - ID: "+this.id+", Specially: "+this.specially;
    }


    public static void main(String[] args) {
        Address addr = new Address("Ha Noi","Nhon","Duong 32");
        Person s = new Student("Quang","Nguyen van",(byte)21,addr,"(2018)12345","CNTT");

        System.out.println(s.toString());


    }

}
