class Static{
	public static void add(int a,int b){
	System.out.println("the addition of "+a+" and "+b+" is "+(a+b));
	}
}
class Task6{
	public static void main(String[] args) {
		Static.add(6,5); // no need of object when you use static keyword. it can direct be call
			}
}
