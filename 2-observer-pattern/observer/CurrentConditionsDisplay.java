package observer;

import subject.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
  
  private float temperature;
  private float humidity;
  private WeatherData weatherData;

  public CurrentConditionsDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update() {
    this.temperature = weatherData.getTemperature();
    this.humidity = weatherData.getHumidity();
    display();
  }

  public void display() {
    System.out.println("Current conditions: " + this.temperature
        + "F degrees and " + this.humidity + "% humidity");
  }
  
}
