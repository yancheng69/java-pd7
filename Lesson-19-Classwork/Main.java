public class Main {
  public static void main(String[] args) {
    new Main().init();
  }

  void init() {
    System.out.println(addNums());
    System.out.println(generatePin());
  }

  // Make an addition prompt using two integers from -5 through 50.
  String addNums() {
    int first = randInt(-5, 50);
    int second = randInt(-5, 50);
    return first + " + " + second + " = ?";
  }

  // Build a four-digit PIN with each digit chosen from 3 through 8.
  int generatePin() {
    int pin = 0;
    for (int digit = 0; digit < 4; digit++) {
      pin = pin * 10 + randInt(3, 8);
    }
    return pin;
  }

  int randInt(int min, int max) {
    return min + (int) (Math.random() * (max - min + 1));
  }
}
