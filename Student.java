public class Student {
    String name;
    public Student(String name){
        this.name = name;
        System.out.println("Creating student object");
    }
    public void sayHello(){
        System.out.println("Hi my name is "+this.name);
    }
}
