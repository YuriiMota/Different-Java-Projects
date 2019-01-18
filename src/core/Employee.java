package core;

import java.util.Objects;

public class Employee {
    public int employeeId;
    public String firstName,lastName;
    public int yearStarted;


    public boolean equals(Employee o){


        return this.employeeId==o.employeeId;
    }

    @Override
    public int hashCode() {
        return employeeId;
    }

    public static void main(String arg[]){
        Employee one = new Employee();
        one.employeeId=101;

        Employee two = new Employee();
        two.employeeId=101;
        if(one.equals(two))
            System.out.println("Success") ;else
            System.out.println("Failure");
    }
}
