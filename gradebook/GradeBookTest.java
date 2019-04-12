package gradebook;

/*Código retirado do livro: Java - Como programar - Paul Deitel/ Harvey Deitel*/
public class GradeBookTest {

    public static void main(String[] args) {

        int[][] gradesArray = {{87, 96, 70},
        {68, 87, 90},
        {94, 100, 90},
        {55, 78, 24}};

        GradeBook myGradeBook = new GradeBook(
                "CS!)! Introduction to Java Programming", gradesArray);

        System.out.printf("Welcome to the grade book for %n%s%n%n",
                myGradeBook.getCourseName());
        myGradeBook.processGrades();
    }
}
