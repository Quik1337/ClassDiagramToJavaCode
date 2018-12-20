package schooluml;

public class Subject
{
    private String name;
    private String subjectInfo;
    
    public Subject(String name)
    {
        this.name = name;
    }
    
    public void addSubjectInfo(String string)
    {
        subjectInfo = string;
    }
    
    public void removeSubjectInfo()
    {
        subjectInfo = "";
    }
    
    public String viewSubjectInfo()
    {
        return subjectInfo;
    }
    
    public String toString()
    {
        return name;
    }
}