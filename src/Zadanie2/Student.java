package Zadanie2;

public class Student extends Person {
    String studyType;
    int studyYear;
    float studyCost;

    public Student(String studyType, int studyYear, float studyCost) {
        this.studyType = studyType;
        this.studyYear = studyYear;
        this.studyCost = studyCost;
    }

    public Student(String name, String address, String studyType, int studyYear, float studyCost) {
        super(name, address);
        this.studyType = studyType;
        this.studyYear = studyYear;
        this.studyCost = studyCost;
    }

    public String getStudyType() {
        return studyType;
    }

    public void setStudyType(String studyType) {
        this.studyType = studyType;
    }

    public int getStudyYear() {
        return studyYear;
    }

    public void setStudyYear(int studyYear) {
        this.studyYear = studyYear;
    }

    public float getStudyCost() {
        return studyCost;
    }

    public void setStudyCost(float studyCost) {
        this.studyCost = studyCost;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studyType='" + studyType + '\'' +
                ", studyYear=" + studyYear +
                ", studyCost=" + studyCost +
                '}';
    }
}
