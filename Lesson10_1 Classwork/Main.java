class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init() {
    System.out.println(discount(100));
    System.out.println(discount(150));
    System.out.println(honors(90));
    System.out.println(honors(89));
    System.out.println(shortSize(35));
    System.out.println(shortSize(36));
  }

  // Return the discount RATE, not the discounted bill.
  double discount(double amount) {
    if (amount > 100) return 0.10;
    else return 0.0;
  }

  String honors(double gpa) {
    if (gpa >= 90) return "Honor Student";
    else return "Work harder";
  }

  String shortSize(double waist) {
    if (waist < 36) return "Medium";
    else return "Large";
  }
}
