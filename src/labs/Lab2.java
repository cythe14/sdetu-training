package labs;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stud = new Student("Joe","Doe","4235963682", 5000);
		stud.addSubjects("Math", 500.00);
		stud.addSubjects("English", 500.00);
		stud.setCity("Los Angeles");
		stud.setPhone("233463774");
		stud.setState("California");
		stud.enroll();
		stud.pay();
		stud.checkBalance();
		stud.showCourses();
		System.out.println("City: " + stud.getCity() + ", State:" + stud.getState() + ", Phone: " + stud.getPhone());
		System.out.println(stud.toString());
	}

}

class Student {
	private String firstName;
	private String lastName;
	private String SSN;
	private String emailId;
	private String userId;
	private String[] allSubjects;
	private double tuitionFee;
	private double balance;
	private static int ID = 1001;
	private static int n = 0;
	private String phone;
	private String city;
	private String state;
	
	public Student(String firstName, String lastName, String SSN, double initBalance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		balance = initBalance;
	}
	
	public void addSubjects(String subject, double subjectFee) {
		String[] newSubject = new String[n + 1];
		if (allSubjects != null) {
			for (int i=0;i < allSubjects.length;i++) {
				newSubject[i] = allSubjects[i];
			}
		}
		newSubject[newSubject.length - 1] = subject;
		allSubjects = newSubject;
		tuitionFee = tuitionFee + subjectFee;
		n++;
	}
	
	public void enroll() {
		emailId = firstName + "." + lastName + "@test.com";
		int random = 0;
		do {
			random = (int) (Math.random() * 10000);
			
		} while ((random < 1000) && (random > 9000));
		userId = ID + "" + random + SSN.substring(SSN.length() - 4, SSN.length());
		ID++;
	}
	
	public void pay() {
		balance = balance - tuitionFee;
	}
	public void checkBalance() {
		System.out.println("Balance: " + balance);
	}
	public void showCourses() {
		for (int i=0;i<allSubjects.length;i++ ) {
			System.out.println("Subject#" + (i + 1) + ": " + allSubjects[i]);
		}		
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public String toString() {
		return "[Name: " + firstName + " " + lastName + "]\n[Email Id: " + emailId + "]\n[User Id: " + userId + "]\n" + "[Balance " + balance + "]";
	}
	
}
