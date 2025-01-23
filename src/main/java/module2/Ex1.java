package module2;

public class Ex1 {
    public static class Cat{
        public void sayHello(){
            System.out.println("Мяу");
        }
    }

    public static class Dog{
        public void sayHello(){
            System.out.println("Гав");
        }

        public void catchCat(Cat cat){
            System.out.println("Кошка поймана");
            this.sayHello();
            cat.sayHello();
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.catchCat(new Cat());
    }
}
