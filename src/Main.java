public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(150, 1.5);
        System.out.printf("%.1f", bodyMassIndex);
    }
}