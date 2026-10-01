class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  // Problem 1
  void print(String message) {
    System.out.println(message);
  }

  // Problem 2
  double FtoC(double fahrenheit) {
    double result = (fahrenheit - 32) * 5.0 / 9.0;
    return result;
  }

  // Problem 3
  double sphereVolume(double radius) {
    double result = (4.0 / 3.0) * Math.PI * radius * radius * radius;
    return result;
  }

  // Problem 4
  double coneVolume(double radius, double height) {
    double result = (1.0 / 3.0) * Math.PI * radius * radius * height;
    return result;
  }

  // Problem 5
  double distance(double x1, double y1, double x2, double y2) {
    double result = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    return result;
  }

  void init() {
	print("Hello, Java!");
    print("32 F in Celsius: " + FtoC(32)); // Expected: 0.0
    print("212 F in Celsius: " + FtoC(212)); // Expected: 100.0
    print("Sphere volume (radius 3): " + sphereVolume(3)); // About 113.097
    print("Cone volume (radius 3, height 4): " + coneVolume(3, 4)); // About 37.699
    print("Distance from (0, 0) to (3, 4): " + distance(0, 0, 3, 4)); // Expected: 5.0

  }
}
