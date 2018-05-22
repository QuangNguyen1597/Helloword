package j2se;

public class testManager {
    public testManager() {
    }

    public static void main(String[] args) {

        Address addr = new Address("Ha Noi", "Nhon", "Duong 32");

       Person s = new Student("Quang", "Nguyen van", (byte) 21, addr,
                              "(2018)12345", "CNTT");

       Person e = new Employer("Tuan","Nguyen Van",(byte)21, addr, 100000,"Manager");

       //----------------------------------------------------------
       Manager sm = new StudentManager();
       Manager em = new EmployerManager();

       System.out.println(sm.getInfo(s));
       System.out.println(em.getInfo(e));
    }
}
