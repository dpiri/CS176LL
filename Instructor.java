/**public 
   An instructor is represented by a name, a birth year, and a salary.
   You must enter the class name, instance variable(s), and constructor below
*/
public class Instructor extends Person {

	private double salary;

	
	 public Instructor(String name, String birthday, double salary) {
		 
		super (name, birthday);
		
		this.salary = salary;		
	}
		
	
   /**
      Returns the string representation of the object.
      @return a string representation of the object
   */
   public String toString()
   {
      return "Instructor[super=" + super.toString() + ",salary=" + salary + "]";
   }
}