public class BmiService {
    public int calculate(double height, int weight) {
        double index = weight / (height * 2);
        return (int) index;
    }
}
