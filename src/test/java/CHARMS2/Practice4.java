package CHARMS2;

public class Practice4 {

    public static void main(String [] args){

        //////////Exercise 1
        String month = "October";
        int days;

        switch (month){
            case "January" :
            case "March" :
            case "May" :
            case "July" :
            case "August" :
            case "October" :
            case "December" :
                days = 31;
                break;
            case "February" :
                days = 28;
                break;
            case "April" :
            case "June" :
            case "September" :
            case "November" :
                days = 30;
                break;
            default :
                    System.out.println("Incorrect month");
                    days = 0;
                    break;

        }
        if(days > 0)
        System.out.println(month+" has "+days+" days");


        ///////Exercise 2
        int value = 60;
        String message = "The value is ";

        if(value<=50){
            //System.out.print(message+"50 or less");
            message = message+"50 or less";
            if(value % 2 == 0){
                //System.out.println(" and even");
                message = message+" and even";
            } else
                //System.out.println(" and odd");
                message = message+" and odd";
        } else{
            //System.out.print(message+"greater than 50");
            message = message+"greater than 50";
            if(value % 4 ==0){
                //System.out.print(" and multiple of 4");
                message = message+" and multiple of 4";
            } if(value % 5 == 0){
                //System.out.print(" and multiple of 5");
                message = message+" and multiple of 5";
            }
        }
        System.out.println(message);

        ///////Exercise 3
        for (int j = 5; j > 0; j--){
            for (int i = j; i > 0; i--){
                System.out.print(i+" ");
            }
            System.out.println("");
        }

    }
}
