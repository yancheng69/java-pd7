class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    int ascii = (int)'A';
    print(ascii);

    char ch = (char)90;
    print(ch);

    //Introduce charAt by going through a string one
    //character at a time and display the ascii value
    String msg = "welcome";
    for(int x=0; x<=msg.length()-1; x++){
      ch = msg.charAt(x); // get the character
      print( ch+ " ascii value: "+ (int)ch );
    }

    //Generate a string of the alphabet A-Z
    String bld = "";
    for(int x=65; x<=90;x++){
      bld+= (char)x;
    }
    print(bld);
    
    //Genenrate a string of 10 random letters from 
    bld="";
    
    for(int x=1; x<=10;x++){
      ascii = randInt(65,90);
      bld+= (char)ascii;
    }
    print(bld);
    

  }

 
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}