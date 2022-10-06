public class FlowControlAssignment {
    public static void main(String[] args) {
        int n = 150;

        for (int i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i);
        }
    }
}
