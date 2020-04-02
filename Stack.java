import java.util.ArrayList;

public class Stack<T> {
    ArrayList<T> elements=new ArrayList<>();
    void push(T i) {
        elements.add(i);
    }
    T pop() {
        if(elements.isEmpty())
            return null;
        T x =elements.remove(elements.size()-1);
        return x;
    }
}
