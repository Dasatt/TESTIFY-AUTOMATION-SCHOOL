/*All testers in your unit must test that the correct username is entered,
correct password that matches the username and that Login to the homePage or dashboard is successful.
As the test Lead, create an interface that the testers should.
 */
interface LoginTest{
    void verifyPassword(String username,String password);
    void checkHomePage();
    void checkDashbord();

}