class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //display the result of Math.random()
    print(Math.random());
    
    //What do we have to do to result to get numbers [0,10)? 
    //Multiply by the number of integers between 0 to 10(inclusive)
    //ie 10-0 =10
    print(Math.random()*(10));

    //What if we want to generate number from 0 to 10 inclusive
    //(10-1)+1 = 11 digits
    print(Math.random()*(11));

    //What if we wanted start at 1 to 10
    print(Math.random()*(10)+1);

    //Using casting to truncate the decimal places
    print( (int)(Math.random()*(10)+1) );

    //Generate random integers from 5 to 15
    print( (int)(Math.random()*(11)+5) );

    for(int x=0;x<=20; x++)
      printt(randInt(2,9)+" ");

  }

  //Write a function randInt that accepts a lower and upper
  //range of integers that will return a random integer 
  //from [a,b]

  int randInt(int a, int b){
    return (int)(Math.random()*(b-a+1))+a;
  }
}