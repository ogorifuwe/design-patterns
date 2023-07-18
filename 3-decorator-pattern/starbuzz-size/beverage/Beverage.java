package beverage;

import beverage.Size;

public abstract class Beverage {

  Size size = Size.TALL;

  String description = "Unknown Beverage";

  public String getDescription() {
    return this.description;
  }

  public Size getSize() {
    return this.size;
  }
  
  public void setSize(Size size) {
    this.size = size;
  }

  public abstract double cost();

}
