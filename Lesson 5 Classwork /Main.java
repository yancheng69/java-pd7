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
    System.out.println(6%2); //1
   


  }

  
}