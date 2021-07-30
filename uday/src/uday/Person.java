package uday;

public class Person {
	String name;
	int age;
	char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}


public Person() {
	
}
public Person(String name,int age,char gender) {
	super();
	this.name=name;
	this.age=age;
	this.gender=gender;
}

@Override
public boolean equals(Object obj) {
	if(obj==null) {
		return false;
	}
	if(!( obj instanceof Person)) {
		return false;
	}
	Person other=(Person)obj;
	if(!(this.name.equals(other.name)))
		return false;
	if(this.age!=other.age)
		return false;
	if(this.gender!=other.gender)
		return false;
	return true;
}
}
