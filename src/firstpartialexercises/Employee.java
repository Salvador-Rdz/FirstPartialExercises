/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialexercises;

/**
 *
 * @author Salvador
 */
public class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private int salary;
    //Constructor
    public Employee(int id, String firstName, String lastName, int salary)
    {
        this.ID=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    //Getter
    public int getID()
    {
        return this.ID;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public String getName()
    {
        return (this.firstName+" "+this.lastName);
    }
    public int getSalary()
    {
        return this.salary;
    }
    //Setter
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    //Methods
    public int getAnnualSalary()
    {
        return (this.salary*12);
    }
    public int raiseSalary(int percent)
    {
        this.salary+=this.salary*percent/100;
        return this.salary;
    }
    @Override
    public String toString()
    {
        return "Employee[ id= "+this.ID+" ,name="+this.firstName+" "+this.lastName+", salary="+this.salary+" ]";
    }
}
