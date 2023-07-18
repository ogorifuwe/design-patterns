package condiment;

import beverage.Beverage;

public class Whip extends CondimentDecorator {
  
  public Whip(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return this.beverage.getDescription() + ", Whipped";
  }

  public double cost() {
    return this.beverage.cost() + 0.10;
  }

}
