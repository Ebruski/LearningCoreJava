import java.util.ArrayList;

public class WildcardParams {

    public static void main(String[] args) {
        WildcardParams wcp = new WildcardParams();
        wcp.myMethod(new ArrayList<MyClass>());
        wcp.myMethod2(new ArrayList<A>());
    }

    public void myMethod(ArrayList<? extends Thread> l){
        l.add(null);

    }

    public void myMethod2(ArrayList<? super B> l){
        l.add(null);
        l.add(new B());

    }
}
