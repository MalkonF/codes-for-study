package copiandoObj;

import java.util.Objects;

public class Student {

    private String studentName;
    private long studentNumber;

    public Student(String studentName, long studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    Student(Student student) {//Atribuir valor padrão das variaveis studentName e studentNumber
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNumber(long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public long getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "Student Information: \n"
                + "Student name: " + studentName + "\n"
                + "Student number: " + studentNumber;
    }

    public boolean equals(Student object) {
        return (this.studentNumber == object.studentNumber && this.studentName.equals(object.studentName));

    }

}
