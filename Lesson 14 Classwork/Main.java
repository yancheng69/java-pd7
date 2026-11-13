class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

    display0To10();
    display10To0();
    xSquare(10);
    range(1, 7, 2);
    compound(1000, 7, 3);
   
  }

  /*
    Write a function that generates and displays
    integers from 0 to 10.
  */
  void display0To10(){
    for(int i=0; i<=10; i++)
      System.out.print(i+" ");

    System.out.println(":end");
  }
  

  /*
    Write a function that generates and displays
    integers from 10 to 0 backwards
  */
  void display10To0(){
    for(int i=10; i>=0; i--)
      System.out.print(i+" ");

    System.out.println(":end");
  }

  /*
    Write a function that generates and displays
    2^i for i=1-10.

    Then modify code to pass the last i-th terms
  */
  void xSquare(int n){

    for(int i=1; i<=n; i++){
      
      System.out.println(i+" | "+Math.pow(2,i));
    }
    System.out.println(":end");
  }
  
  


  // Display the values from start to end, including end when reached.
  void range(int start, int end, int step) {
    if (step == 0) {
      throw new IllegalArgumentException("Step cannot be zero.");
    }
    for (long i = start; step > 0 ? i <= end : i >= end; i += step) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  // The rate is a percentage, so 7 means 7 percent per year.
  void compound(double investment, double rate, int years) {
    for (int year = 1; year <= years; year++) {
      investment = investment * (1 + rate / 100.0);
      System.out.printf("Year %d: %.2f%n", year, investment);
    }
  }
}
