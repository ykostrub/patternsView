package ykostrub.cn.ua.patterns.abstractfactory;

public class USAddressFactory implements IAddressFactory {

  @Override
  public Address createAddress() {
    return new USAddress();
  }

  @Override
  public PhoneNumber createPhoneNumber() {
    return new USPhoneNumber();
  }

}
