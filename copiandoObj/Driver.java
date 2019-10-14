package copiandoObj;

public class Driver {

    public static void main(String[] args) {
        Subject subject1 = new Subject("TGY66", "Technical Programming 1");

        Student student1 = new Student("Malkon", 124434);

        ExamPaper paper = new ExamPaper(student1, subject1, 100);

        System.out.println("Subject code: " + paper.getSubject().getSubjectCode());

        /*Subject subject2 = new Subject("TGY66", "Technical Programming 1");

        if (subject1.equals(subject2)) {
            System.out.println("They are the same");
        }

        System.out.println(subject1);*/
    }

}
