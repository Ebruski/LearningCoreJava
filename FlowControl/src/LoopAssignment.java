public class LoopAssignment {
    public static void main(String[] args) {
        int num = 200;

        // ForLoop

        for (int i = 1; i <= num; i++) {
            if (i % 10 == 0) {
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i);
        }

        // WhileLoop

        int i = 1;
        while (i <= num) {
            if (i % 10 == 0) {
                i++;
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i++);
        }

        // do-while
        i = 1;

        do {
            if (i % 10 == 0) {
                i++;
                continue;
            }
            if (i > 100) {
                break;
            }
            System.out.println(i++);
        } while (i <= num);
    }
}
