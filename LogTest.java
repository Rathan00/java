import java.time.LocalDate;

class LogTest {
    LocalDate logDate;
    String logType;
    String logBy;
	 LogTest(LocalDate logDate, String logType, String logBy) {
		super();
		this.logDate = logDate;
		this.logType = logType;
		this.logBy = logBy;
	}

}
public class LogTest{
	public static void main(String[] args) {
		LogTest[]logarr=new LogTest[5];
		logarr[0]=new LogTest();
		logarr[1]=new LogTest();
		logarr[2]=new LogTest();
		logarr[3]=new LogTest();
		logarr[4]=new LogTest();
		
	}
}
