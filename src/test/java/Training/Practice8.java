package Training;

public class Practice8 {
    public static void main(String [] args){
            int base = 10;
            int exponent = 5;
            System.out.println(power(base,exponent));
    }

    public static int power(int a, int b){
        if((a<1 || b<1) ){
            System.out.println("numbers entered are less than 1!!");
            return -1;
        } else if(a==1){
            System.out.println("one raised to any power is 1!!!");
            return 1;
        } else{
            int c=a;
            for(int i=1;i<b;i++){
                c *= a;
            }
            System.out.println("the value of "+a+" raised to the power of "+b+" is "+c+"!!");
            return c;
        }
    }
}
