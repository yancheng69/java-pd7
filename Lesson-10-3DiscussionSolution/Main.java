class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){

      System.out.println(DEFCON(1));
      System.out.println(DEFCON(3));
      System.out.println(DEFCON(5));
      System.out.println(DEFCON(10));
    
      System.out.println(letterGrade(93,90,97));
      System.out.println(letterGrade(85,86,87));
      System.out.println(letterGrade(69,70,74));
      System.out.println(letterGrade(44,50,60));

  
  }

  /*
      Write a function DEFCON that takes a defcon
      level and returns the exercise term as stated:

      DEFCON 5 - FADE OUT	
      DEFCON 4 - DOUBLE TAKE	
      DEFCON 3 - ROUND HOUSE	
      DEFCON 2 - FAST PACE	
      DEFCON 1 - COCKED PISTOL	
  */
  String DEFCON(int level){
        
    if(level == 1){
      return "COCKED PISTOL";
    }
    else if(level == 2){
       return "FAST PACE";
    }
    else if(level == 3){
       return "ROUND HOUSE";
    }
    else if(level == 4){
       return "DOUBLE TAKE";
    }
    else if(level == 5){
       return "FADE OUT";
    }
    else{
       return "UKNOWN LEVEL";
    }
  }
    
  /*
    Write a function called letterGrade that accepts 
    three grades, calculate the average  and returns a letter grade
    based on the average using the following:
      A : 90 or higer
      B : 89 - 80 (Inclusive)
      C : 79 - 65 (Inclusive)
      F : less that 65
  */

  char letterGrade(double g1,double g2, double g3){
    double grade = Math.round( (g1+g2+g3)/3);
    if(grade >= 90)
      return 'A';
    else if (grade<=89 && grade>=80)
      return 'B';
    else if (grade<=79 && grade>=65)
      return 'C';
    else
      return 'F';      
  
  }
    
    
  
}