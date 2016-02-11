
public class App {

	public static void main(String[] args) {
		
		//creates two objects 
		Machine mach1 = new Machine();
		Person employee1 = new Person("Johnny");
		
		//runs the greet method in the Person class
		employee1.greet();
		
		//creates an Interface of a new machine and runs it's showInfo mehtod
		Info info1 = new Machine();
		info1.showInfo();
		
		//connects employee1 to the Interface info2 and run's it's showInfo mehtod
		Info info2 = employee1;
		info2.showInfo();
		
		outputInfo(mach1);
		outputInfo(employee1);
		
		
	}
	
	private static void outputInfo(Info info){
		info.showInfo();
	}

}
