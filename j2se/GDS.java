package j2se;

public interface GDS {

    public boolean addEmployer(Employer e, Address addr);
    public boolean editEmployer(Employer e, Address addr);
    public boolean delEmployer(Employer e, Address addr);

    public Employer[] searchEmployer(String name);



}
