package ykostrub.cn.ua.patterns.composite;

import java.util.ArrayList;

public abstract class Composite implements IComponent {

  
  private ArrayList<IComponent> children = new ArrayList<IComponent>();

  private int value;
  
  public Composite(int value){
    this.value = value;
  }
  
  public void add(IComponent c){
    children.add(c);
  }
  @Override
  public void traverse() {
    System.out.print(value + " ");
    for (IComponent c : children) {
      c.traverse();
    }


  }

}
