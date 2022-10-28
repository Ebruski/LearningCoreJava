public class ArrayReversal {
    public static void main(String[] args) {
        String[] courses = { "Java Core Learning", "Learning is good", "Always try to learn", "Consistency is key" };
        for (int i = courses.length-1; i >= 0; i--) {
            System.out.println(courses[i]);
        }
    }
}
