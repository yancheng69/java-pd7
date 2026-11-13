import java.util.*;
class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){System.out.println(o);}

  String rollDice(){
    //https://www.htmlsymbols.xyz/games-symbols
    String[] dice = {"\u2680","\u2681","\u2682","\u2683","\u2684","\u2685"};
    String build = "";
    int d1 = randInt(0,dice.length);
    int d2 = randInt(0,dice.length);
    int total = (d1+1) + (d2+1);
    build = dice[d1] + " " + dice[d2];
    if(total == 7 || total == 11){
      build += " You Win!";
    }else{
      build += " You Lose! Try again.";
    }
    return build;
  }

  String drawCard(){
    String[] suit = {"1F0A","1F0B","1F0C","1F0D"};
    String[] endings = {"A","B","C","D","E"};
    String[] cards = new String[52];
    String card;
    int pos = 0;
    for(int i = 0; i < suit.length;i++){
      for(int j = 0; j < 13;j++){
        if(j < 9){
          card = suit[i] + (j+1); 
        }else{
          card = suit[i] + endings[(j-9)]; 
        }
        cards[pos] = String.valueOf(Character.toChars(Integer.parseInt(card, 16)));
        pos++;
      }
      
    }
    print("How many cards to you want?");
    int amt = Input.readInt();
    String build = "";
    for(int i = 0; i < amt; i++){
      build += cards[ randInt(0,cards.length)] + " ";
    }
    return build;
  }

  void watchingYou(){
    clearScreen();
    String build = "";
    String data = Input.readFile("faces.txt");
    String[] faces = data.split("\n");
    for(int j = 0; j < 3; j++){
      for(int i = 0; i < faces.length; i++ ){
        build += faces[i] + "\n";
        if(i % 5 == 0 && i != 0){
          print(build);
          pause(200);
          build = "";
          clearScreen();
        }
      }      
    }
  }

  void menu(){
    print("Welcome to \"Easy Life\" Computing!");
    print("-----------------------------------");
    print("Select from the following choices:");
    print("1) Roll a dice");
    print("2) Draw a card");
    print("3) Who's watching me?");
    print("4) Exit \"Easy Life\" Computing!");
    print("-----------------------------------");
    System.out.print("Choice: ");    
  }


  void init(){

    
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

  void pause(int ms){
    try{
      Thread.sleep(ms);
    }catch(InterruptedException ie){
        
    }
  }
  public void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
} 
 
}