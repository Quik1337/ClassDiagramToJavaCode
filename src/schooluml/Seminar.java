package schooluml;

import java.util.ArrayList;
import java.util.List;

public class Seminar
{
    private String name;
    private Teacher teacher;
    
    private List<Attendance> totalAttendance = new ArrayList();
    
    public List<Subject> subjects = new ArrayList();
    
    public Seminar(String name, Teacher teacher)
    {
        this.name = name;
        this.teacher = teacher;
    }
    
    //----------------------------------------------------
    
    public void addAttendance(Attendance attendance)
    {
        totalAttendance.add(attendance);
    }
    
    public void removeAttendance(Attendance attendance)
    {
        for(Attendance a : totalAttendance)
        {
            if(a == attendance)
                totalAttendance.remove(a);
        }
    }
    
    public List<Attendance> getTotalAttendance()
    {
        return totalAttendance;
    }
    
    //-----------------------------------------------------
    
    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }
    
    public void removeSubject(Subject subject)
    {
        for(Subject s : subjects)
        {
            if(s == subject)
                subjects.remove(s);
        }
    }
    
    public List<Subject> getSubjects()
    {
        return subjects;
    }
    
    //------------------------------------------------------
    
    public String toString()
    {
        return name;
    }
}