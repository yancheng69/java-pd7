class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    //create an array with know values
    int[] nums = {10,15,22,54,32};

    print(nums[0]); // first element
    print(nums[2]); // second element

    // number of elements in an array
    print(nums.length);
    //last element of an array
    print(nums[ nums.length-1]);

    arrayValues(nums);

    int[] newArray = createArrayOf10();
    arrayValues(newArray);

    int[] sqrNum = squares(newArray);
    arrayValues(newArray);
    
 
  }

  // write a function that prints all the elements of an array
  void arrayValues(int[] a){
    for(int x=0; x<= a.length-1; x++){
      print(a[x]);
    }
  }

  //create an array of 10 elements and return the array
  int[] createArrayOf10(){
    
    int[] nums = new int[10];
    for(int x=0; x<= nums.length-1; x++){
      nums[x] = randInt(-100,100);
    }
    return nums;
  }

  // create a function that accepts an array and
  // returns an array of the square of each value
  // from the array passed to it.

  int[] squares(int[] nums){
    
    int[] sqrs = new int[nums.length];
    
    for(int x=0; x<= nums.length-1; x++){
      sqrs[x] = (int)Math.pow(nums[x],2);
    }
    return sqrs;
    
  }
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}