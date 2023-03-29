package practicalrevision;

public class AboutOverriding {

	
	
	public  void as(int a) {
	System.out.println("print a");
	}
	
	public class overriding extends AboutOverriding {
		
	public void as(int b) {
	System.out.println("print b");	
	}
	}
	
	
	public static void main(String[] args) {
		AboutOverriding  objOfover = new AboutOverriding();
		objOfover.as(0);
	//	overriding	ObjOfor=new overriding();//   not possible
		//ObjOfor.as(0);
	}

}
