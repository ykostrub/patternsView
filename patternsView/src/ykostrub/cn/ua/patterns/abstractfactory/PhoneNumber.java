package ykostrub.cn.ua.patterns.abstractfactory;

public abstract class PhoneNumber {

  private String phoneNumber;

  public abstract String getCountryNumber();

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(
      String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
