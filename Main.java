package main;

public class Main {
  
  public static void main(String[] args) {
    Timer t = new Timer();
    t.put(() -> System.out.println("world!"), 5000);
    t.put(() -> System.out.println("Hello "), 2000);
    try {
      t.start();
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Done");
  }
}
