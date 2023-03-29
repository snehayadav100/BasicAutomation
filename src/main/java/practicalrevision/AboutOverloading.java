package practicalrevision;

public class AboutOverloading {
	
public  void overll(int a) {
System.out.println(2);	
}
public void overll(String name)	{
System.out.println("sneha");
}
public void Overll() {
System.out.println("print");	
	
}
	
	
	

	public static void main(String[] args) {
		AboutOverloading Objofoverl=new AboutOverloading();
		Objofoverl.overll(0);
		Objofoverl.overll(null);
		Objofoverl.Overll();
	}

}
