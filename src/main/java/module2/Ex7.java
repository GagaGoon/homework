package module2;

public class Ex7 {

}

class Ex7Student {
    protected final String studying;

    protected Ex7Student(String work) {
        this.studying = work;
    }

    public Ex7Student() {
        this.studying = "Прохожу тестовое задание.";
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }


    public static class JavaStudent extends Ex7Student {
        JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }
}