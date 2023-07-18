package condiment;

import beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    
  Beverage beverage;

  public abstract String getDescription();
}
