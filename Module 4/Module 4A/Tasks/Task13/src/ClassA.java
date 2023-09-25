public class ClassA {
    String name;
    int age;
    String gender;

    //constuctor
    public ClassA(String name){
        this.name = name;
        System.out.println("This is the name in Constuctor 1:" +name);

    }
    //constuctor
    public ClassA(String name, int age){
        this.age = age;
        System.out.println("This is the name in Constuctor 2:" +age);

    }
    //constuctor
    public ClassA(int age,String gender){
        this.gender = gender;
        System.out.println("This is the name in Constuctor 3:" +gender);

    }
}
