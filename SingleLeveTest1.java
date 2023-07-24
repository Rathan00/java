
public class SingleLeveTest1 {

	public static void main(String[] args) {
		//Person personObj= new Person('M',"Rathan",23);
		//System.out.println("________________");
		//Person StudentObj= new Student();
		//System.out.println("________________");
		Person EmployeeObj= new Employee();
		System.out.println("________________");
		EmployeeObj.showEmployee();
	}}
class Person{
	private char gender;
	private String name; 
	private int age;
	
	Person(char gender,String name,int age){
		if(gender=='M' ||gender=='F') {
		this.gender=gender;}
		else {throw new RuntimeException("Invalid Gender...");}
		if(name.matches("^[a-zA-Z]*$")) {
		this.name=name;}
		else {throw new RuntimeException("Invalid Name...");}
		if(age>=1 && age<120) {
		this.age=age;}
		else {throw new RuntimeException("Invalid Age...");}
	}
	void showPerson() {
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Student extends Person{
	
	private int rollNumber;
	private String collage;
	private String stream;
	private float marks;
	Student(char gender,String name,int age,int rollNumber,String collage,String stream,float marks){
		super(gender,name,age);
		if(Validator.checkNumber(rollNumber,1,5000)) {this.rollNumber=rollNumber;}
		else {throw new RuntimeException("Invalid Roll Number...");}
		if(Validator.checkNumber(marks,1.0f,1000.0f)) {this.marks=marks;}
		else {throw new RuntimeException("Invalid Marks...");}
		if(Validator.checkString(collage)) {this.collage=collage;}
		else {throw new RuntimeException("Invalid Collage Name...");}
		if(Validator.checkString(stream)) {this.stream=stream;}
		else {throw new RuntimeException("Invalid Stream Name...");}
	}
	void showStudent() {
		super.showPerson();
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Collage Name: "+collage);
		System.out.println("Stream: "+stream);
		System.out.println("Marks: "+marks);
	}
}
class Employee extends Student{
	private empId;
	private company;
	
	Employee(){
		
	}
}

