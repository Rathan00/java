public class StaticFinal {
    public static void main(String[] args) {
        Register student1=new Register("Rathan Raj","RKI41",true);
        Register student2=new Register("Shaswath","SWT87",true);
        Register student3=new Register("Pratik","PTK23",false);
        Register student4=new Register("Shruthi","SRT55",false);
        student1.printData();
        student2.printData();
        student3.printData();
        student4.printData();
    }
}
class Register{
    final String name;
    private final String id;
    private static final String course="JAVA training";
    private boolean assignmentStatus=false;
    Register(String name,String id,boolean status){
        this.name=name;
        this.id=id;
        this.assignmentStatus=status;
    }

void printData(){
        if(assignmentStatus){System.out.println(name+" completed the work.");}
        else{System.out.println(name+" failed to complete the work.");}
    }
}