class Author{
	private String name;
        String email;
        char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public String getname(){
		return name;
	}
	public String setemail(){
		this.email=email;
	}
	public String getemail(){
		 return email;
	}

	public void getgender(){
		this.gender=gender;
	}
	public String tostring(){
		return "Author[name="+name+",email="+email+",gender="+gender+"]";
	}
}
class Task1{
	public static void main(String[] args) {
		Author a=new Author("Santosh","Santoshmadani@gmail.com",'m');
		System.out.println(a.getname());
		System.out.println(a.getemail());
		System.out.println(a.getgender());
		a.tostring();
	}
}