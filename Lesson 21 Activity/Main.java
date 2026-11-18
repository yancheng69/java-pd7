class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    menu();
  }

  int allowance(){
    int day = 1;
    int cents = 1;
    while (cents < 500){
      cents *= 2;
      day++;
    }
    return day;
  }

  void addTwoNumbers(){
    int a = randInt(1, 11);
    int b = randInt(1, 11);
    print("What is " + a + " + " + b + "?");
    int guess = Input.readInt();
    while (guess != a + b){
      print("Wrong, try again.");
      guess = Input.readInt();
    }
    print("Correct!");
  }

  long GCF(int a, int b){
    long x = Math.abs((long) a);
    long y = Math.abs((long) b);
    while (y != 0){
      long remainder = x % y;
      x = y;
      y = remainder;
    }
    return x;
  }

  void rockPaperScissors(){
    while (true){
      print("Choose 1 for rock, 2 for paper, or 3 for scissors.");
      int player = Input.readInt();
      if (player < 1 || player > 3){
        print("Please enter 1, 2, or 3.");
      } else {
        int computer = randInt(1, 4);
        String[] moves = {"rock", "paper", "scissors"};
        print("Computer chose " + moves[computer - 1] + ".");
        if (player == computer){
          print("Draw! Play again.");
        } else {
          if ((player == 1 && computer == 3) ||
              (player == 2 && computer == 1) ||
              (player == 3 && computer == 2)){
            print("You win!");
          } else {
            print("You lose!");
          }
          return;
        }
      }
    }
  }

  void menu(){
    print("Welcome to Looney Tune's System");
    int choice = 0;
    while (choice != 4){
      print("1 - Allowance");
      print("2 - Addition game");
      print("3 - Calculate the GCF of two integers");
      print("4 - Exit");
      print("5 - Rock, paper, scissors (bonus)");
      choice = Input.readInt();

      if (choice == 1){
        print("The penny reaches $5 or more on day " + allowance() + ".");
      } else if (choice == 2){
        addTwoNumbers();
      } else if (choice == 3){
        print("Enter the first integer:");
        int a = Input.readInt();
        print("Enter the second integer:");
        int b = Input.readInt();
        if (a == 0 && b == 0){
          print("Two zeros have no greatest common factor.");
        } else {
          print("GCF: " + GCF(a, b));
        }
      } else if (choice == 5){
        rockPaperScissors();
      } else if (choice != 4){
        print("Please enter a number from 1 to 5.");
      }
    }
  }

  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}
