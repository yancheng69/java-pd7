class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    print(addNums());
    print(generatePin());
  }

  String addNums(){
    int first = randInt(-5, 50);
    int second = randInt(-5, 50);
    return first + " + " + second + " = ?";
  }

  int generatePin(){
    int pin = 0;
    for (int x = 0; x < 4; x++){
      pin = pin * 10 + randInt(3, 8);
    }
    return pin;
  }

  int randInt(int lower, int upper){
    return lower + (int)(Math.random() * (upper - lower + 1));
  }
}
