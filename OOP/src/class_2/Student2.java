package class_2;


public class Student2 {

	private String name;
	private String address;
	private String phone;
	private int age;
	
	Student2(String name, String address, String phone, int age) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.age = age;
		// this.printinfo();
	}
	
	private void printinfo() {
		System.out.println("Student [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + "]");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + "]";
	}
	
	
}
