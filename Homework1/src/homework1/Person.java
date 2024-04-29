package homework1;


public class Person {
	String firstName = "";
	String lastName  = "" ;
	String streetAddress = "" ;
	String city = "" ;
	String zipCode = "" ;
	
	public static void main(String []args) {
		Person p1 = new Person();
		p1.firstName = "Jane";
		p1.lastName = "Doe" ;
		p1.streetAddress = "123 example way" ;
		p1.city = "Anytown" ;
		p1.zipCode = "12345" ;
		Person p2 = new Person();
		p2.firstName = "Ash" ;
		p2.lastName = "Ketchum" ;
		p2.streetAddress = "456 trainer ln" ;
		p2.city = "Ryme City" ;
		p2.zipCode = "89765" ;
	
		p1.print();
		p2.print();
	}
	public void print() {
		System.out.println(String.format("First Name: %s ",this.firstName));
		System.out.println(String.format("Last Name: %s",this.lastName));
		System.out.println(String.format("Address: %s",this.streetAddress));
		System.out.println(String.format("City: %s",this.city));
		System.out.println(String.format("Zipcode: %s",this.zipCode));
		
		
		
		
	}
}
