package data;

public class Student {

    private int rollNo;
    private String name;
    private float totalMarks;

    public Student(int rollNo, String name, float totalMarks) {
        this.rollNo = rollNo;
        this.name = name;
        this.totalMarks = totalMarks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

