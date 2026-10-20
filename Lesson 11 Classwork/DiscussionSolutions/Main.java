class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    String msg = "cat ate";

    int n = msg.length();
    System.out.println(n);

    // getting pieces of a string using substring()
    String first3 = msg.substring(0,3);
    System.out.println(first3);

    String last3 = msg.substring(4,7);
    System.out.println(last3);

    // function is overloaded
    String last3_1 = msg.substring(4);
    System.out.println(last3_1);

    //How do we get the last character of a string
    String lastChar = msg.substring(msg.length()-1);
    System.out.println(lastChar);

    /*
      Name has the following format: last name and first name 
      seperated by a comma. Extract the first and last name.
    */
    String name = "pan,peter";
    
    n = name.indexOf(",");
    String fName = name.substring(0,n);
    String lName = name.substring(n+1);
    System.out.println("First name "+fName);
    System.out.println("Last name "+lName);
  }
    
}