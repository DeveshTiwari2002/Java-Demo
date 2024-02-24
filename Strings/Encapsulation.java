class Student {
    private int age;
    private String name;

    public void setData() {
        age = 21;
        name = "Devesh";
    }

    public void show() {
        System.out.println(name + " " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setData();
        obj.show();
    }
}
