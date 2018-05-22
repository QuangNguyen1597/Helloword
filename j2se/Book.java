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
public class Book {
    //Constant
    public static final short BOOK_ID= 0;
    public static final String BOOK_TITLE="NO BOOK_TITLE";
    public static final String BOOK_NOTES="NO BOOK_NOTES";
    public static final Person BOOK_AUTHOR=new Person();

    public static final short BOOK_NUMBEROFPAGES= 0;
    public static final String BOOK_PUBLISHER="NO BOOK_PUBLISHER";
    public static final String BOOK_LINK_DOWNLOAD="NO BOOK_LINK_DOWNLOAD";

    //Classes variables
    private static int count=0;

    //object's properties
    private short book_id;
    private String book_title;
    private String book_notes;
    private Person book_author;
    private short book_numberOfpages;
    private String book_publisher;
    private String book_link_download;

    //Constructor methods
    public Book() {
        this(Book.BOOK_ID,Book.BOOK_TITLE,Book.BOOK_NOTES,Book.BOOK_AUTHOR,Book.BOOK_NUMBEROFPAGES,Book.BOOK_PUBLISHER,Book.BOOK_LINK_DOWNLOAD);
    }


    public Book(short Book_id,String Book_title,String Book_notes,Person Book_author,short Book_numberofpages,String Book_publisher,String Book_link_download){
        this.book_id= Book_id;
        this.book_title= Book_title;
        this.book_notes= Book_notes;
        this.book_author=Book_author;
        this.book_numberOfpages=Book_numberofpages;
        this.book_publisher=Book_publisher;
        this.book_link_download=Book_link_download;

        //Tang bien dem
        Book.count++;
    }

    //getter methods
    public short getBook_id(){
        return this.book_id;
    }
    public String getBook_title(){
        return this.book_title;
    }
    public String getBook_notes(){
        return this.book_notes;
    }
    public Person getBook_author(){
        return this.book_author;
    }
    public short getBook_numberofpages(){
        return this.book_numberOfpages;
    }
    public String getBook_publisher(){
        return this.book_publisher;
    }
    public String getBook_link_download(){
        return this.book_link_download;
    }

    //Setter methods
    public Book setBook_id(short Book_id){
        this.book_id=Book_id;
        return this;
    }
    public Book setBook_title(String Book_title){
        this.book_title=Book_title;
        return this;
    }
    public Book setBook_notes(String Book_notes){
        this.book_notes=Book_notes;
        return this;
    }
    public Book setBook_numberofpages(short Book_numberofpages){
        this.book_numberOfpages=Book_numberofpages;
        return this;
    }
    public Book setBook_publisher(String Book_publisher){
        this.book_publisher=Book_publisher;
        return this;
    }
    public Book setBook_author(Person Book_author){
        this.book_author=Book_author;
        return this;
    }
    public Book setBook_author(String FirstName,String LastName,byte Age,Address address){
        this.book_author=new Person(FirstName,LastName,Age,address);
        return this;
    }
    public Book setBook_link_download(String Book_link_download){
        this.book_link_download=Book_link_download;
        return this;
    }

    //Other methods

    public String toString(){
        return book_id+", "+book_title+", "+book_notes+", "
                +this.book_author.toString()+", "+book_numberOfpages+", "
                +book_publisher+", "+book_link_download;
    }
    public static int getCountBook(){
        return Book.count;
    }

    protected void finalize() throws Throwable{
        Book.count--;
        super.finalize();
    }


    public static void main(String[] args) {
        Book book = new Book();
        Address addr1=new Address("Ha noi","Ba Dinh","Nhon");
        Person p4=new Person("Trung","Nguyen Van",(byte) 21, addr1);
        Book b1=new Book((short) 12,"ahihi","ngu nguoi",p4,(short) 23,"Tuong","http");

        System.out.println(b1);


    }

}
