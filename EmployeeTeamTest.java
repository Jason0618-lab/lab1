public class EmployeeTeamTest {

    public static void main(String[] args) {

      
        Employee boss = new Employee("John", "Smith", 5000);
        Employee employee = new Employee("Mike", "Brown", 3000);

    
        EmployeeTeam team = new EmployeeTeam(boss, employee);

   
        System.out.println("Employee Details:");
        team.printEmployeeDetails();

     
        System.out.println("All Employees:");
        team.printAllEmployeesDetails();

     
        team.updateSalaryOfEmployee("Mike", 3500);

        System.out.println("After salary update:");
        team.printAllEmployeesDetails();

      
        team.giveRaiseToAllEmployees();

        System.out.println("After 10% raise:");
        team.printAllEmployeesDetails();
    }
}