
package Com.Mindtree.Model;
public class Staff {
	private String staffName;
	private short age;
	private String address;
	private String city;
	private short pincode;
	private String country;
	private String staffMail;
	private String staffUserName;
	private String password;
	
	public Staff() {
		super();
	}

	public Staff(String staffName, short age, String address, String city, short pincode, String country,
			String staffMail, String staffUserName, String password) {
		super();
		this.staffName = staffName;
		this.age = age;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
		this.staffMail = staffMail;
		this.staffUserName = staffUserName;
		this.password = password;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public short getPincode() {
		return pincode;
	}

	public void setPincode(short pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStaffMail() {
		return staffMail;
	}

	public void setStaffMail(String staffMail) {
		this.staffMail = staffMail;
	}

	public String getStaffUserName() {
		return staffUserName;
	}

	public void setStaffUserName(String staffUserName) {
		this.staffUserName = staffUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Staff [staffName=" + staffName + ", age=" + age + ", address=" + address + ", city=" + city
				+ ", pincode=" + pincode + ", country=" + country + ", staffMail=" + staffMail + ", staffUserName="
				+ staffUserName + ", password=" + password + "]";
	}
	

}