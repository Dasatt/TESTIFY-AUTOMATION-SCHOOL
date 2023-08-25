public class JavaDataTypes {
    public static void main(String[] args) {
        //bytes -128 to 128
        //short -32,768 to 32,767
        //int -2,147,483,648 to 2,147,483,647
        //long -9,223,372,036,854,775,808 to 9,223,32,036,854,775,807
        //float -6 to 7 decimal digits
        //double float from 15 decimal digits
        //char single letters = 'a' 'b'
        //boolean true or false

        byte age = 127;
        short money = 32767;
        int tooMuchMoney = 2147483647;
        long longerMoney = 922332036854775807l;
        float area = 21.474846f;
        double biggerArea = 1234.5344588888;
//        char option = 'n';
//        boolean isAround = true;

        System.out.println(age);
        System.out.println(money);
        System.out.println(tooMuchMoney);
        System.out.println(longerMoney);
        System.out.println(area);
        System.out.println(biggerArea);
//        System.out.println(option);
//        System.out.println(isAround);

    }
}
