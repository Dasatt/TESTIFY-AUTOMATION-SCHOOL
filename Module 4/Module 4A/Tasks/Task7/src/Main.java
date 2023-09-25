import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [][] fruits = new String [4][3]; // 4 rows 3 columns
        fruits[0][0] ="mango";
        fruits[1][0] ="orange";
        fruits[2][0] ="banana";
        fruits[3][0] ="paw-paw";

        System.out.println(Arrays.deepToString(fruits));
    }
}