public class ClassB extends ClassA{
    String name = "Anderson";

    public static void main(String[] args) {
        ClassB obj = new ClassB();
        System.out.println("Name in classB is: " +obj.name);
        obj.getSuperName();

    }
    public void getSuperName(){
        System.out.println("Name in ClassA is: "+ super.name);
    }

}
