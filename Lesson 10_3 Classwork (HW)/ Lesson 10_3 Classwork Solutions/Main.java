class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }

  void init(){
    System.out.println(groupSavings(5));
    System.out.println(groupSavings(16));
    System.out.println(groupSavings(20));
    System.out.println(groupSavings(0));

    System.out.println(groceryDiscount(150,4));
    System.out.println(groceryDiscount(150,2));
    System.out.println(groceryDiscount(250,5));
    System.out.println(groceryDiscount(250,4));

        
  }

    /*
      Problem 1:      
      Write a function groupSavings that takes number of tickets wanting 
      to purchase. Return the total cost by apply the following discount:
      1 to 8 tickets  : each ticket cost $11,
      9 to 16 tickets : each ticket cost $10.50
      over 16 tickts  : each ticket cost $8.50
    */
    double groupSavings(int tickets){
      if(tickets>=1 && tickets<=8)
        return 11*tickets;
      else if (tickets>=9 && tickets <=16)
        return 10.5*tickets;
      else if (tickets >16)
        return tickets*8.5;
      else
        return 0;
    }
    /*
      Write a function groceryDiscount that takes the total amount spent at 
      a grocery store and the number of cans of beans purchased.
      Depending on the total amount and number of can of
      beans purchase, you get a savings on their total bill.
      Return the savings amount:
        Spent $100 to $200 and purchase at least 3 cans of 
        beans: $10 savings
        Spent over $200 and purchase more than 4 cans 
        of beans: $25 savings
        Otherwise: $0 savings.
    */
    double   groceryDiscount(double amt, int cans){

      if(amt>=100&&amt<=200 && cans>=3)
        return 10;
      else if(amt>200 && cans>4)
        return 25;
      else
        return 0;

    }
}