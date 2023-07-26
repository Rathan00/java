public class CustomExceptionTest {
	public static void main(String[] args) 
	{
		System.out.println("MAIN started...\n");
		
		try {
			Car myCar = new Car();
			myCar.longDrive();
		}
		catch(CarKeyNotFoundException ex1) {
			System.out.println("Key Issue : "+ex1);
		}
		catch(MehmaanAaya ex4) {
			System.out.println("New Issue : "+ex4);
		}
		System.out.println("\nMAIN finished...\n");
		
	}
}

class CarKeyNotFoundException extends Exception
{
	CarKeyNotFoundException(String msg) {
		super(msg);
	}
}
class RedSignalDishnouredException extends RuntimeException
{
	RedSignalDishnouredException(String msg) {
		super(msg);
	}
}
class EngineOverHeatedException extends RuntimeException{
	EngineOverHeatedException(String msg){
		super(msg);
	}
}
class HungryException extends RuntimeException{
	HungryException(String msg){
		super(msg);
	}
}
class MehmaanAaya extends Exception
{
	MehmaanAaya(String msg) {
		super(msg);
	}
}
class Car
{
	boolean keyFound=false;
	
	Car() throws CarKeyNotFoundException,MehmaanAaya
	{
		double value = Math.random()%10;
		
		if(value>=0.30) {
			keyFound=true;
		}
		
		if(keyFound==true) {
			System.out.println("Car is started....");
			
		}
		else {
			//System.out.println("Car Key Not Found....");
			throw new CarKeyNotFoundException("Hey...Where is the Car Key? im not getting it...");
			
		}
		if(value>0.9) {throw new MehmaanAaya("Recive the guests first, longdrive has a long way to go...");}
	}
	public void longDrive() {
		for (int i = 1; i <=30; i++) {
			System.out.println(i+" kms driven....");
			double value1= Math.random()%10;
			if(value1>0.95) {
				RedSignalDishnouredException ex1 = new RedSignalDishnouredException("Oh No!!! Red signal is dishonoured....");
				throw ex1;
			}
			double value2 = Math.random()%10;
			if(value2<0.07) {
				EngineOverHeatedException ex2=new EngineOverHeatedException("Stop!! Engine is overheating....");
				throw ex2;
			}
			else if(value2>0.9) {
				HungryException ex3=new HungryException("Please stop the car at a restaurent");
				throw ex3;
			}
		}
	}
}
