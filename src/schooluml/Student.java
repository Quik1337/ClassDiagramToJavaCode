package schooluml;

import java.util.ArrayList;
import java.util.List;

public class Student
{
    private String name;
    private List<Attendance> seminarsAttended = new ArrayList();
    
    public Student(String name)
    {
        this.name = name;
    }
    
    //--------------------------------------------------------
    
    public void attendSeminar(Attendance attendance)
    {
        seminarsAttended.add(attendance);
        attendance.getSeminar().addAttendance(attendance);
    }
    
    public void unAttendSeminar(Attendance attendance)
    {
        seminarsAttended.remove(attendance);
        attendance.getSeminar().removeAttendance(attendance);
    }
    
    public List<Attendance> getSeminarsAttended()
    {
        return seminarsAttended;
    }
    
    //-------------------------------------------------------
    
    public String toString()
    {
        return name;
    }
}