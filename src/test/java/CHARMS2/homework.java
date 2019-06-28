package CHARMS2;

public class homework {

    public static void main(String args[]) {
        //System.out.println("hello world");
        int a, b, c;
        a=15;
        b = 5;
        c= a+b;
        String work = "Vanco Payments";

        System.out.println("The value of the variable a is: "+a);
        System.out.println("The value of the variable b is: "+b);
        System.out.println("The value of the variable c is: "+c+" ( a + b)");
        System.out.println("If multiply a * b the result is: "+(a*b));
        System.out.println("The value of the variable work is: "+work);

        boolean addition = a>b;
        boolean equals = work == "ConnexPoint";

        if(addition=true){
            System.out.println("The statement a > b is: "+addition);
        } else {
            System.out.println("The statement a > b is: "+addition);
        }

        if(equals=true){
            System.out.println("The statement work = 'Vanco Payments' is: "+equals);
        } else {
            System.out.println("The statement work = 'Vanco Payments' is: "+equals); //Test Edg
        }

    }
}
