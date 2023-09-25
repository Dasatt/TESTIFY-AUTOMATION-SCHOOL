//Write  a  Javacode  to  check  for  the Prime  numbers between 1-100


public class Main {

    public static void main(String[] args) {
        PrimeNumber obj = new PrimeNumber();

        for (int i=1; i<=100; i++){
            if (obj.checkIfPrime(i)){
                System.out.println(i);
            }
        }
        }
}