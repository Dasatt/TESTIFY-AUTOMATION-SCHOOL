/*FINAL: create 3 variables of a class A, ballSize, ballColour, ballTexture. and make it
impossible to change the value the ballSize in any method in that class
 */
public class Main {
    final int ballSize = 1;
    String ballColour = "Red";
     String ballTexture = "Soft";
    public static void main(String[] args) {
        Main obj = new Main();
        obj.setBallColour();
        obj.setBallTexture();
        obj.setBallSize();
    }
    public void setBallColour(){
        ballColour = "Blue";
        System.out.println("Ball colour is now "+ ballColour);
    }
    public void setBallTexture(){
        ballTexture = "Hard";
        System.out.println("Ball texture is now "+ ballTexture);
    }
    public void setBallSize(){
//        ballSize = 10;
        System.out.println("I'm unable to change ball size " +ballSize);
    }
}
