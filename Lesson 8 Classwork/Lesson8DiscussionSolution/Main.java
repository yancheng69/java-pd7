    /*    Functions (called Methods in Java)
      1)
      A method is a block of code which only runs when it is called.

      2) 
      You can pass data, known as parameters, into a method.

      3)
      Functions are used to perform certain actions

      4)
      Function can return data.

      5)
      Why use function? To reuse code: define the code once, and use it many times.

      Summary:
      
      Functions usually "take in" data, process it, and "return" a result. Once a function is written, it can be used over and over and over again 

    */


    

class Main {

 	public static void main(String[] args) {
    	(new Main()).init();
	}

  void welcome(){
    System.out.println("Welcome...");
  }

  void welcome2(String name){
    System.out.println("Welcome " + name + " to Java!");
  }

  String welcomeMsg(String name){
    return "Welcome " + name + " to java programming class";
  }

  double meterToInches(double m){
    // 1 meter = 39.37
    return  m * 39.37;
  }

  void init() {
    // call the functions and test them
    welcome();

    welcome2("Jose");

    String msg = welcomeMsg("Hao");
    System.out.println(msg);
    
    double inches = meterToInches(1);
    System.out.println(inches+" inches");

  }



}