package ykostrub.cn.ua.patterns.abstractfactory;

public class USAddress extends Address {
  
  private static final String COUNTRY = "FRANCE";

  private static final String COMA = ",";
  
  public String getCountry(){
    return COUNTRY;
  }

  @Override
  public String getFullAddress() {
    return getStreet() + EOL_STRING +
        getCity() + COMA + SPACE + getRegion() + 
        SPACE + getPostalCode() + EOL_STRING + COUNTRY + EOL_STRING;
  }
  
  
  

}
