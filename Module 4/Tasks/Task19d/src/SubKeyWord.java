/*THIS https://i.imgur.com/aRkRDPa.png You have a class with a method printName.
write a code in the printName method that will print the instance member which is "Delta"
and whatever name the user enter when invoking the method
        */
public class SubKeyWord {
    String name = "Delta";
    public void printName(String name) {
        System.out.println("Instance name is: "+this.name);
        System.out.println("Name on method invoking is: "+name);

    }
}
