package ykostrub.cn.ua.patterns.composite;

public class TestComposite {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Composite first = new Row(1);
    Composite second = new Column(2);
    Composite third = new Column(3);
    Composite fourth = new Row(4);
    Composite fifth = new Row(5);
    first.add(second);
    first.add(third);
    third.add(fourth);
    third.add(fifth);
    first.add(new Primitive(6));
    second.add(new Primitive(7));
    first.traverse();

  }

}
