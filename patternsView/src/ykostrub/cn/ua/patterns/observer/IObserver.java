package ykostrub.cn.ua.patterns.observer;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public interface IObserver {  
  public void update (float temperature, float humidity, float pressure);

}
