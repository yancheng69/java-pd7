class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  
  void init(){

    print(spaces(10)+"DONE");

    print("harmonic: "+harmonic(5));
    print("Sine: "+sine(6,Math.PI/6));
    
    fib(0);
    fib(1);
    fib(2);
    fib(3);
    fib(10);

    mTable();

    //Test nCr function


    print(nCr(3,0));
    print(nCr(3,1));
    print(nCr(5,2));
    print(nCr(5,3));
    print(nCr(5,4));
    print(nCr(5,5));
    
    //binomialCoefficients(5);
    
  }

  //#1
  String spaces(int N){
    String bld = "";
    
    for(int x=0; x<N;x++){
      bld+=" ";
    }
    return bld;
  }

  //#2
  double harmonic(int N){
    double sum=0;
    for(int x=1; x<=N; x++){
      sum += 1./x;
    }
    return sum;
  }

  //#3
  double sine(int N, double x){
    double sum=0;
    int sign=1;
    for(int i=1; i<2*N;i+=2){
      sum+= sign * Math.pow(x,i)/fact(i);
      sign*=-1;
    }
    return sum;
  }

  double sine2(int N, double x){
    double sum=0;
    for(int i=0; i<=N;i++){
      sum+= (Math.pow(-1,i)*Math.pow(x,2*i+1))/fact(2*i+1);
    }
    return sum;
  }

  //#4
  void fib(int n){
    int f1=0,f2=1;
    int f=0;
    if(n==1)
      print(f1);
    else if(n==2)
      print(f1+"\n"+f2);
    else
            print(f1+"\n"+f2);

    for(int x=3;x<=n; x++){
      f=f1+f2;
      print(f);
      f1=f2;
      f2=f;
    }
  }
  
  //#4
  String tableRow(int n){
    String bld =String.format("|%3d|", n); 
    
    for(int x=1;x<=12;x++){
      bld += String.format("|%3d", x*n);
    }
    return bld+"|";
  }

  void mTable(){
    String heading ="    |";
    String heading2="_____";
    for(int x=1; x<=12;x++){
      heading+=String.format("|%3d",x);
      heading2+=String.format("____");
    }
    print(heading+"|");
    print(heading2+"_");
    
    //Now create each row of the table
    for(int x=1; x<=12;x++)
      print(tableRow(x));
    
  }

  //Bonus
  int fact(int n){
    if(n==0)
      return 1;
    else{
      int f=1;
      for(int x=2;x<=n; x++)
        f*=x;

      return f;
    }   
  }

  int nCr(int N, int R){
    return fact(N)/(fact(R)*fact(N-R));
  }

 
  void binomialCoefficients(int n){
    for(int x=0; x<=n; x++){
      printt(nCr(n,x)+" ");
    }
  }

  
}