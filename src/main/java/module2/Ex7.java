package module2;

public class Ex7 {

}

class Student{
    protected final String studying;

    protected Student(String work) {
        this.studying = work;
    }

    public Student() {
        this.studying = "Прохожу тестовое задание.";
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }


    public static class JavaStudent extends Student {
        JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }
}