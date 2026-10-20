class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init() {
    System.out.println(madlib("person", "loud", "runs"));
    System.out.println(squareArea(5));
    System.out.println(circleArea(3));
  }

  String madlib(String noun, String adjective, String verb) {
    return "The " + adjective + " " + noun + " " + verb;
  }

  double squareArea(double side) {
    return side * side;
  }

  double circleArea(double radius) {
    return Math.PI * radius * radius;
  }
}
