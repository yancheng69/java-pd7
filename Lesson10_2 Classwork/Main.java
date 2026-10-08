class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(covidTest(12));
    System.out.println(covidTest(10));
    
    System.out.println(weather1(69));
    System.out.println(weather1(40));

    System.out.println(weather2(69));
    System.out.println(weather2(40));

    System.out.println(playToday(67,9));
    System.out.println(playToday(67,16));

  }

      /*
    Write a function covidTest that takes a gradeLevel 
    (ie, 9,10,11,12) and returns a string "Test today"
    for either freshmen or seniors, otherwise
    return "Not today"
    */
  String covidTest(int gradeLevel){
    if(gradeLevel == 9 || gradeLevel==12)
      return "Test today";
    else
      return "Not today";
  }
   
    
    /*
    Write a function called weather1 that takes a 
    temperature and returns a string "Nice Weather"
    if the temperature is between 60 and 80 degrees 
    inclusive (ie includes 60 and 80) otherwise return
    "Not Nice Weather"
    
    We can do this in using a nested if statement or
    using the and logical operator
    */
    String weather1(double temp){
      if (temp>=60)
          if(temp<=80)
            return "Nice Weather";
          else
            return "Not Nice Weather";
      else 
        return "Not Nice Weather";
    }

    /*
    Write a fuction weather2 that is the same as the
    function weather2 except do not use nested if 
    statements.
    */
    String weather2(double temp){
      if (temp>=60 && temp<=80)
        return "Nice Weather";
      else
        return "Not Nice Weather";
    }

    
    /*
      Write a function playToday that accepts a t
      emperature and number of players and returns 
      a string display "Game is on!" if the temperature 
      is between 60 and 70 exlusively (not including 
      60 and 70) and the number of players is 9 or 18,
      otherwise return "No Game today."
    */

  String playToday(double temp, int players){
    if (temp>=60 && temp<=70 && (players == 9 || players==18) )
      return "Game is on!";
    else
      return "No Game today";

  }

}