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
public class Address {
    //Constant-1
  public static final String CITYNAME = "NO CITYNAME";
  public static final String DISTRICTNAME = "NO DISTRICTNAME";
  public static final String STREETNAME = "NO STREETNAME";

  //Object's properties-0
  private String cityName;
  private String districtName;
  private String streetName;

  //Constructor methods
  public Address() {
      this(Address.CITYNAME, Address.DISTRICTNAME, Address.STREETNAME);
  }

  public Address(String CityName, String DistrictName, String StreetName) {
      this.cityName = CityName;
      this.districtName = DistrictName;
      this.streetName = StreetName;

  }
  public Address(Address adds){
      this(adds.getCityName(),adds.getDistrictName(),adds.getStreetName());
  }
  //getter methods
  public String getCityName(){
      return this.cityName;
  }
  public String getDistrictName(){
      return this.districtName;
  }
  public String getStreetName(){
      return this.streetName;
  }

  //setter methods
  public Address setCityName(String CityName){
      this.cityName=CityName;
      return this;
  }
  public Address setDistrictName(String DistrictName){
      this.districtName=DistrictName;
      return this;
  }
  public Address setStreetName(String StreetName){
      this.streetName=StreetName;
      return this;
  }

  //Other's methods
  public String toString(){
      return cityName+" "+districtName+","+streetName;
  }
  public static void main(String[] agrs){
      Address a;
      Address a1=new Address();
      Address a2=new Address("TP Hai Duong","Thach Khoi","Phu tao");

      System.out.println(a1);
      System.out.println(a2);
  }

}
