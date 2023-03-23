public class Student {
    private int studentId;
    private String name;
    private int grade;
    private double multiplier;

    public Student(int studentId, String name, int grade, double multiplier) {
        setGrade(0);
        setMultiplier(1.06);
        setName(name);
        setStudentId(studentId);
    }

    public boolean setMultiplier(double multiplier)
    {
        if (multiplier == 1.08 || multiplier == 1.06 || multiplier ==1.06 * 1.08){
            return true;
        } else {
            return false;
        }
    }

    public double getComputedGrade()
    {
        return multiplier * grade;
    }

    public boolean setGrade(int grade)
    {
        if(grade == -3 || grade == 0 || grade == 2 || grade == 4 || grade == 7 || grade == 10 || grade == 12){
            this.grade = grade;
            return true;
        }
        else
            return false;
    }

    public int getGrade()
    {
        return grade;
    }

    public String getName()
    {
        return name;
    }

    public boolean setName(String name)
    {
        if (name.split(" ").length < 2){
            return false;
        } else if ( name == null || name.isEmpty()) {
            return false;
        } else if (name.matches(".[.\\/(),&%€#!$].")){
            return false;
        } else {
            this.name = name;
            return true;
        }
    }

    public int getStudentId()
    {
        return studentId;
    }

    public boolean setStudentId(int studentId)
    {
        if (studentId >= 0) {
            this.studentId = studentId;
            return true;
        } else {
            return false;
        }
    }
}
