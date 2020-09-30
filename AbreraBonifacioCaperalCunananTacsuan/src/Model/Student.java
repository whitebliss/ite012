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
public class Student extends Account{
    private long studentNo;
    private String program;

    public Student (int userId, String email, String password, String firstName, String lastName, long contactNo, long studentNo, String program)
    {
        // Set all the input data
        setUserId(userId);
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setEmail(email);
        setContactNo(contactNo);
        setStudentNo(studentNo);
        setProgram(program);
    }
    
    public Student (String email, String password, String firstName, String lastName, long contactNo, long studentNo, String program)
    {
        // Set all the input data
        setPassword(password);
        setLastName(lastName);
        setFirstName(firstName);
        setEmail(email);
        setContactNo(contactNo);
        setStudentNo(studentNo);
        setProgram(program);
    }
    
    public long getStudentNo() {
        return studentNo;
    }

    public String getProgram() {
        return program;
    }

    public void setStudentNo(long studentNo) {
        this.studentNo = studentNo;
    }

    public void setProgram(String program) {
        this.program = program;
    }
}
