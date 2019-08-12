package WEBSTORE.Resources;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.Properties;

public class ExecuteTest {

    @Test
    public void testLogin() throws Exception {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver", "C:/gecko/geckodriver.exe");
        WebDriver webdriver = new FirefoxDriver();
        ReadExcelFile file = new ReadExcelFile();
        ReadObject object = new ReadObject();
        Properties allObjects = object.getObjectRepository();
        UIOperation operation = new UIOperation(webdriver);

        Sheet sheet = file.readExcel(System.getProperty("user.dir")+"\\src\\test\\java\\WEBSTORE\\Resources\\","TestCase.xlsx" , "KeywordFramework");
//Find number of rows in excel file
        int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
        //Create a loop over all the rows of excel file to read it
        for (int i = 1; i < rowCount+1; i++) {

            //Loop over all the rows
            Row row = sheet.getRow(i);
            //Check if the first cell contain a value, if yes, That means it is the new testcase name

            for(int j=0; j<5; j++){
                if (row.getCell(j) == null ){
                    row.createCell(j);
                }
            }

            if(row.getCell(0).toString().length()==0){

                if(row.getCell(1).toString().equals("DOLINE")){
                    System.out.println(row.getCell(1).toString() + "----" + row.getCell(2).toString() + "----" +
                            row.getCell(3).toString() + "----" + row.getCell(4).toString());

                    int temprow = (int)row.getCell(4).getNumericCellValue()-1;
                    Row rowtemp = sheet.getRow(temprow);

                    operation.perform(allObjects, rowtemp.getCell(1).toString(), rowtemp.getCell(2).toString(),
                            rowtemp.getCell(3).toString(), rowtemp.getCell(4).toString());
                }
                else if(row.getCell(1).toString().equals("DOFROMTO")){

                    int from = (int)row.getCell(2).getNumericCellValue();
                    int to = (int)row.getCell(3).getNumericCellValue();

                    for(int k = from;k <= to;k++){
                        System.out.println(row.getCell(1).toString() + "----" + row.getCell(2).toString() + "----" +
                                row.getCell(3).toString() + "----" + row.getCell(4).toString());

                        int temprow = k-1;
                        Row rowtemp = sheet.getRow(temprow);

                        operation.perform(allObjects, rowtemp.getCell(1).toString(), rowtemp.getCell(2).toString(),
                                rowtemp.getCell(3).toString(), rowtemp.getCell(4).toString());

                    }

                }else if(row.getCell(1).toString().equals("VALIDATE")){
                    System.out.println(row.getCell(1).toString() + "----" + row.getCell(2).toString() + "----" +
                            row.getCell(3).toString() + "----" + row.getCell(4).toString());

                     boolean validation = operation.validate(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
                             row.getCell(3).toString(), row.getCell(4).toString());

                     if (validation){
                         //l;
                     }

                    int temprow = (int)row.getCell(4).getNumericCellValue()-1;
                    Row rowtemp = sheet.getRow(temprow);

                    operation.perform(allObjects, rowtemp.getCell(1).toString(), rowtemp.getCell(2).toString(),
                            rowtemp.getCell(3).toString(), rowtemp.getCell(4).toString());
                }
                else{
                    //Print testcase detail on console
                    System.out.println(row.getCell(1).toString() + "----" + row.getCell(2).toString() + "----" +
                            row.getCell(3).toString() + "----" + row.getCell(4).toString());
                    //Call perform function to perform operation on UI
                    operation.perform(allObjects, row.getCell(1).toString(), row.getCell(2).toString(),
                            row.getCell(3).toString(), row.getCell(4).toString());
                }
            }
            else{
                //Print the new testcase name when it started
                System.out.println("New Testcase->"+row.getCell(0).toString() +" Started");
            }
        }
    }
}