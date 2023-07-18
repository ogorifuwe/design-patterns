package condiment;

import beverage.Beverage;
import beverage.Size;

public abstract class CondimentDecorator extends Beverage {
    
  Beverage beverage;

  public abstract String getDescription();

  public Size getSize() {
    return beverage.getSize();
  }

}
