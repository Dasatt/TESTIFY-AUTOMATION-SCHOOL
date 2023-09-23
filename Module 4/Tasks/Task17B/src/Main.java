/*All testers in your unit must test that the correct username is entered,
correct password that matches the username and that Login to the homePage or dashboard is successful.
As the test Lead, create an interface that the testers should.
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Tester newTest = new Tester();
        newTest.verifyPassword("Dasat", "passsword");
        newTest.checkHomePage();
        newTest.checkDashbord();

    }
}