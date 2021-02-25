
public class Person {
	private String name;
	public Person()
	{
		this.name="";
	}
	public String getName() {
		return this.name;
	}
	public void setName(String nameString) 
	{
		this.name=nameString;
		System.out.println("The name is set to "+nameString);
	}
}
