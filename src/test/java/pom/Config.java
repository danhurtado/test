package pom;

import org.graalvm.compiler.asm.sparc.SPARCAssembler;

public class Config {

    public String user, url, pass, browser;

    public Config(String Environment){
        if(Environment=="PROD") {
            //return "https://www.charmsoffice.com/charms2";
            url = "https://www.charmsoffice.com/charms2";
            user = Settings.PROD_USER;
            pass = Settings.PROD_PASS;
            //browser = Settings.BROWSER;
        } else {
            url = "http://qa.charmsofficetest.com/charms_"+Environment;
            user = Settings.QA_USER;
            pass = Settings.QA_PASS;
            //browser = Settings.BROWSER;
        }


    }



    /*public static String Environment(){
        return "https://www.charmsoffice.com/charms2";
    }*/
}
