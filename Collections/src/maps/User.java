package maps;

import java.util.Map;
import java.util.WeakHashMap;

public class User {

    @Override
    public String toString() {

        return "User";

    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Finalize Called");

    }
}

