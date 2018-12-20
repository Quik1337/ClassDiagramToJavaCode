package schooluml;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Vilket program en Coordinator ansvarar för? :\n");
        
        Program java18 = new Program("Java18");
    
        ProgramCoordinator sara = new ProgramCoordinator("Sara", java18);
        
        System.out.println("Coordinatorn " + sara + " ansvarar för programmet " + sara.getProgram());
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Vilka lärare som finns för ett Program? : \n");
        
        Teacher hajder = new Teacher("Hajder");
        Teacher sigrun = new Teacher("Sigrun");
        Teacher mahmud = new Teacher("Mahmud");
        
        sara.addTeacher(hajder);
        sara.addTeacher(sigrun);
        sara.addTeacher(mahmud);
        
        System.out.println("De lärare som finns för programmet " + java18 + " är:");
        
        for(Teacher t : java18.getTeachers())
            System.out.println(t);
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Hur många studenter som finns i ett Program? :\n");
        
        Student adam = new Student("Adam");
        Student bernt = new Student("Bernt");
        Student olof = new Student("Olof");
        
        sara.addStudent(adam);
        sara.addStudent(bernt);
        sara.addStudent(olof);
        
        System.out.println("Det finns " + java18.students.size() + " stundenter i programmet " + java18 + ":");
        
        for(Student s : java18.getStudents())
            System.out.println(s);
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Hur man lägger till en ny student till ett Program? :\n");
        
        System.out.println("Studenter läggs till i ett program genom program coordinatorn.\n\n" +
                "Koden skrivs: \n" +
                "ProgramCoordinator.addStudent(Student);\n\n" +
                "I addStudent-metoden som finns i ProgramCoordinator-klassen sker följande:\n" +
                "Program.students.add(Student);");
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Vad närvaron är för Student X? :\n");
        
        Seminar seminar1 = new Seminar("Seminar 1", hajder);
        Seminar seminar2 = new Seminar("Seminar 2", hajder);
        Seminar seminar3 = new Seminar("Seminar 3", sigrun);
        Seminar seminar4 = new Seminar("Seminar 4", mahmud);
        
        hajder.addSeminar(java18, seminar1);
        hajder.addSeminar(java18, seminar2);
        sigrun.addSeminar(java18, seminar3);
        mahmud.addSeminar(java18, seminar4);
        
        Attendance adamAttendance1 = new Attendance(adam, seminar1);
        Attendance adamAttendance2 = new Attendance(adam, seminar2);
        Attendance adamAttendance3 = new Attendance(adam, seminar3);
        
        adam.attendSeminar(adamAttendance1);
        adam.attendSeminar(adamAttendance2);
        adam.attendSeminar(adamAttendance3);
        
        System.out.println("Det har varit " + java18.seminars.size() + "st seminarier för programmet " + java18 + ",\n" +
                "studenten " + adam + " har närvarat på " + adam.getSeminarsAttended().size() + "st av dessa!");
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Hur man skapar en ny Attendance? :\n");
        
        System.out.println("En ny Attendance skapas genom att först instansiera ett nytt Attendance-objekt enligt:\n" +
                "Attendance attendance = new Attendance(Seminar, Student);\n\n" +
                "Denna används sedan av en Student så här:\n" +
                "Student.attendSeminar(Seminar, Attendance);");
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Vilka kurser/seminarier som en lärare undervisat i?: \n");
        
        System.out.println("Läraren " + hajder + " har undervisat i:");
        
        for(Seminar seminar : hajder.getSeminarHistory())
            System.out.println(seminar);
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Vilka ämnen som undervisats i ett Seminar?\n");
        
        Subject klassdiagram = new Subject("Klassdiagram");
        Subject useCaseDiagram = new Subject("Use case-diagram");
        
        hajder.addSubject(seminar1, klassdiagram);
        hajder.addSubject(seminar1, useCaseDiagram);
        
        System.out.println("I " + seminar1 + " har dessa ämnen undervisats: ");
        
        for(Subject subject : seminar1.subjects)
            System.out.println(subject);
        
        System.out.println("\n----------------------------------------\n");
        
        System.out.println("Närvaron för Seminar X? :\n");
        
        Attendance olofAttendance1 = new Attendance(olof, seminar1);
        
        olof.attendSeminar(olofAttendance1);
        
        System.out.println("Närvaron för " + seminar1 + " var " + seminar1.getTotalAttendance().size() + " st!");
        
        seminar1.getTotalAttendance().get(0);
        
        for(Attendance attendance : seminar1.getTotalAttendance())
            System.out.println(attendance.getStudent());
        
        System.out.println("\n----------------------------------------\n");
    }
}