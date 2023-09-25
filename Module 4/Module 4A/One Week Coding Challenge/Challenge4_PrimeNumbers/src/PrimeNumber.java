/* ALgorithm used
Iterate through all numbers from 2 to square root of n and for every number
check if it divides n [because if a number is expressed as n = xy and any of the x or y is
 greater than the root of n, the other must be less than the root value].
  If we find any number that divides, we return false.
 */
public class PrimeNumber {
    public boolean checkIfPrime(int number) {
        if(number<=1){
            return false;
        }
        if(number == 2 || number == 3){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
