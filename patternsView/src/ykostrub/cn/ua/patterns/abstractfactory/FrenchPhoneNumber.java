package ykostrub.cn.ua.patterns.abstractfactory;

public class FrenchPhoneNumber extends PhoneNumber {

  private static final String COUNTRY_CODE = "33";

  private static final int NUMBER_LENGTH = 9;

  @Override
  public String getCountryNumber() {
    return COUNTRY_CODE;
  }

  @Override
  public void setPhoneNumber(
      String phoneNumber) {
    if (phoneNumber != null && phoneNumber.length() == NUMBER_LENGTH) {
      super.setPhoneNumber(phoneNumber);
    }

  }

}
