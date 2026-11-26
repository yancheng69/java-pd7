class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o); }
  void printt(Object o){ System.out.print(o); }

  void init(){
    print(toUpper("Hello, Java 24!"));
    print(genPswd());
  }

  String toUpper(String text) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (ch >= 'a' && ch <= 'z') {
        ch = (char)(ch - 'a' + 'A');
      }
      result.append(ch);
    }
    return result.toString();
  }

  String genPswd() {
    StringBuilder password = new StringBuilder();
    for (int i = 0; i < 8; i++) {
      password.append((char)randInt(33, 127));
    }
    return password.toString();
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
