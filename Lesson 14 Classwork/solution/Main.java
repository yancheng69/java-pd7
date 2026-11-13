class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    range(1,8,2);
    compound(1000,0.07, 5);

    System.out.println(fact(5));
    
  }

  void range(int start, int end,int step){
    System.out.println(start+","+end +','+step);
    for(int x=start; x<=end; x+=step){
      System.out.print(x+" ");
    }
    System.out.println();
  }
  
  void compound(double amt, double rate, int years){
    double newAmt=0;
    for(int x=1; x<=years;x+=1){
      newAmt = amt*Math.pow(1+rate,x);
      System.out.println("Year "+x+" : "+newAmt);
    }
  }

  
}