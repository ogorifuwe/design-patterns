public class Singleton {

  private static Singleton uniqueInstance;

  private Singleton() {}

  public static Singleton getInstance() {
    if (this.uniqueInstance == null) {
      this.uniqueInstance = new Singleton();
    }

    return this.uniqueInstance;
  }
}
