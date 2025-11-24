class Student{
    String name;
    int class_number;
    String city;
    int age;

    public void write(){
        System.out.println(this.name);
    }
}
class Teacher extends Student{
    Teacher(String name,int age)
    {
        this.name = name;
        this.age = age;
    }
    public void print()
    {
        System.out.println("The Teacher's name : " + name);
    }
}


public class base{
    public static void main(String[] args) {
        Student ob = new Student(); 
        ob.name = "Ashish";
        ob.class_number = 10;
        ob.write();
        Teacher t1 = new Teacher("Aman",21);
        t1.print();
    }
}
