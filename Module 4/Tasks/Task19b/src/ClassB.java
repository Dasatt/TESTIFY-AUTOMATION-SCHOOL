/*STATIC: I want to use the value of a variable in one class in another class at runtime.
 I also want to access the variable without creating an object of its class. Help me implement this
*/
public class ClassB {
    public void getVariable(){
        System.out.println("Variable age in classA is: "+ClassA.age);

    }
}
