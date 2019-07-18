package CHARMS2;

public class Practice5 {

    public static void main(String args[]){
        //Exercise 1
        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        int oddSum = 0;
        int evenSum = 0;
        int i=0;
        for(int num : numbers){
            if(numbers[i] % 2 == 0){
                oddSum = oddSum+numbers[i];
            } else {
                evenSum = evenSum + numbers[i];
            }
            i++;
        }
        System.out.println("The sum of all even numbers is "+evenSum+" and the sum of all  odd numbers is "+oddSum);

        //Exercise 2
        int [] array = {1000,2000,3000,4000,10000,6000,7000,8000,9000,5000};
        int largest = 0;
        int index = 0;
        for(int j=0;j<array.length;j++){
            if(array[j]>largest){
                largest = array[j];
                index = j;
            }
        }
        System.out.println("The largest number in the array is "+largest+" and the index is "+index);

        //Exercise 3
        double [] matrix = {0.1,0.2,0.3,1,0.4,0.5,0.6,0.7,0.8,0.9};
        int index2 =0;
        boolean isDecimal = true;
        while (index2 < matrix.length){
            if(matrix[index2] < 1){
                System.out.println("the value at index "+index2+" is less than 1: "+matrix[index2]);
            } else {
                System.out.println("the value at index "+index2+" is 1");
            }
            index2++;

        }
    }
}
