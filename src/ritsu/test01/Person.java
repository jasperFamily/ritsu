package ritsu.test01;

public class Person {

	private String name ="";
	private String tokui= "";
 
	public Person(String name, String tokui) {
		this.name = name;
		this.tokui = tokui;
	}
	
	public String getName() {
		return name;
	}
	
	public String getTokui () {
		return tokui;
	}
	
	public String toString() {
		return name + " = "+ tokui;
	}
}
