
class Avengers{
	String name;
	private String ability;
	private int noOfMovies;
	Avengers(String name,String ability,int noOfMovies){
		this.name=name;
		this.ability=ability;
		this.noOfMovies=noOfMovies;
	}
	public void printDefination() {
		System.out.println("HeroName : "+name);
		System.out.println("Heroability : "+ability);
		System.out.println("No of Movies did : "+noOfMovies+"\n");
	}
	void changeNoOfMovies(int newMovies) {
		System.out.println("New movie released, new details are: ");
		noOfMovies+=newMovies;
	}
	String surnameAddition(String surname) {
		name+=surname;
		return name;
	}
	String getAbility() {
		return ability;
	}
	void ability(){
		System.out.println("Ability of "+name+" is "+ability);
	}
	void ability(String newAbility){
		System.out.println("New Ability of "+name+" is "+newAbility);
	}
	void ability(String newAbility,int power){
		System.out.println("New Ability of "+name+" is "+newAbility+" with a power level of "+power);
	}
}
public class Java1{
	
	    public static void main(String args[]){  
	       Avengers hero1=new Avengers("Thor","God of Thunder",4);
	       Avengers hero2=new Avengers("Iron Man","Intellegence",3);
	       Avengers hero3=new Avengers("Hulk","Super Strength",2);
	       hero1.printDefination();
	       hero2.printDefination();
	       hero3.printDefination();
	       hero1.changeNoOfMovies(2);
	       hero1.printDefination();
	       System.out.println("Hero updated name: "+hero2.surnameAddition(" Adam")+"\n");
	       System.out.println("Ability of "+hero3.name+" is "+hero3.getAbility());
	       hero1.ability();
	       hero1.ability("Roaring thunder");
	       hero1.ability("Flying",60);
	    }  
	  
}
