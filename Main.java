import java.sql.Date;

public class Main{
    public static void main(String[] args) {
        System.out.println("-----------------------------");
        System.out.println("This is java program");
        System.out.println("Output from java program");
        System.out.println("Current Date :  "+new Date(2025, 4, 8));
        System.out.println("This is change 2");
        System.out.println("This is change 3");
        Student st = new Student("Shubham Nigam");
        st.sayHello();
        System.out.println("20 Apr 2025");
        System.out.println("20 Apr 2025");
        System.out.println(10/0);
        System.out.println("-----------------------------");
        
    }
}