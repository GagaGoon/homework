package productstar;

import java.util.Arrays;

public class WorkShop {
    public static void main(String[] args) {
        Friend[] myFriends = {new Friend("Вася", Integer.parseInt("25"), true, 1.1f),
                new Friend("Лиза", Integer.parseInt("23"), true, 20),
                new Friend("Петя", Integer.parseInt("24"), false, 12),
                new Friend("Саша", Integer.parseInt("24"), false, 100.5f),
                new Friend("Андрей", Integer.parseInt("60"), false, 1.1f),
                new Friend("Настя", Integer.parseInt("20"), true, 20.1f),};

        System.out.println(Arrays.toString(myFriends));
    }
}
class Friend {
    String name;
    int age;
    boolean isFriendFromSchool;
    float hoursSpentTogetherLastWeek;

    public Friend(String name, int age, boolean isFriendFromSchool, float hoursSpentTogetherLastWeek) {
        this.name = name;
        this.age = age;
        this.isFriendFromSchool = isFriendFromSchool;
        this.hoursSpentTogetherLastWeek = hoursSpentTogetherLastWeek;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", isFriendFromSchool=" + isFriendFromSchool + '\'' +
                ", hoursSpentTogetherLastWeek=" + hoursSpentTogetherLastWeek + '\'' +
                '}';
    }
}