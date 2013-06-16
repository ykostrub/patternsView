package ykostrub.cn.ua.patterns.composite;

public class Row extends Composite {

  public Row(int value) {
    super(value);
  }

  @Override
  public void traverse() {
    System.out.println();
    System.out.print("ROW " + " -> ");
    super.traverse();
  }

}
