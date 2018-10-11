package soap;

public interface ShareControl {

    public ConnectionPool getCP();
    public void releaseConnection();
}
