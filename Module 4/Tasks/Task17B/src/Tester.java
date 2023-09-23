public class Tester implements LoginTest{

    @Override
    public void verifyPassword(String username, String password) {
        System.out.println("Verifying "+username+"\'s password matches"+password);
    }

    @Override
    public void checkHomePage() {
        System.out.println("Checking login to Homepage is successful!");

    }

    @Override
    public void checkDashbord() {
        System.out.println("Checking login to Dashboard is successful!");

    }
}
