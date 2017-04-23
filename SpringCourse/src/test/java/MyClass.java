import java.util.ArrayList;

/**
 * Created by Sahar on 2017-04-05.
 */
class MyClass {
    public static void addToString(ArrayList<? extends String> collection, Object element) {

    }
    public static void main(String[] args) {
        BaseLogger instance = BaseLogger.getInstance();
        instance.printLog();

    }
}
