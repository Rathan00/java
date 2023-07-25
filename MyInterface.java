public class MyInterface {
    public static void main(String[] args) {
        Electron electron=new Electron();
        electron.everything();
        electron.collection();
        electron.negative();
        Proton protons=new Proton();
        protons.everything();
        protons.collection();
        protons.positive();
        Neutron neutron=new Neutron();
        neutron.everything();
        neutron.collection();
        neutron.neutral();
        positiveIon positiveIon=new positiveIon();
        positiveIon.everything();
        positiveIon.collection();
        positiveIon.positive();
        negativeIon negativeIon=new negativeIon();
        negativeIon.everything();
        negativeIon.collection();
        negativeIon.negative();
    }
}
interface Matter
{
	void everything(); 
}
abstract class Atom implements Matter
{
	abstract void collection();
}
abstract class Ion implements Matter
{
	abstract void collection();
}
class Electron extends Atom
{
	public void everything(){
        System.out.println("Everything is matter...");
    }
    void collection(){
        System.out.println("Solid, liquid and gas states of matter are collection of atoms...");
    }
    void negative(){
        System.out.println("Negatively charged particles in atoms are electrons...");
    }
}
class Proton extends Atom
{
	public void everything(){
        System.out.println("Everything is matter...");
    }
    void collection(){
        System.out.println("Solid, liquid and gas states of matter are collection of atoms...");
    }
    void positive(){
        System.out.println("Positively charged particles in atoms are protons...");
    }
}
class Neutron extends Atom
{
	public void everything(){
        System.out.println("Everything is matter...");
    }
    void collection(){
        System.out.println("Solid, liquid and gas states of matter are collection of atoms...");
    }
    void neutral(){
        System.out.println("Particles without any charge in atoms are neutrons...");
    }
}
class positiveIon extends Ion
{
	public void everything(){
        System.out.println("Everything is matter...");
    }
    void collection(){
        System.out.println("Plasma state of matter is collection of ions...");
    }
    void positive(){
        System.out.println("Electron deficient atom is a positive ion...");
    }
} 
class negativeIon extends Ion
{
	public void everything(){
        System.out.println("Everything is matter...");
    }
    void collection(){
        System.out.println("Plasma state of matter is collection of ions...");
    }
    void negative(){
        System.out.println("Proton deficient atom is a negative ion...");
    }
}
