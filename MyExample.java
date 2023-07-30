import java.sql.Connection;
import java.sql.DriverManager; // all methods throws SQLException
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class MyExample {
    
        public static void main(String[] args) {

            Thali thali1=new Thali(4,200,250);
            Thali.thali=thali1;
            thali1.prepareThali();
    
        }
    
    }
    class Roties extends Cooking{
        private static float flour=100.0f;
        private static float water=80.0f;
        private static int salt=1;
        Thali thali;
        public void run(){
            makeRoties();
        }
        void makeRoties(){
            System.out.println("Started making roties...");
            System.out.println("To make roti add:\n"+flour*thali.roties+" grams of flour\n"+water*thali.roties+" ml of water\n"+salt*thali.roties+" pinches of salt\nMix well");
            for(int i=1;i<=thali.roties;i++){
                System.out.println("Take 150 grams of dough prepared and press it into a flat sheet");
                cooking(3);
            }
        }
        public Roties() {
        }        
    }
    class Rice extends Cooking{
        Thali thali;
        public void run(){
        makeRice();
        }
        void makeRice(){
            System.out.println("Started making rice...");
            System.out.println("\tTo make rice add:");
            System.out.println("\t"+thali.rice+" grams of soaked rice grains");
            System.out.println("\t"+thali.rice*2.5f+" ml of water");
            System.out.println("\t"+thali.rice/100.0f+" pinches of salt");
            cooking(30);
        }
        public Rice(){}
    }
        
    
    class Cooking extends Thread {
        float cook;
        void cooking(float cook){
            this.cook=cook;
            System.out.println("Cook the item for "+cook+" minutes");}
        }
    class Bhendi extends Cooking{
        Thali thali;
        public void run(){
        makeBhendi();
        }
        void makeBhendi(){
            System.out.println("Started making bhendi curry...");
            System.out.println("\t\tTo make bhendi add:");
            System.out.println("\t\t"+thali.bhendi/2+" grams of chopped bhendi");
            System.out.println("\t\t"+thali.bhendi*0.5f+" ml of water");
            System.out.println("\t\t"+thali.bhendi/50.0f+" tablespoons of premade masala");
            System.out.println("\t\t"+thali.bhendi/4+" grams of chopped onions and tomatos");
            cooking(25);
        }
        public Bhendi(){}

 
    }
    class Thali{
        int roties;
        int rice;
        int bhendi;
        static Thali thali;
        public Thali(int roties, int rice, int bhendi) {
            this.roties = roties;
            this.rice = rice;
            this.bhendi = bhendi;
        }
        Roties roti=new Roties();
        Rice Rice=new Rice();
        Bhendi bend=new Bhendi();
        void prepareThali(){
            System.out.println("Started making items...");
            roti.thali=this.thali;
            roti.start();
            Rice.thali=this.thali;
            Rice.start();
            bend.thali=this.thali;
            bend.start();
            try {
                roti.join();
                Rice.join();
                bend.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            System.out.println("Thali is prepared...");
        }
    }   
    class InsertMenu {
			
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected : "+ conn);
			
			//3. make a desired statement (insert/update/delete/select)
			
			PreparedStatement pst = 
					conn.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			
			pst.setInt(1, 4);
			pst.setInt(3, 300);
			pst.setInt(2,200);
			
			System.out.println("PreparedStatement is created : "+ pst);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			int rows = pst.executeUpdate();
			
			System.out.println("Rows created : "+rows);
			
			//6. close the statement, and connection
			
			pst.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }
  class SelectTest {
			
		try {
			//1. Load the Driver
			System.out.println("Trying to load the driver...");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver loaded....");
			
			//2. Acquire the connection
			System.out.println("Trying to connect....");
			Connection conn = 	DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb", "SA", "");
			System.out.println("Connected : "+ conn);
			
			//3. make a desired statement (insert/update/delete/select)
			
			Statement statement = conn.createStatement();
			System.out.println("Statement is created : "+ statement);
			
			//4. execute that statement //  UR TABLENAME IS MYDEPT120
			ResultSet result = statement.executeQuery("SELECT * FROM DEPT10");
			int roti;
            int rice;
            int bhendi;
			//5. process teh result if any
			while(result.next()) {
				roti=result.getInt(1);
				rice=result.getInt(2);
				bhendi=result.getInt(3);
			}
			//6. close the statement, and connection
			result.close();
			statement.close();
			conn.close();
			System.out.println("Disconnected from the database....");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
 }
}  

