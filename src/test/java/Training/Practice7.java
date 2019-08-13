package Training;

public class Practice7 {
    public static void main(String [] args){
        String str1 = "Hello world, I'm a Vanco Worker";
        String str2 = "l";
        String str3 = "p";

        System.out.println(replaceS(str1,str2,str3));

    }

    public static String replaceS(String a, String b, String c){
        //System.out.println();
        if (b.length()>1 || c.length()>1){
            System.out.println("the length of the replacement terms is greater than 1!!!");
            return a;
        }

        if (b == c){
            System.out.println("the replacement term is equal to the term to be replaced!!!");
            return a;
        }

        String temp = "";
        for (int i=0;i<a.length();i++){
            //System.out.println(a.substring(i,i+1));
            if(a.substring(i,i+1).equals(b)){
                temp = temp + c;
            }
            else {
                temp = temp + a.substring(i,i+1);
            }

        }
        System.out.println("original string: "+a+", new string: "+temp+" (replaced "+b+" with p)");

        return temp;
    }



}
