/**
   A person is represented by the name and a birth year.
   You must enter the class name, instance variable(s), and constructor below
*/

public class Person {

	private String name;
	
	private String birthday;
	
	
	public Person(String name, String birthday) {
		
		this.name = name;
		
		this.birthday = birthday;		
		
		
	}
	
/**
      Returns the string representation of the object.
      @return a string representation of the object
*/
   public String toString()
   {
      return "Person[name=" + name + ",birthYear=" + birthday + "]";
   }
}