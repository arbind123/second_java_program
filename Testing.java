class Testing{
	
	//main method call of below method

	public static void main(String args[]){
	add(10,20);
	System.out.println(add1(20,30,50));
	System.out.println(mul(2,3,4));
	add2(40,60);
	mul2(2,6);
	System.out.println(greet("arbind"));
	System.out.println("Welcome baba "+greet1("Love"));
	}
	

	//method creation short code of return statement
	static void add(int a,int b){
	System.out.println(a+b);
	}

	// add1 method
	static int add1(int a,int b,int c){
	return (a+b+c);
	}

	//mul method
	static int mul(int s,int f,int y){
	return(s*f*y);
	}
	
	//second add2 method
	static void add2(int s,int q){
	int r = s+q;
	System.out.println(r);
	}
	
	// third mul method
	static int mul2(int g,int h){
	int k = g*h;
	System.out.println(k);
	return k;
	}
	
	static String greet(String name){
	return "welcom "+name;
	}
	static String greet1(String name1){
	String n = name1;
	return n;
	}
}