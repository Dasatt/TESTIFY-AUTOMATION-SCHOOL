public class Daughter extends Parent{
    public static void main(String[] args) {
        Daughter firstDaughter = new Daughter();
        firstDaughter.color("Black");
        firstDaughter.height(1.53);
    }
    @Override
    public void color(String skinColor) {
        System.out.println("Daugher is "+ skinColor+" in colour");
    }

    @Override
    public void height(double height) {
        System.out.println("Daughter is "+height+"m in height");
    }
}
