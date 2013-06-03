package ykostrub.cn.ua.patterns.observer;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public interface ISubject {
  
  public void registerObserver(IObserver o);
  public void removeObserver(IObserver o);
  public void notifyObservers();

}
