class Geo{
	public void same(int lenght , int breadth){
		System.out.println("the area of rectangle is="+(lenght*breadth));
	}
public void same(int area){
	System.out.println("the area of sqaure is="+(area*area));
}

	}

class Task4{
	public static void main(String[] args) {
		Geo g1=new Geo();
		g1.same(5,6);
		g1.same(5);
	}
}