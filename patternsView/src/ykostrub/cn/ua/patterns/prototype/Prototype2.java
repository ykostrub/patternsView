package ykostrub.cn.ua.patterns.prototype;

public class Prototype2 extends Prototype implements Cloneable{

  /** */
  private static final long serialVersionUID = 6368631407361298943L;

  public Prototype2(
      String name,
      String value) {
    super(name, value);
    // TODO Auto-generated constructor stub
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }
  
  

}
