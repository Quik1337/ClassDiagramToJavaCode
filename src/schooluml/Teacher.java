package schooluml;

import java.util.ArrayList;
import java.util.List;

public class Teacher
{
    private String name;
    private List<Seminar> seminarHistory = new ArrayList();
    
    public Teacher(String name)
    {
        this.name = name;
    }
    
    //-----------------------------------------------
    
    public void addSeminar(Program program, Seminar seminar)
    {
        seminarHistory.add(seminar);
        program.seminars.add(seminar);
    }
    
    public void removeSeminar(Program program, Seminar seminar)
    {
        for(Seminar s : seminarHistory)
        {
            if(seminar == s)
                seminarHistory.remove(s);
        }
        
        for(Seminar s : program.seminars)
        {
            if(seminar == s)
                program.seminars.remove(s);
        }
    }
    
    public Seminar findSeminar(Program program, String string)
    {
        for(Seminar s : program.seminars)
            if(string == s.toString())
                return s;
        
        return null;
    }
    
    //------------------------------------------------
    
    public void addSubject(Seminar seminar, Subject subject)
    {
        seminar.subjects.add(subject);
    }
    
    public void removeSubject(Seminar seminar, Subject subject)
    {
        for(Subject s : seminar.subjects)
        {
            if(subject == s)
                seminar.subjects.remove(s);
        }
    }
    
    public Subject findSubject(Seminar seminar, String string)
    {
        for(Subject s : seminar.subjects)
            if(string == s.toString())
               return s;
        
        return null;
    }
    
    //------------------------------------------------
    
    public Seminar getCurrentSeminar()
    {
        return seminarHistory.get(0);
    }
    
    public List<Seminar> getSeminarHistory()
    {
        return seminarHistory;
    }
    
    //-------------------------------------------------
  
    public String toString()
    {
        return name;
    }
}