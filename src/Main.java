public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMetre = 1.75;
        int weighKG = 68;
        double bmi = service.calculate(heightMetre, weighKG);
        System.out.println(bmi);
    }
}