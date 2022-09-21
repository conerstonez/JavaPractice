package Practice.DeitelExercises.Chapter3.Health_Record;

public class HealthProfile {
    enum Gender {MALE, FEMALE}
    private String name;
    private String date;
    private int age;
    private double height;
    private double weight;
    public void setName(String name1, String name2) {
        name = name1 + " " + name2;
    }
    public void setDateOfBirth(int day, int month, int year) {
        date = year + "-" + month + "-" + day;
        age = 2022 - year;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public String getDateOfBirth() {
        return date;
    }
    public int getAge() {
        return age;
    }
    public double getHeight() {
        return height;
    }
    public double getWeight() {
        return weight;
    }
}
