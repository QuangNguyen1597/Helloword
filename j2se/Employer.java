package j2se;

public class Employer extends Person {

    //constants
    public static final int NET=0;
    public static final String POSITION="NONE";


    //properties
    private int net;
    private String Position;

    //contructor
    public Employer(){
        this(Employer.FIRSTNAME, Employer.LASTNAME, Employer.AGE, Employer.ADDRESS,
                Employer.NET, Employer.POSITION);
    }

    public Employer(String firstName, String lastName, byte age, Address address,
            int net, String position) {
        super(firstName, lastName, age, address);
                this.net=net;
        this.Position = position;
    }

    public int getNet() {
        return net;
    }

    public String getPosition() {
        return Position;
    }

    public void setNet(int net) {
        this.net = net;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    //Others methods
    public String toString(){
        return super.toString()+"- net: "+this.net+", PO: "+this.Position;
    }

    public static void main(String[] args) {

        Address addr = new Address("Ha Noi","Soc Son","Tan Hung");
        Person e = new Employer("Quang","Nguyen Van",(byte)21, addr, 10,"Manager");

        System.out.println(e.toString());
  }

}
