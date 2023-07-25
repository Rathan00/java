
public class KiteTest {

	public static void main(String[] args) {
	     Kite kite0=new Kite("rathan","yellow",150,true);
	     kite0.showKite();
			
			Kite kite1 = new Kite("Salil","Green",50,true);
			kite1.showKite();
			
			Kite kite2 = new Kite("Sujal","Blue",60,true);
			kite2.showKite();
			
			
			Kite kite3 = new Kite("Roshan","Red",70,true);
			kite3.showKite();

			
			Kite.showKiteCount();
			
			Kite kite4 = new Kite("Shruti","Pink",80,true);
			kite4.showKite();

			Kite kite5 = new Kite("Mitali","Light Yellow",90,true);
			kite5.showKite();

			
			Kite.showKiteCount();
            kite0.kiteFight(kite5);
	}

}
class Kite{
	private String owner;
	private String color;
	private int hight;
	private boolean flying;
	private static int kiteCount;
	public static void showKiteCount(){
		System.out.println("Total kites in the sky: "+kiteCount);
	}
	public Kite(String owner, String color, int hight,boolean TorF) {
		super();
		System.out.println("Kite is created");
		this.owner = owner;
		this.color = color;
		this.hight = hight;
		this.flying=TorF;
		kiteCount++;
	}
	void showKite() { //non-static can refer static
		System.out.println("Kite Owner  : "+owner);
		System.out.println("Kite Color  : "+color);
		System.out.println("Kite Length : "+hight);
		System.out.println("Kite count  : "+Kite.kiteCount);
		System.out.println("-------------------");
		
	}
	void kiteFight(Kite x) {
		System.out.println(color+" kite started fighting "+x.color+" kite");
		for(int i=0;i<=20;i++) {
			double value=Math.random();
			System.out.println("Kites are fighting with probabilities: "+value);
			if(value<0.1) {kiteCount--;System.out.println(color+" kite is defeated by "+x.color+" kite");break;}
			if(value>0.9) {kiteCount--;System.out.println(x.color+" kite is defeated by "+color+" kite");break;}
			if(value>=0.5 && value<0.6) {kiteCount-=2;System.out.println(color+" kite and "+x.color+" kite both are defeated");break;}
			if(i==20) {System.out.println("fight is still going on....");}
		}
	}
	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", hight=" + hight + "]";
	}
	
}