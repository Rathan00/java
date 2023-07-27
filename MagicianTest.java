import java.util.Scanner;

public class MagicianTest {
    public static void main(String args[]){
        Demo demoRef = new Demo();
		demoRef.demo();
    }
}
class Demo
{
	void demo() {
		
		
		
		System.out.println("Which magician type you want ? ");
		Scanner scanner = new Scanner(System.in);
		
		String theHint = scanner.next();
		
		Magician magician = EventAgency.getMagician(theHint);
		SavingsAccount savObj = new SavingsAccount();
		Magic magic = magician.doTrick();
		magic.show();
		
	}
}

class EventAgency {
	public static Magician getMagician(String hint) {
		Magician magician = null;
		if(hint.equalsIgnoreCase("hats")) {
			magician = new HatMagician();
		}
		else if(hint.equalsIgnoreCase("cards")) {
			magician = new CardMagician();
		} 
		else if(hint.equalsIgnoreCase("ghost")){
			magician = new BlackMagician();
		}
		return magician;
	}
}

interface Account {
	void withdraw(float  amt);
	void deposit(float amt);
}
class SavingsAccount implements Account {
	public void withdraw(float amt) {
		System.out.println("withdrawing..."+amt);
	}
	public void deposit(float amt) {
		System.out.println("depositing...."+amt);
	}
}
class DealWithTheDevil {
	public void giveSole() {
		System.out.println("Slaughtered two goats as a sacrifice...");
	}
	
}
interface Magician
{
	Magic doTrick();	
}

class CardMagician implements Magician
{
	public Magic doTrick() {
		System.out.println("Hiding some cards under the sleeves....");
		Magic magic = new CardMagic();
		Account accRef=new SavingsAccount();
		accRef.deposit(5000);
		return magic;
	}
}
class BlackMagician implements Magician
{
	public Magic doTrick() {
		System.out.println("Drawing stars & circles and chantin mantras....");
		Magic magic = new BlackMagic();
		DealWithTheDevil deal=new DealWithTheDevil();
		deal.giveSole();
		return magic;
	}
}
class HatMagician implements Magician
{
	public Magic doTrick() {
		System.out.println("Hiding the parrot under the Hat....");
		Magic magic = new HatMagic();
		Account accRef=new SavingsAccount();
		accRef.deposit(6000);
		return magic;
	}
}


interface Magic
{
	void show();
}
class CardMagic implements Magic
{
	public void show() {
		System.out.println("Showing cards...in a magical way....");
	}
}

class HatMagic implements Magic
{
	public void show() {
		System.out.println("Showing hats  and parrot...in a magical way....");
	}
}
class BlackMagic implements Magic
{
	public void show() {
		System.out.println("Showing absurd paranormal activities....in a horrific way...");
	}
}
