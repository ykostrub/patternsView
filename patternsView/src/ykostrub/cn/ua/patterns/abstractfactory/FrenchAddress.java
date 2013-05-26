package ykostrub.cn.ua.patterns.abstractfactory;

public class FrenchAddress extends Address {
  
  private static final String COUNTRY = "UNITED STATES";

  public String getCountry(){
    return COUNTRY;
  }

  @Override
  public String getFullAddress() {
    return getStreet() + EOL_STRING +
       getPostalCode() + SPACE + getCity() + EOL_STRING + COUNTRY + EOL_STRING;
  }
  

}
