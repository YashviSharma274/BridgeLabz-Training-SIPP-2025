package constructors;

public class Person {
private String name;
private int age;
Person(){
	name="name";
	age=0;
}
Person(String name,int age){
	this.name=name;
	this.age=age;
}
Person(Person copyPerson){
	this.name=copyPerson.name;
	this.age=copyPerson.age;
}
public void displayDetails()
{
	System.out.println("Name of the original peroson: ");
	System.out.println("Age of the original person: ");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Person originalperson=new Person("Yashvi",20);
	originalperson.displayDetails();
	Person cloneperson=new Person(originalperson);
	System.out.println("the clone person copy of original person");
	cloneperson.displayDetails();
	}

}
