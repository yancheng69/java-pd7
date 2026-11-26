class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void print(Object o){ System.out.println(o); }
  void printt(Object o){ System.out.print(o); }

  void init(){
    String original = Input.readFile("Original.txt");
    String encoded = encode(original);
    String decoded = decode(encoded);
    print("Encoded message:");
    print(encoded);
    print("Decoded message:");
    print(decoded);
  }

  String encode(String text) {
    return shift(text, 3);
  }

  String decode(String text) {
    return shift(text, -3);
  }

  String shift(String text, int amount) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      result.append((char)(ch + amount));
    }
    return result.toString();
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }
}
