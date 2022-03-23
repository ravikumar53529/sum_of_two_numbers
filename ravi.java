public class ravi{                                                      //class
	/*
	//new method 
	static void myNew(){                                        //1st method
		System.out.println("ravikumar");
	}
	static void myCar() {                                        //2nd method
		
		System.out.println("i want to buy a car");               //inbuilt method 
	}
	static void methodParameter(String myName) {
		System.out.println(myName);
	}
	static void mulPara(String id,int age) {                     //multiple parameters
		
		System.out.println(id  + "  age is "+age);
	}
	public static void main(String args[]) {
		myNew();                                                //method calling 
		myCar();
	    myCar();
	    myCar();
		methodParameter("ravikumar");                         //parameter insert
		methodParameter("galinki");
		mulPara("galinki ravkimar",26);
	//method overloading 
	
	static void addition(int x, int y) {
		
		System.out.println(x+y);
	}
	static void addition (String name ) {
	System.out.println(name);
	}
	public static void main (String args[]) {
		addition("ramanagalinki");                              //method overloading 
	   addition(5,15);
	
	
	
	final int x=10;
	      int y=90;
	
	public static void main (String args[]) {
		
		ravi myObj=new ravi();
		ravi myObj2=new ravi();
		System.out.println(myObj.x);
		myObj2.y=50;
		System.out.println(myObj2.y);
		
	
	//class and method 
	
	public  void myMethod(){
		
		System.out.println("public methods must be called by creatig objects  ");
	}
	
	static void myMethod1() {
		System.out.println("static method called by witout object");
		
		
	}
	
	public static void main(String args[]) {
		
		myMethod1();
		
		ravi myobj=new ravi();
		myobj.myMethod();
	}


	//java constructor 
	
	int x;
	
	public ravi() {                      //class constructor 
		 x=5;
	}
	public static void main (String args[]) {
		
		ravi myobj=new ravi();
		System.out.println(myobj.x);
	}
	
	
	*/
	//java constructors 
	
	String  myName;
	String  myQuali;
 public ravi(String x,String y) {
	  myName=x;
	  myQuali=y; 
 }
 
 public static void main (String args[]) {
	 
	 ravi myobj= new ravi("ravikumar galinki","my qualification is M.TECH");
	 
	 System.out.println(myobj.myName+"and"+myobj.myQuali);
 }
 
 
 }
	
	
	
	
	

	
	
	
	
	
	
	
	
	   
	
	

	
	
	
	
	
	
