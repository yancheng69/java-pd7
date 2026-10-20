class Main {
  
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

  
    
    //integer division truncates the decimal place 
    //and only get the integer part
    System.out.println(1/2);  //0
    System.out.println(3/2);  //1
    //How to avoid
    System.out.println(1.0/2); //0.5
    System.out.println(1/2.0); //0.5
  
    System.out.println("********************");
    //Modulus operator or remainder operator %
    System.out.println(1%2); //1
    System.out.println(3%2); //1
    System.out.println(7%3); //1
    System.out.println(5%2); //1
    System.out.println(6%2); //0

    // Classroom questions: remainder and operator order.
    System.out.println("2 % 5 = " + (2 % 5));
    System.out.println("12 % 5 = " + (12 % 5));
    System.out.println("2 * 3 % 5 = " + (2 * 3 % 5));
    System.out.println("6 / 2 % 3 = " + (6 / 2 % 3));
   


  }

  
}
