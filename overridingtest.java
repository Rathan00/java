
public class overridingtest {

	public static void main(String[] args) {
		

	}

}
class GrandFather{
	void farming() {
		System.out.println("GrandFather:farming in traditional style using bull");
	}
}
class Father{
	void farming() {
		System.out.println("Father:farming in new style using tractor");
	}
	void banking() {
		System.out.println("Father:banking in traditional style using passbook");
	}
}
class Son{
	void farming() {
		System.out.println("Son:farming in modren style using robotic tractor");
	}
	void banking() {
		System.out.println("Son:banking in modren style using mobile");
	}
}