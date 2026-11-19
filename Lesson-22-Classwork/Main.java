class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[] friends = {"Alex", "Sam", "Jordan"};
    for (int x = 0; x < friends.length; x++){
      print(friends[x]);
    }

    double[] celsius = {-40, 0, 37.5, 100};
    double[] fahrenheit = convert(celsius);
    for (int x = 0; x < fahrenheit.length; x++){
      print(celsius[x] + " C = " + fahrenheit[x] + " F");
    }
  }

  double[] convert(double[] celsius){
    double[] fahrenheit = new double[celsius.length];
    for (int x = 0; x < celsius.length; x++){
      fahrenheit[x] = celsiusToFarhenheit(celsius[x]);
    }
    return fahrenheit;
  }

  

  double celsiusToFarhenheit(double c){
        return c*9/5+32;
  }
}
