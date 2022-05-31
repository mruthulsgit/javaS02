class Person{
String name,gender,address;
int age;
Person(String name,String gender,String address,int age){
	this.name=name;
	this.gender=gender;
	this.address=address;
	this.age=age;
	}
}
class Employee extends Person{
int emp_id,salary;
String comp_name,quali;
Employee(int emp_id,String comp_name,String quali,int salary,String name,String gender,String address,int age){
	super(name,gender,address,age);
	this.emp_id=emp_id;
	this.comp_name=comp_name;
	this.quali=quali;
	this.salary=salary;
	}
}
class Teacher extends Employee{
String subject,dep;
int teach_id;
Teacher(String subject,String dep,int teach_id,int emp_id,String comp_name,String quali,int salary,String name,String gender,String address,int age){
	super(emp_id,comp_name,quali,salary,name,gender,address,age);
	this.subject=subject;
	this.dep=dep;
	this.teach_id=teach_id;
	}

void display(){
	System.out.println("Teacher id:"+teach_id+" Subject :"+subject+" Department :"+dep+" Employee id:"+emp_id+" Company name:"+comp_name+" Qualification :"+quali+" Salary :"+salary+" Name :"+name+" Gender :"+gender+" Address :"+address+" Age :"+age);
	}
}
class MultiLevelInheritance{
	public static void main(String []args){
	Teacher obj[]=new Teacher[2];
	obj[0]=new Teacher("Malayalam","Ma malayalam",239,1007,"xyzz","MA Malayalam",52000,"Indu","Female","tvm",27);
	obj[1]=new Teacher("Network","MCA",240,1009,"abcd","PHD in IT",85000,"laya","female","calicut",34);
	System.out.println("The details of Teachers");
	System.out.println();
	obj[0].display();
	obj[1].display();
	}
}
