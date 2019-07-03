package CHARMS2;

public class Practice2 {

    public static void main(String args[]){

        String [] stringArray = {"Daniel", "Jennifer","Keiran","Mandy","Karina"};
        boolean [] boolArray = {true,false,true,false,true,false};
        int [] intArray;
        intArray = new int[10];

        for(int i=0;i<stringArray.length;i++){
            System.out.println(stringArray[i]);
        }

        int j=0;
        for(boolean i : boolArray){
            if(i==true){
                System.out.println("The value at index "+j+" is: "+i);
            }
            j++;
        }

        for(int i=0;i<intArray.length;i++){
            intArray[i] = i+1;
        }
        for(int i=0;i<intArray.length;i++){
            if(i==intArray.length-1){
                System.out.print(intArray[i]);
            } else {
                System.out.print(intArray[i] + ", ");
            }
        }

    }
}
