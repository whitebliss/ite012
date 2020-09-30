/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aesir
 */
public class Teacher extends Account{
    private String subject;
    private String specialization;

    public Teacher (int userId, String email, String password,  String firstName, String lastName,  long contactNo, String subject, String specialization)
    {
        // Set all the input data
        setUserId(userId);
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setEmail(email);
        setContactNo(contactNo);
        setSubject(subject);
        setSpecialization(specialization);
    }
    public Teacher (String email, String password,  String firstName, String lastName,  long contactNo, String subject, String specialization)
    {
        // Set all the input data
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setEmail(email);
        setContactNo(contactNo);
        setSubject(subject);
        setSpecialization(specialization);
    }
    public String getSubject() {
        return subject;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
