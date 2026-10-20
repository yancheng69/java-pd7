class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init() {
    // eq1.PNG: z = A raised to the power (2x + 1).
    System.out.println("Problem 1: Enter A:");
    double A = Input.readDouble();
    System.out.println("Problem 1: Enter x:");
    double x1 = Input.readDouble();
    double z = Math.pow(A, 2 * x1 + 1);
    System.out.println("z = " + z);

    // eq2.PNG: y = 2x / sin(3x). Java Math.sin uses radians.
    System.out.println("Problem 2: Enter x (in radians):");
    double x2 = Input.readDouble();
    double y = 2 * x2 / Math.sin(3 * x2);
    System.out.println("y = " + y);

    // eq3.PNG: b = absolute value of (x squared + 1).
    System.out.println("Problem 3: Enter x:");
    double x3 = Input.readDouble();
    double b = Math.abs(Math.pow(x3, 2) + 1);
    System.out.println("b = " + b);
  }
}
