import java.math.BigInteger;

class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
      void init(){
    print(spaces(5) + "DONE");
    print("harmonic(5): " + harmonic(5));
    print("sin(pi/6): " + sin(8, Math.PI / 6));
    print("First 6 Fibonacci numbers:");
    fib(6);
    mTable();
    print("nCr(5, 2): " + nCr(5, 2));
    biCoeff(5);
    biCoeff(4);
  }

//Challenge 1:
  String spaces(int N) {
    String bld = "";

    for(int x=0 ; x<N ;x++){
      bld+=" ";
    }
    return bld;
  }



//Challenge 2:
  double harmonic(int N) {
    double sum = 0;
    for (int x = 1; x <= N; x++) {
      sum += 1. / x;
    }
return sum;
  }
//Challenge 3:
  // Sum the first N terms of the sine series, with x in radians.
  double sin(int N, double x) {
    double sum = 0;
    double term = x;
    for (int i = 0; i < N; i++) {
      sum += term;
      term *= -x * x / ((2.0 * i + 2) * (2.0 * i + 3));
    }
    return sum;
  }

  long fact(int N) {
    if (N < 0 || N > 20) {
      throw new IllegalArgumentException("N must be between 0 and 20.");
    }
    long product = 1;
    for (int i = 2; i <= N; i++) {
      product *= i;
    }
    return product;
  }



// Challenge 4: Print the first N Fibonacci numbers without integer overflow.
  void fib(int N) {
    BigInteger first = BigInteger.ZERO;
    BigInteger second = BigInteger.ONE;
    for (int i = 0; i < N; i++) {
      if (i > 0) printt(", ");
      printt(first);
      BigInteger next = first.add(second);
      first = second;
      second = next;
    }
    print("");
  }



//Challenge 5:
  void nRow(int row) {
    System.out.printf("%5d", row);
    for (int column = 1; column <= 12; column++) {
      System.out.printf("%5d", row * column);
    }
    print("");
  }

  void mTable() {
    System.out.printf("%5s", "x");
    for (int column = 1; column <= 12; column++) {
      System.out.printf("%5d", column);
    }
    print("");
    for (int row = 1; row <= 12; row++) {
      nRow(row);
    }
  }



//Bonus Challenge:
  long nCr(int N, int R) {
    if (R < 0 || R > N) {
      throw new IllegalArgumentException("R must be between 0 and N.");
    }
    return fact(N) / fact(R) / fact(N - R);
  }

  void biCoeff(int N) {
    for (int R = 0; R <= N; R++) {
      if (R > 0) printt(" ");
      printt(nCr(N, R));
    }
    print("");
  }




  
}