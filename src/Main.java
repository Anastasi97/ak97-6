public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 98; // Вес
        double heightInMeters = 1.87; // Рост в метрах
        int bmi = (int) service.calculate(weightInKg, heightInMeters);
        System.out.println(bmi);
    }
}