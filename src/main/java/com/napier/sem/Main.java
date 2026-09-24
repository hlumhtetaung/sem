package com.napier.sem;

public class Main
{
    public static void main(String[] args)
    {
        // Create new Application
        App a = new App();

        // Connect to database
        a.connect();

        // Get employee
        Employee employee = a.getEmployee(10001);

        if (employee != null)
        {
            System.out.println("Employee ID: " + employee.emp_no);
            System.out.println("First name: " + employee.first_name);
            System.out.println("Last name: " + employee.last_name);
        }
        else
        {
            System.out.println("Employee not found");
        }

        // Disconnect from database
        a.disconnect();
    }
}