public class instrumentTest {
	public static void main(String[] args) {
		
		Guitar guitar = new Guitar();
		guitar.use();
		guitar.tuneStrings();
		guitar.play();
		guitar.pluck();
		ElectricGuitar eguitar = new ElectricGuitar();
		eguitar.use();
		eguitar.tuneStrings();
		eguitar.play();
		eguitar.pluck();
        eguitar.preset();
		Violin violin = new Violin();
		violin.use();
		violin.tuneStrings();
		violin.play();
		violin.bow();
		Cello cello = new Cello();
		cello.use();
		cello.play();
		cello.tuneStrings();
		cello.bow();
	    cello.longBowing();
		Flute flute = new Flute();
		flute.use();
		flute.play();
		flute.blowAir();
		flute.taping();
        Harmonium harmonium = new Harmonium();
		harmonium.use();
		harmonium.play();
		harmonium.blowAir();
		harmonium.pressing();
        Tabala tabala = new Tabala();
		tabala.use();
		tabala.play();
		tabala.tuneSurface();
		tabala.fingerBeating();
        Dhol dhol = new Dhol();
		dhol.use();
		dhol.play();
		dhol.tuneSurface();
		dhol.stickBeating();
        SurgicalCutter SurgicalCutter = new SurgicalCutter();
		SurgicalCutter.use();
		SurgicalCutter.operate();
		SurgicalCutter.sterile();
		SurgicalCutter.cut();
        SurgicalNeedle surgicalNeedle = new SurgicalNeedle();
		surgicalNeedle.use();
		surgicalNeedle.operate();
		surgicalNeedle.sterile();
		surgicalNeedle.suck();
        Glucometer glucometer = new Glucometer();
		glucometer.use();
		glucometer.operate();
		glucometer.reader();
		glucometer.sugarLevel();
        ECGMachine ecgMachine = new ECGMachine();
		ecgMachine.use();
		ecgMachine.operate();
		ecgMachine.reader();
		ecgMachine.pulse();
	}
}

interface Instrument
{
	void use(); //by default method is public and abstract
}
abstract class MusicalInstrument implements Instrument
{
	abstract void play();
}
abstract class StringBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneStrings();
}
class Guitar extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Guitar...");
	}
	void play() {
		System.out.println("Playing Guitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Guitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of Guitar...");

	}
}
class ElectricGuitar extends Guitar
{
	public void use() {
		System.out.println("Using ElectricGuitar...");
	}
	void play() {
		System.out.println("Playing ElectricGuitar...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of ElectricGuitar...");

	}
	void pluck() {
		System.out.println("Plucking Strings of ElectricGuitar...");

	}
    void preset(){System.out.println("Presetting Strings of ElectricGuitar...");}
}
class Violin extends StringBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using Violin...");
	}
	void play() {
		System.out.println("Playing Violin...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Violin...");

	}
	void bow() {
		System.out.println("Bowing Strings of Violin...");

	}
} 
class Cello extends Violin
{
	public void use() {
		System.out.println("Using Cello...");
	}
	void play() {
		System.out.println("Playing Cello...");

	}
	void tuneStrings() {
		System.out.println("Tuning Strings of Cello...");

	}
	void bow() {
		System.out.println("Bowing Strings of Cello...");

	}
    void longBowing(){
        System.out.println("Bowing Strings of Cello with a long bow...");
    }
} 
abstract class AirBasedMusicalInstrument extends MusicalInstrument
{
	abstract void blowAir();
}
class Flute extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using flute...");
	}
	void play() {
		System.out.println("Playing flute...");

	}
	void blowAir() {
		System.out.println("Blowing air into flute...");

	}
	void taping() {
		System.out.println("taping holes of flute...");

	}
}
class Harmonium extends AirBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using harmonium...");
	}
	void play() {
		System.out.println("Playing harmonium...");

	}
	void blowAir() {
		System.out.println("Blowing air into harmonium...");

	}
	void pressing() {
		System.out.println("pressing buttons of harmonium...");

	}
}
abstract class DrumBasedMusicalInstrument extends MusicalInstrument
{
	abstract void tuneSurface();
}
class Tabala extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using tabala...");
	}
	void play() {
		System.out.println("Playing tabala...");

	}
	void tuneSurface() {
		System.out.println("Tuning the surface of tabala...");

	}
	void fingerBeating() {
		System.out.println("Beating the surface of tabala with fingers...");

	}
}
class Dhol extends DrumBasedMusicalInstrument
{
	public void use() {
		System.out.println("Using dhol...");
	}
	void play() {
		System.out.println("Playing dhol...");

	}
	void tuneSurface() {
		System.out.println("Tuning the surface of dhol...");

	}
	void stickBeating() {
		System.out.println("Beating the surface of dhol with a stick...");

	}
}
abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}
abstract class SurgicalInstrument extends MedicalInstrument
{
	abstract void sterile();
}
class SurgicalCutter extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using SurgicalCutter...");
	}
	void operate() {
		System.out.println("Operating with SurgicalCutter...");

	}
	void sterile() {
		System.out.println("Cleaning SurgicalCutter...");

	}
	void cut() {
		System.out.println("Cutting with SurgicalCutter...");

	}
}
class SurgicalNeedle extends SurgicalInstrument
{
	public void use() {
		System.out.println("Using SurgicalNeedle...");
	}
	void operate() {
		System.out.println("Operating with SurgicalNeedle...");

	}
	void sterile() {
		System.out.println("Disposing of SurgicalNeedle after use...");

	}
	void suck() {
		System.out.println("Sucking blood by inserting a SurgicalNeedle...");

	}
}
abstract class PathologicalInstrument extends MedicalInstrument
{
	abstract void reader();
}
class Glucometer extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using glucometer...");
	}
	void operate() {
		System.out.println("Operating glucometer...");

	}
	void reader() {
		System.out.println("Reading glucometer ...");

	}
	void sugarLevel() {
		System.out.println("Sugar level is tested with glucometer...");

	}
}
class ECGMachine extends PathologicalInstrument
{
	public void use() {
		System.out.println("Using ECGMachine...");
	}
	void operate() {
		System.out.println("Operating ECGMachine...");

	}
	void reader() {
		System.out.println("Reading ECGMachine ...");

	}
	void pulse() {
		System.out.println("Pulse is tested with ECGMachine...");

	}
}