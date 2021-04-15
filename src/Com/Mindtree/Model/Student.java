package Com.Mindtree.Model;
public class Student {
	private String studentName;
	private short age;
	private String address;
	private String city;
	private short pincode;
	private String country;
	private String studentMail;
	private String studentUserName;
	private String password;

	public Student(String studentName, short age, String address, String city, short pincode, String country,
			String studentMail, String studentUserName, String password) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.country = country;
		this.studentMail = studentMail;
		this.studentUserName = studentUserName;
		this.password = password;
	}

	public Student() {
		super();
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
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

	public String getStudentMail() {
		return studentMail;
	}

	public void setStudentMail(String studentMail) {
		this.studentMail = studentMail;
	}

	public String getStudentUserName() {
		return studentUserName;
	}

	public void setStudentUserName(String studentUserName) {
		this.studentUserName = studentUserName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", age=" + age + ", address=" + address + 
				", city=" + city
				+ ", pincode=" + pincode + ", country=" + country + ", studentMail=" + studentMail
				+ ", studentUserName=" + studentUserName + ", password=" + password + "]";
	}

}
