
public class FlightTest {

	public static void main(String[] args) {
		Commercial commFlight = new Commercial();
		commFlight.checkTickets();
		commFlight.checkIdentityOfCPassengers();
		commFlight.Fly();
		commFlight.Land();
		
		System.out.println("-----------");
		
		FighterFlight fightFlight = new FighterFlight();
		fightFlight.armMissiles();
		fightFlight.Fly();
		fightFlight.fireMissile();
		fightFlight.Land();
		
		System.out.println("-----------");
		
		CargoFlight cargoFlight = new CargoFlight();
		cargoFlight.checkTheCapacity();
		cargoFlight.carryGoods();
		cargoFlight.Fly();
		cargoFlight.Land();

	}

}
interface Flying{
	void Fly();
}
interface Landing{
	void Land();
}
interface Ticketing{
	void checkTickets();
}
interface Fighting {
	void fireMissile();
}
interface Carrying {
	void carryGoods();
}
abstract class Flight implements Flying,Landing{
}
class Commercial extends Flight implements Ticketing{
	@Override
	public void Fly() {
		System.out.println("Commertial Flight is flying...");
	}
	@Override
	public void Land() {
		System.out.println("Commertial Flight is landing...");
	}
	@Override
	public void checkTickets() {
		System.out.println("Commertial Flight is ing...");
	}
	void checkIdentityOfCPassengers() {
		System.out.println("Commercial Flight is checking identities of passengers...");
	}
}
class FighterFlight extends Flight implements Fighting {

	@Override
	public void Fly() {
		System.out.println("FighterFlight Flight is flying");
		
	}

	@Override
	public void Land() {
		System.out.println("FighterFlight Flight is landing");
		
	}

	@Override
	public void fireMissile() {
		System.out.println("FighterFlight  ... firing missile....");		
	}
	
	public void armMissiles() {
		System.out.println("Fighter Flight is arming the missiles...");
	}
	
}

class CargoFlight extends Flight implements Carrying {

	@Override
	public void Fly() {
		System.out.println("CargoFlight Flight is flying");
		
	}

	@Override
	public void Land() {
		System.out.println("CargoFlight Flight is landing");
		
	}

	@Override
	public void carryGoods() {
		System.out.println("CargoFlight  ... carrying goods....");		
	}
	
	void checkTheCapacity() {
		System.out.println("CargoFlight is checking the carriage capacity ");
	}
	
}