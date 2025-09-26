public class Average {
    public static void main(String[] args) {
        int n = 0;
        double sum = 0.0;
        while(!StdIn.isEmpty()) {
            double number = StdIn.readDouble();
            sum += number;
            n++;
        }
        double avg = sum / n;
        StdOut.printf("Avg: ", avg);
    }
}