package chocolate;

class ChocolateBoilerApp {

  public static void main(String[] args) {
    ChocolateBoiler boiler = ChocolateBoiler.getInstance();
    boiler.fill();
    boiler.boil();
    boiler.drain();

    ChocolateBoiler boiler1 = ChocolateBoiler.getInstance();
  }
}
