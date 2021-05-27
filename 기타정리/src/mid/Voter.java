package mid;

public class Voter {

	String name;
	String address;
	int age;
	int ageGroup;  // String으로 "20대"
	String addressGroup; // 권역대
	
	Voter(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
		classifyAgeGrop(age);
		classifyAddressGroup(address);
	}
	
	void classifyAgeGrop(int age) {
		switch(age/10) {
		case 2:
			ageGroup = 20;
			break;
		case 3:
			ageGroup = 30;
			break;
		case 4:
			ageGroup = 40;
			break;
		case 5:
			ageGroup = 50;
			break;
		case 6:
			ageGroup = 60;
			break;
		case 7:
			ageGroup = 70;
			break;
		case 8:
			ageGroup = 80;
			break;
		case 9:
			ageGroup = 90;
			break;
		default:
			ageGroup = 100;
		}	
	}
	
	void classifyAddressGroup(String address) {
		String[] addressArr = address.split(" ");
		String headAddress = addressArr[0];
		if (headAddress.contains("서울")) {
			addressGroup = "서울시";
		} else if (headAddress.contains("경기")) {
			addressGroup = "경기도";
		} else if (headAddress.contains("충북") || headAddress.contains("충북")) {
			addressGroup = "충청북도";
		} else {
			addressGroup = "그외";
		}
	}

	@Override
	public String toString() {
		return "유권자 이름: " + name + ", 주소: " + address + ", 나이: " + age;
	}
	
	
}
