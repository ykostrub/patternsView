package ykostrub.cn.ua.patterns.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public class TestAF {
  
 private static final IAddressFactory factoryFrance = new FrenchAddressFactory();
 private static final IAddressFactory factoryUS = new USAddressFactory();
  
  /**
   * @param args
   */
  public static void main(
      String[] args) {
    
    for (Address addr  : createAddressList()) {
      System.out.println(addr.getFullAddress());
    }
    for (PhoneNumber ph  : createPhoneNumberList()) {
      System.out.println(ph.getCountryNumber() + " - " + ph.getPhoneNumber());
    }
    
    

  }
  
  
  
  
  private static List<Address> createAddressList(){
    List<Address> addr = new ArrayList<Address>();
    Address addressFr = factoryFrance.createAddress();
    Address addressUs = factoryUS.createAddress();
    addressUs.setCity("New York");
    addressUs.setPostalCode("90215");
    addressUs.setRegion("Colambia");
    addressUs.setStreet("P.Q.");    
    
    addressFr.setCity("PARIS");
    addressFr.setPostalCode("32215");
    addressFr.setRegion("Venis");
    addressFr.setStreet("Alamunia");

    addr.add(addressUs);
    addr.add(addressFr);
    return addr;
  }
  
  private static List<PhoneNumber> createPhoneNumberList(){
    List<PhoneNumber> phoneList = new ArrayList<PhoneNumber>();
    PhoneNumber phUs = factoryUS.createPhoneNumber();
    phUs.setPhoneNumber("9990041209");
    phoneList.add(phUs);
    PhoneNumber phFr = factoryFrance.createPhoneNumber();
    phFr.setPhoneNumber("123456789");
    phoneList.add(phFr);
   
    return phoneList;
  }
  
  
  

}
