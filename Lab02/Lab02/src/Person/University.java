/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class University implements EmailRecipient
{
    private String emailAddress;
    private String name;
    public List<Faculty> faculties = new ArrayList<>();
    
    public University(String name, String emailAddress)
    {
        this.name = name;
        this.emailAddress = emailAddress;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    
    public List<Faculty> getFaculties()
    {
        for(Faculty faculty : faculties)
        {
            System.out.println(faculty);
        }
        return faculties;
    }
    public void addFaculty(Faculty faculty)
    {
        faculties.add(faculty);
    }
    
    @Override
    public String getEmailAddress()
    {
        return emailAddress;
    }
        
    
}