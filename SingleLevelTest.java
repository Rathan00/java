
public class SingleLevelTest {

	public static void main(String[] args) {
		Thali thali1=new Thali(4,200,250,150);
		

	}

}
class dough{
	private float flour;
	private float water;
	private int salt;
	Thali thali;
	dough(Thali thali){
		this.thali=thali;
	}
	void dough() {
		System.out.println("To make roti add:"+"\n"+flour+" kgs of flour\n"+water+" liter of water\n"+salt+" pinches of salt");
	}
}
class roti extends dough{
	private float cook;
	private int roties;
	roti(int roties){
		
	}
	void cooking(float cook) {
		this.cook=cook;
		super.recipe();
		System.out.println("Cook the roti for "+cook+" minutes");
	}
	
}
class bhendiItems{
	private int bhendiQuantity;
	private int onion;
	private int tomato;
	
}
class curry extends curry1items{
	private
}
class Thali{
    int roties;
	int rice;
	int bhendi;
	int egg;
	public Thali(int roties, int rice, int bhendi, int egg) {
		super();
		this.roties = roties;
		this.rice = rice;
		this.bhendi = bhendi;
		this.egg = egg;
	}
	
}