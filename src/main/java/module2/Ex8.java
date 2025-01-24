package module2;

public class Ex8 {
}

class Ex8Student {
    protected final String studying;

    protected Ex8Student(String work) {
        this.studying = work;
    }

    public Ex8Student() {
        this.studying = "Прохожу тестовое задание.";
    }

    public void study() {
        System.out.println("Я очень занят. " + studying);
    }


    public static class JavaStudent extends Ex8Student {
        JavaStudent() {
            super("Прохожу курс по Java.");
        }
    }


    public static class LazyStudent extends Ex8Student {
        LazyStudent() {
            super("Сегодня не учусь, мне лень.");
        }

        public void study() {
            System.out.println(studying);
        }
    }
}