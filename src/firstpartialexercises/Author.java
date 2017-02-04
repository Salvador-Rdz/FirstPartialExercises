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
public class Author {
    private String name;
    private String email;
    private char gender;
    //Constructor
    public Author(String name, String email, char gender)
    {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    //Getters
    public String getName()
    {
        return this.name;
    }
    public String getEmail()
    {
        return this.email;
    }
    public char getGender()
    {
        return this.gender;
    }
    //Setter
    public void setEmail (String email)
    {
        this.email=email;
    }
    //Methods
    @Override
    public String toString()
    {
        return "Author [name = "+this.name+" , email= "+" ,gender= "+this.gender+" ]";
    }
}
