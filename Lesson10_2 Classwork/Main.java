class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    // The four assigned Classroom problems.
    System.out.println(collegeApp(3.2, 1400));
    System.out.println(collegeApp(3.0, 1450));
    System.out.println(ecoFuel(40));
    System.out.println(ecoFuel(65));
    System.out.println(speedFine(60));
    System.out.println(speedFine(75));
    System.out.println(discount(100, 80, 80));
    System.out.println(discount(90, 90, 90));

    // Additional examples from the class discussion.
    System.out.println(covidTest(12));
    System.out.println(covidTest(10));
    
    System.out.println(weather1(69));
    System.out.println(weather1(40));

    System.out.println(weather2(69));
    System.out.println(weather2(40));

    System.out.println(playToday(67,9));
    System.out.println(playToday(67,16));

  }

  String collegeApp(double gpa, int satScore) {
    if (gpa >= 3.2 || satScore >= 1450) return "ACCEPTED";
    else return "Not Accepted";
  }

  String ecoFuel(double speed) {
    if (speed >= 40 && speed <= 65) return "Fuel Economy";
    else return "Not Optimal";
  }

  double speedFine(double speed) {
    if (speed >= 60 && speed <= 70) return 75;
    else if (speed > 70) return 75 + (speed - 70) * 2;
    else return 0;
  }

  // Return the TOTAL after any discount, as requested in Classroom.
  double discount(double item1, double item2, double item3) {
    double total = item1 + item2 + item3;
    if (total > 250 && (item1 >= 100 || item2 >= 100 || item3 >= 100)) {
      return total * 0.90;
    } else {
      return total;
    }
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
    if (temp>60 && temp<70 && (players == 9 || players==18) )
      return "Game is on!";
    else
      return "No Game today.";

  }

}
