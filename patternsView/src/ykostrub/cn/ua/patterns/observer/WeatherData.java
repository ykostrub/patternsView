package ykostrub.cn.ua.patterns.observer;

import java.util.ArrayList;

/**
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class WeatherData implements ISubject {

  private ArrayList observers;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    observers = new ArrayList();
  }

  @Override
  public void registerObserver(
      IObserver o) {
    observers.add(o);
  }

  @Override
  public void removeObserver(
      IObserver o) {
    int i = observers.indexOf(o);
    if (i >= 0)
      observers.remove(i);

  }

  @Override
  public void notifyObservers() {
    for (int i = 0; i < observers.size(); i++) {
      IObserver observer = (IObserver) observers.get(i);
      observer.update(temperature, humidity, pressure);
    }

  }

  public void measurementsChanged() {
    notifyObservers();
  }

  public void setMeasurements(
      float temperature,
      float humidity,
      float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  };

}
