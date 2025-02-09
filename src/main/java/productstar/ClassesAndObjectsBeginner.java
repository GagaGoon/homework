package productstar;

public class ClassesAndObjectsBeginner {
    public static void main(String[] args) {
        Student student = new Student("Aleksey","Geshko","aaa@mail.ru",
                "applied computer science",212);
        Docent docent = new Docent("Aleksey","Ivanovich","bbb@mail.ru",
                "applied computer science",304);
        student.speak();
        docent.speak();
        student.currentClassroom();
        docent.currentClassroom();
        student.homework();
        docent.testWork();
    }
}

class UniversityMan {
    String firstName;
    String surname;
    String email;
    String department;
    private int classroom;

    public UniversityMan(String firstName, String surname, String email, String department, int classroom) {
        this.firstName = firstName;
        this.surname = surname;
        this.email = email;
        this.department = department;
        this.classroom = classroom;
    }

    void speak(){
        System.out.println("University man speak");
    }

    void currentClassroom() {
        System.out.println("University man in classroom: " + classroom);
    }

    int getClassroom() {
        return classroom;
    }
    void setClassroom(int classroom) {
        if(classroom < 0){
            this.classroom = 0;
        }
        else{
            this.classroom = classroom;
        }
    }
}

class Student extends UniversityMan {
    public Student(String firstName, String surname, String email, String department, int classroom) {
        super(firstName, surname, email, department, classroom);
    }

    void speak() {
        System.out.println("Student speak");
    }

    void currentClassroom() {
        System.out.println("Student in classroom: " + getClassroom());
    }

    void homework(){
        System.out.println("Student doing his homework");
    }
}

class Docent extends UniversityMan {
    public Docent(String firstName, String surname, String email, String department, int classroom) {
        super(firstName, surname, email, department, classroom);
    }

    void speak() {
        System.out.println("Docent speak");
    }

    void currentClassroom() {
        System.out.println("Docent in classroom: " + getClassroom());
    }

    void testWork(){
        System.out.println("Docent prepare test work");
    }
}