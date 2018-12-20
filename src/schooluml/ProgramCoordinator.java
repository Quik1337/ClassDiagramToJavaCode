package schooluml;

public class ProgramCoordinator
{
    private String name;
    private Program program;
    
    public ProgramCoordinator(String name, Program program)
    {
        this.name = name;
        this.program = program;
    }
    
    //---------------------------------------------------------
    
    public Program getProgram()
    {
        return this.program;
    }
    
    public void addTeacher(Teacher teacher)
    {
        program.teachers.add(teacher);
    }
    
    public void removeTeacher(Teacher teacher)
    {
        for(Teacher t : program.teachers)
        {
            if(teacher == t)
                program.teachers.remove(t);
        }
    }
    
    public Teacher findTeacher(String string)
    {
        for(Teacher t : this.program.teachers)
            if(string == t.toString())
               return t;
        
        return null;
    }
    
    //-------------------------------------------------------
    
    public void addStudent(Student student)
    {
        program.students.add(student);
    }
    
    public void removeStudent(Student student)
    {
        for(Student s : program.students)
        {
            if(student == s)
                program.students.remove(s);
        }
    }
    
    public Student findStudent(String string)
    {
        for(Student s : program.students)
            if(string == s.toString())
               return s;
        
        return null;
    }
    
    //------------------------------------------------------
    
    public String toString()
    {
        return name;
    }
}