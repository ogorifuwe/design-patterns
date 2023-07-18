package condiment;

import beverage.Beverage;

public class Soy extends CondimentDecorator {

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  public String getDescription() {
    return this.beverage.getDescription() + ", Soy";
  }

  public double cost() {
    double cost = this.beverage.cost();
    switch(beverage.getSize()) {
      case TALL:
        cost += 0.10;
      case GRANDE:
        cost += 0.15;
      case VENTI:
        cost += 0.20;
    }

    return cost;
  }
}
