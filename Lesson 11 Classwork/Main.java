class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   

// Problem 1
String getUsername(String email) {
    int atIndex = email.indexOf("@");
    return email.substring(0, atIndex);
}

// Problem 2
String splitReverse(String text) {
    int middle = text.length() / 2;
    return text.substring(middle) + text.substring(0, middle);
}

// Problem 3
String createUsername(String firstName, String lastName, String osis) {
    String firstLetter = firstName.substring(0, 1);
    String lastFour = osis.substring(osis.length() - 4);
    return firstLetter + lastName + lastFour;
}

// Part 2
void init() {
    System.out.println(getUsername("joexyz@gmail.com"));
    System.out.println(splitReverse("Happy Days"));
    System.out.println(createUsername("John", "Doe", "123456789"));
}

    
  }

  
  
}