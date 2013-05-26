package ykostrub.cn.ua.patterns.abstractfactory;

public class FrenchAddressFactory implements IAddressFactory {

  @Override
  public Address createAddress() {
    return new FrenchAddress();
  }

  @Override
  public PhoneNumber createPhoneNumber() {
    return new FrenchPhoneNumber();
  }

}
