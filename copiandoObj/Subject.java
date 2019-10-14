package copiandoObj;

public class Subject {

    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName) {

        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public Subject(Subject subject) {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public boolean equals(Subject object) {
        return (this.subjectName.equals(object.subjectName)
                && this.subjectCode.equals(object.subjectCode));
    }

    @Override
    public String toString() {
        return "Subject information:\n"
                + "Subject code: " + subjectCode + "\n"
                + "Subject name: " + subjectName;
    }
}
