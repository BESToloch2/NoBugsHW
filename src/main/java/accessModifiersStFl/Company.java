package accessModifiersStFl;

public class Company {
    static String companyName = "NoBugs";
    final int employeeID;
    String employeeName;

    public Company (int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    static void printCompanyName(){
        System.out.println("Company name: " + companyName);
    }


    public String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }


    public static void main (String[] args){
        Company e1 = new Company(1,"Alex");
        Company e2 = new Company(2,"Oleksandr");
        Company e3 = new Company(3,"Sasha");

        Company.printCompanyName();

        Company.companyName = "NoBugsAndDot";

        Company.printCompanyName();

        //  e1.employeeID = 5;
    }
}
