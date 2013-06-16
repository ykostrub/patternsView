package ykostrub.cn.ua.patterns.composite;

public class Primitive implements IComponent{
  
 private int value;

  public Primitive( int value) {
   this.value = value;
  }

  @Override
  public void traverse() {
    System.out.print( " -> " + value + " ");
  }
  
  

}
