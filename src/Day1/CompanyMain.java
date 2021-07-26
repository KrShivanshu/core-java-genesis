package src.Day1;
import java.util.Scanner;

class Company{
    private String name;
    private String employees;
    private String teamlead;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmployees() {
        return employees;
    }
    public void setEmployees(String employees) {
        this.employees = employees;
    }
    public String getTeamlead() {
        return teamlead;
    }
    public void setTeamlead(String teamlead) {
        this.teamlead = teamlead;
    }

}

public class CompanyMain extends Company{
    public static void main(String[] args){
        CompanyMain c=new CompanyMain();
        System.out.println("Enter the company name:");
        Scanner sc = new Scanner(System.in);
        c.setName(sc.nextLine());
        System.out.println("Enter the employees:");
        c.setEmployees(sc.nextLine());
        System.out.println("Enter TeamLead:");
        c.setTeamlead(sc.nextLine());
        String[] arrOfStr =  c.getEmployees().split(",");
        for(int i=0;i<arrOfStr.length;i++)
        {
            if(arrOfStr[i].equals(c.getTeamlead())){
                System.out.println("Name: "+c.getName());
                System.out.println("Employees: "+c.getEmployees());
                System.out.println("Lead: "+c.getTeamlead());
                break;
            }
            if(i==(arrOfStr.length-1))
            {
                System.out.println("Invalid Input.");
            }
        }
        sc.close();
    }
}
