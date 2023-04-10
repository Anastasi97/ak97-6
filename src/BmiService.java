public class BmiService {
    public double calculate(double weightInKg, double heightInMeters) {
        double result = weightInKg / (heightInMeters * heightInMeters);
        return (int) result;
    }
}
