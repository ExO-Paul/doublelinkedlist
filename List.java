package sokolchik.pavel.doublelinkedlist;

/**
 * Created by sokolchik_p on 09.09.2014.
 */
public class List<T> {
    private Node<T> head;


    public void add (T val){
        if (head == null){
            head = new Node<T>();
            head.value = val;
        }
        else{
            Node<T> node = new Node<T>();
            node.value=val;
            head.prev = node;
            node.next=head;
            head = node;
        }
    };

    public T get(int i){
        Node<T> current=head;
        for (int j=i; j>0 ;j--){
            current = current.next;
        }
        return current.value;
    }

    public void print (){
        Node<T> current = head;
        do {
            System.out.println(current.value);
            current = current.next;
        } while (current!=null);
        System.out.println();
    };

    public void printReverse (){
        Node<T> current = head;
        do {
            current = current.next;
        } while (current.next!=null);
        do {
            System.out.println(current.value);
            current = current.prev;
        } while (current!=null);
        System.out.println();
    };

}
