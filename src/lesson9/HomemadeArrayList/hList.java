package lesson9.HomemadeArrayList;

public interface hList {

    int get(int index);

    void set(int index, int item);

    int size();

    boolean isEmpty();

    boolean contains(int item);

    int[] toArray();

    void add(int item);

    void add(int index, int item);

    void remove(int index);

    void remove(Integer index);

    void addAll(int[] coll);

    void addAll(int index, int[] coll);

    void clear();

    int indexOf(int item);

    int lastIndexOf(int item);

    void removeAll(int[] coll);
}
