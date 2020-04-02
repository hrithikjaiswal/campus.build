import java.util.ArrayList;
public class SinglyList<T> {

    ArrayList<T> element = new ArrayList<>();
    int itemSize = 0;

    public void addItems(T item) {
        element.add(item);
    }

    public void deleteItems(T item) {
        if(element.isEmpty())
            System.out.println("List Empty!");
        else {
            int flag = 0,i=0;
            if (item != null) {
                for ( i = 0; i < element.size(); i++) {
                    if (element.get(i) == item) {
                        flag = 1;
                        break;
                    }
                }
            }
            if (flag == 0)
                System.out.println(item+" not found");
            else {
               T x = element.remove(i);
               System.out.println(item+" removed from the list");
            }
        }
    }
}