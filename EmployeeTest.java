public class EmployeeTest{
  public static void main(String[] args) {
            Employee A = new Employee("John", "Thu", 3000.0);
            System.out.println(A.getFirstName());
            System.out.println(A.getLastName());
            System.out.println(A.getMonthlySalary());


            System.out.println("----------");
            System.out.println("   ");


            A.setFirstName("Mike");
            A.setLastName("Brown");
            A.setMonthlySalary(3500);
            System.out.println(A.getFirstName());
            System.out.println(A.getLastName());
            System.out.println(A.getMonthlySalary());
    
            A.setMonthlySalary(-3500);
            System.out.println(A.getMonthlySalary());


        System.out.println("----------");
        System.out.println("   ");

            Employee B = new Employee("Zhao", "Jia Le", 8000.0);
            Employee C = new Employee("Guo", "Xiao Yu", 7000.0);
            
            System.out.println("B yearsalary = " + B.YearlySalary());
            System.out.println("C yearsalary = " + C.YearlySalary());

            System.out.println("B raise salary = " + B.RaiseSalary());
            System.out.println("C raise salary = " + C.RaiseSalary());


}         
}