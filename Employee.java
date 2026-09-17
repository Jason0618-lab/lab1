public class Employee {
    private String FirstName;
     private String LastName;
      private double  Mouthly_Salary;


public Employee(String FirstName,String LastName,double Mouthly_Salary){
         this.FirstName=FirstName;
         this.LastName=LastName;
         this.Mouthly_Salary=Mouthly_Salary;
}

public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }


    public void setLastName(String lastName) {
        this.LastName=LastName;
    }

 
    public void setMonthlySalary(double Mouthly_Salary) {
        if (Mouthly_Salary > 0) {
            this.Mouthly_Salary = Mouthly_Salary;
        }
        else{
            this.Mouthly_Salary=0;        
        }
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }


    public double getMonthlySalary() {
        return Mouthly_Salary;
    }

    public double YearlySalary() {
        return Mouthly_Salary * 12;
    }

    public double RaiseSalary(){
        return  Mouthly_Salary*12*1.1;
    }
}

