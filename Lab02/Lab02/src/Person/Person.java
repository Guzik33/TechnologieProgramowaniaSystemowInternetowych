
package Person;


public class Person implements EmailRecipient
{
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Person(String firstName, String lastName, String emailAddress)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setEmailAddress(String emailAddress)
    {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString()
    {
        return firstName + " " + lastName;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }
}

