import java.lang.reflect.InvocationTargetException;

public class Student {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
        Student student = new Student();
        //Class.forName("Student").newInstance();
        Student student2 = Student.class.getConstructor().newInstance();
        Student student3 = (Student) student.clone();
    }
}
