package ykostrub.cn.ua.patterns.observer;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class TestObserver {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    weatherData.setMeasurements(29, 65, 30.4f);
    weatherData.setMeasurements(39, 70, 29.4f);
    weatherData.setMeasurements(42, 72, 31.4f);

  }

}
