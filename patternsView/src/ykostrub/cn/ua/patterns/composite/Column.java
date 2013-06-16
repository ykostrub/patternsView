package ykostrub.cn.ua.patterns.composite;

public class Column extends Composite {

  public Column( int value) {
    super(value);
    }

  @Override
  public void traverse() {
    System.out.println();
    System.out.print(" \t -> Column " + " -> ");
    super.traverse();
  }
  
  

}
