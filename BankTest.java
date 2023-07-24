
public class BankTest {

	public static void main(String[] args) {
		BankAppForm form1=new BankAppForm();
		BankAppForm form2=new BankAppForm();
        form1.setAppName("Rathan Raj Kudali");
        form1.setAccType("Savings");
        form1.setAdhaar("417121546354");
        
	}

}
class BankAppForm{
	private String appName;
	private String adhaar;
	private String accType;
	private String pan;
	private String mobile;
	private String email;
	private String adress;
	private String members;
	public String getMembers() {
		return members;
	}
	public void setMembers(String members) {
		this.members = members;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAdhaar() {
		return adhaar;
	}
	public void setAdhaar(String adhaar) {
		this.adhaar = adhaar;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	void printAppForm() {
		System.out.println("=======Application Form=========");
		System.out.println("Name of the Applicant: "+appName);
		System.out.println("Adhaar Number : "+adhaar);
		System.out.println("Account Type: "+accType);
		System.out.println("Pan Number: "+pan);
		System.out.println("Mobile Number: "+mobile);
		System.out.println("Email ID: "+email);
		System.out.println("Adress: "+adress);
		System.out.println("Account Purpose: "+members);
	}
}
