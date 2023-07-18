package observer;

import subject.WeatherData;

public class StatisticsDisplay implements Observer, DisplayElement {
  
  private static float maxTemp = 0.0f;
  private static float minTemp = 200;
  private static float tempSum = 0.0f;
  private static int numReadings = 0;
  private WeatherData weatherData;

  public StatisticsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }
  
  public void update() {
    float temp = weatherData.getTemperature();
    this.tempSum += temp;
    ++this.numReadings;

    this.maxTemp = Math.max(this.maxTemp, temp);

    this.minTemp = Math.min(this.minTemp, temp);

    display();
  }

  public void display() {
    System.out.println("Avg/Max/Min temperature = " +
        (this.tempSum / this.numReadings) + "/" + this.maxTemp + "/" + this.minTemp);
  }
}
