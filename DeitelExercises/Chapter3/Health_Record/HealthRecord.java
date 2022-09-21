package Practice.DeitelExercises.Chapter3.Health_Record;

import java.util.Scanner;

public class HealthRecord {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        HealthProfile profile = new HealthProfile();
//        BMI bmi = new BMI();
//        HeartRate rates = new HeartRate();
//        public String bmi() {
//            double weight = profile.getWeight();
//            double height = profile.getHeight() * 0.3048;
//            double index = (weight / Math.pow(height, 2));
//
//            if (index < 18.5) s = "Underweight";
//            else if (index >= 18.5 && index <= 24.9) s = "Normal";
//            else if (index >= 25 && index <= 29.9) s = "Overweight";
//            else if (index >= 30 ) s = "Obese";
//
//            return s;
//        }

        System.out.println("NAME");
        System.out.print("Enter your First name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter your Last name: ");
        String name2 = sc.nextLine();
        profile.setName(name1, name2);

        System.out.println("Date of Birth");
        System.out.print("day -dd- : ");
        int day = sc.nextInt();
        System.out.print("month -mm- : ");
        int month = sc.nextInt();
        System.out.print("year -yyyy- : ");
        int year = sc.nextInt();
        profile.setDateOfBirth(day, month, year);

        System.out.print("Height(foot): ");
        double height = sc.nextDouble();
        profile.setHeight(height);

        System.out.print("Weight(kg): ");
        double weight = sc.nextDouble();
        profile.setWeight(weight);

//        public int age() {
//          profile.getAge();
//        }

        System.out.println(profile.getName());
        System.out.println(profile.getDateOfBirth());
        System.out.println(profile.getAge());
        System.out.println(profile.getHeight());
        System.out.println(profile.getWeight());
//        System.out.println(bmi());
//        System.out.println(rates.maxHeartRate());
//        System.out.println(rates.targetHeartRate());



    }
}
