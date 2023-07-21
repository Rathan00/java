
public class ClassExtensionTest {

	public static void main(String[] args) {
		Doctor x=new Doctor();
		x.diagnose();
//Surgeon x=new Surgeon();
		//x.diagnose();
//HeartSurgeon x=new HeartSurgeon();
		if(x instanceof Doctor) {System.out.println("It.s a Doctor's object");}
		else {System.out.println("It's not a doctor's object");}
		if(x instanceof Surgeon) {System.out.println("It's a Surgeon's object");}
		else {System.out.println("It's not a Surgeon's object");}
		if(x instanceof HeartSurgeon) {System.out.println("It's a HeartSurgeon's object");}
		else {System.out.println("It's not a HeartSurgeon's object");}

}}
class Doctor{
	void diagnose() {
		System.out.println("Doctor is diqagnosing...\n");
	}
}
class Surgeon extends Doctor{
	void diagnose() {
		System.out.println("Surgeon is diqagnosing..heart.\n");
	}
	void cut() {
		System.out.println("Surgeon is cutting..heart.\n");
	}
	void stich() {
		System.out.println("Surgeon is stiching..heart.\n");
	}
	void priscribe() {
		System.out.println("Surgeon is priscribing..medicine.\n");
	}
}
class HeartSurgeon extends Surgeon{
	void diagnose() {
		System.out.println("Doctor is diqagnosing..heart.\n");
	}
	void diagnose() {
		System.out.println("Doctor is diqagnosing..heart.\n");
	}
}
