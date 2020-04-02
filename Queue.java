import java.util.ArrayList;
public class Queue<T> {
    ArrayList<T> elements=new ArrayList<>();
    void insert(T i) {
        elements.add(i);
    }
    T pop() {
        if(elements.isEmpty())
            return null;
        T x =elements.remove(0);
        return x;
    }
}
