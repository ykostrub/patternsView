package ykostrub.cn.ua.patterns.observer;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement{
  private float temperature;
  private float humidity;
  private ISubject weatherData;

  public CurrentConditionsDisplay(ISubject weatherData){
      this.weatherData = weatherData;
      weatherData.registerObserver(this);
  }

  @Override
  public void update(float temperature, float humidity, float pressure) {
      this.temperature = temperature;
      this.humidity = humidity;
      display();
  }

  @Override
  public void display() {
      System.out.printf("������ ��������: %.1f �������� ������� � %.1f %% ���������\n", temperature, humidity);
  }
}
