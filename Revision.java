class Revision{
static int Q; 	// its class level variable
static long P;
static short T;
static float T1;
static double T2;
static String T3;
static boolean T4;
	public static void main(String args[]){
	System.out.println(Q);
	System.out.println(P);
	System.out.println(T);
	System.out.println(T1);
	System.out.println(T2);
	System.out.println(T3);
	System.out.println(T4);

	int a=12;	//its local variable
	System.out.println(a);
	System.out.println(add(10,60));
	System.out.println(sub(100,60));
	mul(10,40);
	System.out.println(s1("arbind "," akela"));
	System.out.println(validAgeForMarriage(30));
	}

	static  long add(int a, long b){
	return a+b;
	}
	static double sub(float a,float b){
	return a-b;
	}
	static int mul(int a,int b){
	int c=a*b;
	System.out.println(c);
	return c;
	}
	static String s1(String a,String b){
	return " welcom " +a+b;
	}
	static boolean validAgeForMarriage(int age){
		if(age<18){
			return false;
		}
		else{
			return true;
		}
	}
}
