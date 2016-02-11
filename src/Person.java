
public class Person implements Info{

	private String name;
	
	public Person(String name) {
		
		this.name = name;
	}

	public void greet(){
		
		System.out.println("Hello there "+name);
	}
	
	

	public void showInfo(){
		System.out.println("I'm a human and my name is "+ name);
	}
	
	
}
