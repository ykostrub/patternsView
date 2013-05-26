package ykostrub.cn.ua.patterns.abstractfactory;

public interface IAddressFactory {
  Address createAddress();
  PhoneNumber createPhoneNumber();

}
