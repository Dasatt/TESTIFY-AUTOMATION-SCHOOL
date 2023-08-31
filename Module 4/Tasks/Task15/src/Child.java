public class Child extends Parent {

    public void method1(){
        System.out.println("I am method 1 in Child class");

    }
    public void method2(){
        System.out.println("I am method 2 in Child class");

    }

    public static void main(String[] args) {
        Parent father = new Parent();
        Child child = new Child();
        father.method1();
        father.method2();
        father.method3();
        child.method1();
        child.method2();

    }
}
