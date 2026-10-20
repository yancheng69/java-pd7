class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
   

    //Comparing if two strings are equal

    String s1 = "Larry";
    String s2 = "Mo";

    System.out.println(s1.equals("Larry"));
    System.out.println(s1.equals(s2));
    
    if(s1.equals("Larry"))
      System.out.println("Larry is Larry");
    
    // How to ignore case sensitivity 
    // when comparing strings
    if(s1.equalsIgnoreCase("larry"))
      System.out.println("Larry is still larry");

    // How check if a string is not equal to another string
    if( !s1.equals(s2) ){
      System.out.println("Strings are not equal");
    }

    // Call math and computer science course codes begin
    // with the letter "M". 
    //How can we check for math and CS course
    String course = "MKUFTC";
    if (course.substring(0,1).equals("M"))
      System.out.println("This is a math/CS course");
  }

}