package Training;

public class Practice6 {

    public static void main(String [] args){
        int [] matrix1 = {11,22,333,44,55,666,77,88};
        int [] matrix2= {22,44,666,88};

        Exercise1(matrix1,matrix2);
        System.out.println(Exercise2(1,1,1,8));
        System.out.println(Exercise3(102030405));

    }

    public static void Exercise1(int array1 [] , int array2 []){
        int largest1 = 0 , largest2=0, index1 = 0, index2=0;
        for(int i=0;i<array1.length;i++){
            if(array1[i]>largest1){
                largest1 = array1[i];
                index1 = i;
            }
        }

        for(int j=0;j<array2.length;j++){
            if(array2[j]>largest2){
                largest2 = array2[j];
                index2 = j;
            }
        }

        if(largest1 > largest2){
            System.out.println("The largest value is in array1: "+largest1+" at index "+index1);
        } else if(largest2 > largest1){
            System.out.println("The largest value is in array2: "+largest2+" at index "+index2);
        } else{
            System.out.println("Both arrays have a same largest value: "+largest1+", in array1 at index: "+index1+" and in array2 at index: "+index2);
        }

    }

    public static double Exercise2 (int number1, int number2, int number3, int number4){
        double result = (number1+number2+number3+number4);
        result = result / 4;
        return result;

    }

    public static int Exercise3 (int value){

        int sum = 0;

        while (value >= 10) {
            sum = sum + (value % 10);
            value = value - (value % 10);
            value = value / 10;
        }
        sum = sum + value;

        return sum;
    }

    //public static double

}
