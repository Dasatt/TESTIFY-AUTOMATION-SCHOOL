package packageA;

public class ClassA {
    public static void main(String[] args) {
        ClassA newInstance = new ClassA();
        newInstance.publicMethod();
    }

    public void publicMethod(){
        System.out.println("This is a public method and can be accessed anywhere in the project");
    }
}
