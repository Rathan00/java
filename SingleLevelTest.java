
public class SingleLevelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class dough{
	private float flour;
	private float water;
	private int salt;
	dough(float f,float w,int s){
		this.flour=f;
		this.water=w;
		this.salt=s;
	}
	void recipe() {
		System.out.println("To make roti add:"+"\n"+flour+" kgs of flour\n"+water+" liter of water\n"+salt+" pinches of salt");
	}
}
class roti extends dough{
private int press;
	roti(float f, float w, int s,int p) {
		super(f, w, s);
		this.press=p;
	}
	void recipe() {
		super.recipe();
		System.out.println("mix well and ")
	}
}