public class ClassA {
    String name;
    int age;
    String gender;

    public ClassA(String name){
        this.name = name;
        System.out.println("This is the name in Constuctor 1:" +name);

    }
    public ClassA(String name, int age){
        this.age = age;
        System.out.println("This is the name in Constuctor 2:" +age);

    }
    public ClassA(int age,String gender){
        this.gender = gender;
        System.out.println("This is the name in Constuctor 3:" +gender);

    }
}
