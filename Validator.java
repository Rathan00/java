
public class Validator {
	static boolean checkString(String strToCheck) {
		return (strToCheck.matches("^[a-zA-Z,' ']*$")) ? true :false;
	}
    static boolean checkNumber(int number,int min, int max) {
    	return(number>=min && number<=max)? true:false;
    }
    static boolean checkNumber(float number,float min,float max) {
    	return(number>=min && number<=max)? true:false;
    }
}
