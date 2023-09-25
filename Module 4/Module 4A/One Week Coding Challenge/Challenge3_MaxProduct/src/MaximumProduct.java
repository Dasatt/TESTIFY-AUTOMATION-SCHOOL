//Find two numbers of which the product is maximum in an array
public class MaximumProduct {

    void findMaxProduct(int [] numArray){
        int firstNum = numArray[0]; //initialise first num in pair
        int secondNum = numArray[1]; // initialise second number in pair
        int product =0;
//        System.out.println(firstNum);
        //loop through arrays to check all pairs

        for (int i=0; i<numArray.length; i++){
            for (int j=i+1; j<numArray.length; j++){
                product = numArray[i]*numArray[j];
                if (product > firstNum*secondNum){
                    firstNum = numArray[i];
                    secondNum = numArray[j];
                }
            }
        }
        System.out.println("Numbers with maximum product are: " + firstNum +" and "+secondNum);
    }
}
