package schooluml;

public class Attendance
{
    private String attendanceLevel;
    private Student student;
    private Seminar seminar;
    
    public Attendance(Student student, Seminar seminar)
    {
        this.student = student;
        this.seminar = seminar;
    }
    
    //----------------------------------------------------------------
    
    public Student getStudent()
    {
        return this.student;
    }
    
    public Seminar getSeminar()
    {
        return this.seminar;
    }
    
    //-----------------------------------------------------------------
    
    public void registerAttendance(Seminar seminar, Student student)
    {
        seminar.addAttendance(this);
        student.attendSeminar(this);
    }
    
    public void removeAttendance(Seminar seminar, Student student)
    {
        seminar.removeAttendance(this);
        student.unAttendSeminar(this);
    }
    
    //-------------------------------------------------------------------
    
    public void addAttendanceLevel()
    {
        attendanceLevel = "1";
    }
    
    public void removeAttendanceLevel()
    {
        attendanceLevel = "0";
    }
    
    public String getAttendanceLevel()
    {
        return attendanceLevel;
    }
}