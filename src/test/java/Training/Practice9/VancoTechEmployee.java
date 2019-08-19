package Training.Practice9;

public class VancoTechEmployee {

    private String fullName;
    private String project;
    private String levelOfExpertise = "Junior";
    private String department;
    private int employeeID;
    private static int nextID = 11111;
    private boolean isFullTime = false;

    protected VancoTechEmployee (String fullName, String department, String project){
        this.fullName = fullName;
        this.department = department;
        this.project = project;
        this.employeeID = nextID;
        nextID += 9;
    }

    protected void promotion(){
        String previousLevel = "";

        if(!this.isFullTime){
            this.setIsFullTime(true);
            System.out.println("The employee: "+getFullName()+" now works full time");
        }
        if(this.levelOfExpertise.equals("Junior")){
                previousLevel = this.getLevelOfExpertise();
                this.setLevelOfExpertise("Senior");
        } else if(this.levelOfExpertise.equals("Senior")){
                previousLevel = this.getLevelOfExpertise();
                this.setLevelOfExpertise("Manager");
        } else if(this.levelOfExpertise.equals("Manager")){
                previousLevel = this.getLevelOfExpertise();
                System.out.println("There are no promotions left");
        } else { System.out.println("Unexpected level of Expertise: "+this.levelOfExpertise);}
        System.out.println("The employee: "+this.getFullName()+" was promoted from " +
                    previousLevel+" to "+this.getLevelOfExpertise());
    }


    protected void setFullName (String name){
        this.fullName = name;
    }

    protected void setProject (String project){
        this.project = project;
    }

    protected void setLevelOfExpertise (String level){
        this.levelOfExpertise = level;
    }

    protected void setEmployeeID (int employeeID){
        this.employeeID = employeeID;
    }

    protected void setdepartment (String department){
        this.department = department;
    }

    protected void setIsFullTime (boolean isFullTime){
        this.isFullTime = isFullTime;
    }

    protected String getFullName(){
        return this.fullName;
    }

    protected String getProject(){
        return this.project;
    }

    protected String getLevelOfExpertise(){
        return this.levelOfExpertise;
    }

    protected String getDepartment(){
        return this.department;
    }

    protected int getEmployeeID(){
        return this.employeeID;
    }

    protected boolean getIsFullTime(){
        return this.isFullTime;
    }

    //@Override
    protected String displayEmployee(){
        String information = "--------------------------" + "\n" +
                            "Full name: "+ this.getFullName() + "\n" +
                            "Project: " + this.getProject() + "\n" +
                            "Level of expertise: " +this.getLevelOfExpertise() + "\n" +
                            "Department: " +this.getDepartment() + "\n" +
                            "Employee ID: " + this.getEmployeeID() + "\n" +
                            "Full Time: " + this.getIsFullTime();
        System.out.println(information);
        return information;
    }

}
