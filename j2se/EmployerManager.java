package j2se;

public class EmployerManager extends Manager {
    public EmployerManager() {
    }

    /**
     * getInfo
     *
     * @param p Person
     * @return String
     * @todo Implement this j2se.Manager method
     */
    public String getInfo(Person p) {
        return "Employer: "+p.toString();
    }

    public static void main(String[] args) {
        EmployerManager employermanager = new EmployerManager();
    }
}
