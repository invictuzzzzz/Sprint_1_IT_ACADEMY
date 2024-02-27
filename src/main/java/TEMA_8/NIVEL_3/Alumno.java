package TEMA_8.NIVEL_3;

public class Alumno {
    private String name;
    private int age;
    private String course;
    private int note;

    public Alumno(String name, int age, String course, int note) {

        this.name = name;
        this.age = age;
        this.course = course;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public int getNote() {
        return note;
    }

    @Override
    public String toString() {
        return "Soy un alumno con nombre " + getName() + ". Tengo "
                + getAge() + " años y estoy estudiando " + getCourse()
                + " con una nota de " + getNote();
    }
}
