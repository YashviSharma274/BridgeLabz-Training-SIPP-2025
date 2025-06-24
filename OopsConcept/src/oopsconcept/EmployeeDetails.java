package oopsconcept;

class Employee{
	private String name;
	private int id;
	private int age;
	Employee(String name,int id,int age){
		this.name=name;
		this.id=id;
		
		this.age=age;
	}
	void displayDetails() {
		System.out.println("Name: " + name + ", ID: " + id + ", Age: " + age);
	}
	}
public class  EmployeeDetails{
     public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	  Employee employee=new Employee("Yashvi",2704,20);
	  employee.displayDetails();
  }
	
     }





