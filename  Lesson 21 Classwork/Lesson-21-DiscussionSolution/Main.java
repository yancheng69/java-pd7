class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    
  //Third part add the do you want to play again loop
    char playAgain = 'y';
    while( !(playAgain !='y') ){
      guessGame();
      print("Enter \"y\" if want to play again.");
      playAgain = Input.readChar();        
    }
  }

  
  
  void guessGame(){
    int num = randInt(1,10);
    print("num:"+num);
    int guess =-1;
    //add a limit on the number of tries
    int tries=0;
    while(guess != num){
      print("Guess a number from 1 to 10");
      guess = Input.readInt();
      tries++;
      // add has second part
      if(guess < num){
        print("Guess higher");
      }
      else if(guess>num){
        print("Guess lower");
      }
      else{
        print("Correct! in "+tries+" tries.");
      }
    }
   

  }
  
  int randInt(int a, int b){
    return (int)(Math.random()*(b-a+1)+a);
  }
}