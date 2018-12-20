package schooluml;

import java.util.ArrayList;
import java.util.List;

public class Program
{
    private String name;
    
    public List<Student> students = new ArrayList();
    public List<Teacher> teachers = new ArrayList();
    public List<Seminar> seminars = new ArrayList();
    
    public Program(String name)
    {
        this.name = name;
    }
    
    //------------------------------------------------------------
    
    public List<Student> getStudents()
    {
        return students;
    }
    
    //---------------------------------------------------------------------
    
    public List<Teacher> getTeachers()
    {
        return teachers;
    }
    
    //---------------------------------------------------------
    
    public List<Seminar> getSeminars()
    {
        return seminars;
    }
    
    //--------------------------------------------------------------------
    
    public String toString()
    {
        return name;
    }
}