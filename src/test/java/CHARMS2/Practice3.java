package CHARMS2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Practice3 {

    public static void main(String [] args){
        double [] doubleArray = {1.0,1.0,2.0,1.0,1.0};
        boolean isChanged = false;
        int count = 0;
        while(count < doubleArray.length){
                doubleArray[count] = (count + 1) * 2.5;
                count++;
        }

        /*while(count < doubleArray.length){
            if(isChanged == false) {

                    doubleArray[count] = (count + 1) * 2.5;
                    count++;
                    isChanged = true;

            }
            isChanged = false;
        }*/



        for(double value : doubleArray){
            System.out.print(value+", ");
        }



    }
}
