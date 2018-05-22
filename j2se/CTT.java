package j2se;

public interface CTT extends CTX,TPGD, GDS{

    public boolean setEmployer(Employer e);
    public boolean setEmployer(Employer e, Address addr);

    public boolean adCTX(Person p);
    public boolean addTPGD(Person p);
    public boolean addGDS(Person p);
}
