package Training.Practice9;

public class Practice {
    public static void main (String args []){
        VancoTechEmployee Daniel = new VancoTechEmployee("Daniel Hurtado", "Quality Assurance", "CHARMS");
        Daniel.setFullName("Daniel Robledo");
        //Daniel.setLevelOfExpertise("Director");
        Daniel.promotion();
        Daniel.promotion();
        Daniel.promotion();
        Daniel.displayEmployee();

        VancoTechEmployee Edgar = new VancoTechEmployee("Edgar Hernandez", "IT Development", "CHARMS");
        Edgar.promotion();
        Edgar.displayEmployee();
    }
}
