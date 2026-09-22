class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/
   int x = 5;
   int y = 3; 
   float sum = x + y; 
   System.out.println(sum);


/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/
        double g1 = 78;
        double g2 = 92;
        double g3 = 85;
        double gradeSum = g1 + g2 + g3;
        System.out.println(gradeSum);


/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/
        double gradeAverage = gradeSum / 3.0; 
        System.out.println(gradeAverage);



/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
        double A = 12.0; 
        double eq1Result = A / (x + 1.0); 
        System.out.println(eq1Result);

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 
        double eq2Result = (2 * x * (x + 1) * (-x / 2.0)) / A;
        System.out.println(eq2Result);




/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 
        double b = 8.0;  
        double h = 5.0;  
        double area = 0.5 * b * h;
        System.out.println(area);




/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/
        int totalEggs = 100;
        int eggsPerBasket = 12;

        int fullBaskets = totalEggs / eggsPerBasket; 
        System.out.println(fullBaskets);

        int leftOverEggs = totalEggs % eggsPerBasket;
        System.out.println(leftOverEggs);


    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}