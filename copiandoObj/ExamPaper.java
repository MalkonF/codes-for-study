package copiandoObj;

public class ExamPaper {

    /*Associação - ExamPaper contém Student e Subject
  
  Agregação - Uma classe usa outras classes em suas operações, mas estas classes n fazem parte da classe principal.
  Independente se a classe principal deixar de existir as outras classes continuam a existir. Ex: Se uma classe
  Venda deixar de existir a classe Produtos e Vendedores continuarão existindo.
  
  Composição - Igual agregação, mas se a classe principal deixar de existir as outras tb vai desaparecer(no contexto).Ex:
  ContaPoupanca e ContaCorrente n vao existir se a classe Banco não existir
     */
    private Student student;
    private Subject subject;
    private int marks;

    public ExamPaper(Student student, Subject subject, int marks) {
        this.student = new Student(student);
        this.subject = new Subject(subject);
        this.marks = marks;
    }

    public Student getStudent() {
        return new Student(student); // retorna uma cópia com os mesmos dados do obj original
    }

    public Subject getSubject() {
        return new Subject(subject);
    }

    public int getMarks() {
        return marks;
    }

    public void setStudent(Student student) {
        this.student = new Student(student);
    }

    public void setSubject(Subject subject) {
        this.subject = new Subject(subject);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString() {

        return "Exam paper information: \n"
                + student + "\n" + subject + "\n"
                + "Marks: " + marks;
    }

}
