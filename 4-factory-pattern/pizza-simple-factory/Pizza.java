import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

  String name;
  String dough;
  String sauce;
  List<String> toppings = new ArrayList<>();

  void prepare() {
    System.out.println("Preparing " + this.name);
  }

  void bake() {
    System.out.println("Baking " + this.name);
  }

  void cut() {
    System.out.println("Cutting " + this.name);
  }

  void box() {
    System.out.println("Boxing " + this.name);
  }

  public String getName() {
    return this.name;
  }

  public String toString() {
    StringBuffer display = new StringBuffer();
    display.append("---- " + name + " ----\n");
    display.append(dough + "\n");
    display.append(sauce + "\n");
    for (String topping : toppings) {
      display.append(topping + "\n");
    }
    return display.toString();
  }

}
