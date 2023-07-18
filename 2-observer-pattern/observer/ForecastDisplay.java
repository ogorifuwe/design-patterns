package observer;

import subject.WeatherData;

public class ForecastDisplay implements Observer, DisplayElement {
  
  private static float currentPressure = 29.92f;
  private static float lastPressure = 0.0f;
  private WeatherData weatherData;

  public ForecastDisplay(WeatherData weatherData) {
    this.weatherData = weatherData;
    this.weatherData.registerObserver(this);
  }

  public void update() {
    this.lastPressure = this.currentPressure;
    this.currentPressure = weatherData.getPressure();

    display();
  }

  public void display() {
    System.out.print("Forecast: ");
    if (this.currentPressure > this.lastPressure) {
      System.out.println("Improving weather on the way!");
    } else if (this.currentPressure == this.lastPressure) {
      System.out.println("More of the same");
    } else {
        System.out.println("Watch out for cooler, rainy weather");
    }
  }
}
