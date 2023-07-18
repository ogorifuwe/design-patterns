package condiment;

import beverage.Beverage;
import condiment.CondimentDecorator;

public class Mocha extends CondimentDecorator {

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return this.beverage.getDescription() + ", Mocha";
  }

  public double cost() {
    return this.beverage.cost() + 0.20;
  }

}
