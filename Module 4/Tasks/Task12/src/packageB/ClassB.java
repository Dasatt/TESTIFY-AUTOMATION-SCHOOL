package packageB;

public class ClassB {
    public static void main(String[] args) {
        ClassB newInstance = new ClassB();
        newInstance.privateMethod();

    }
    private void privateMethod(){
        System.out.println("This is a private method and can only be accessed within this Class");
    }
}
