package mid;

public class Party {

	String name;
	String address;
	int age;
	int ageGroup;
	String preferParty;
	String addressGroup;

	Party(String name, String address, int age, int ageGroup, String preferParty) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.ageGroup = ageGroup;
		this.preferParty = preferParty;
		classifyAddressGroup(address);
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

}
