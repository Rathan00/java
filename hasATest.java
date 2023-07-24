
public class hasATest {

	public static void main(String[] args) {
		Human human1=new Human();
		human1.breathing();
		human1.analysing();
		human1.urinating();
	}

}
class Heart{
	void pumping(){
		System.out.println("Heart is pumping...");
	}
}
class Brain{
	void thinking(){
		System.out.println("Brain is thinking...");
	}
}
class kidneys{
	void filtering(){
		System.out.println("Kidneys are filtering...");
	}
}
class Human{
	private Heart myHeart=new Heart();
	private Brain brain=new Brain();
	private kidneys kidneys=new kidneys();
	void breathing(){
		System.out.println("Human is breathing...");
		myHeart.pumping();
	}
	void analysing(){
		System.out.println("Human is analysing...");
		brain.thinking();
	}
	void urinating(){
		System.out.println("Human is urinating...");
		kidneys.filtering();
	}
}