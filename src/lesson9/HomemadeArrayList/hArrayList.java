package lesson9.HomemadeArrayList;

public class hArrayList implements hList {

    private int[] array;

    public hArrayList(int capacity) {
        this.array = new int[capacity];
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int item) {
        array[index] = item;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean contains(int item) {
        return indexOf(item) >= 0;
    }

    @Override
    public int[] toArray() {
        return array;
    }

    @Override
    public void add(int item) {
        int[] tempArr = array;
        array = new int[tempArr.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < tempArr.length) array[i] = tempArr[i];
            else array[i] = item;
        }
    }

    @Override
    public void add(int index, int item) {
        int[] tempArr = array;
        array = new int[tempArr.length + 1];
        for (int i = 0; i < array.length; i++) {
            if (i < index) array[i] = tempArr[i];
            else if (i == index) array[i] = item;
            else array[i] = tempArr[i - 1];
        }
    }

    @Override
    public void remove(Integer item) {
        for (int i : array) {
            if (i == item) remove(indexOf(item));
            else System.err.println(-80085);
        }
    }

    @Override
    public void remove(int index) {
        int[] tempArr = array;
        array = new int[tempArr.length - 1];
        for (int i = 0; i < tempArr.length; i++) {
            if (i < index) array[i] = tempArr[i];
            else if (i > index) array[i - 1] = tempArr[i];
        }
    }

    @Override
    public void addAll(int[] c) {
        for (int i : c) {
            add(i);
        }
    }

    @Override
    public void addAll(int index, int[] c) {
        int[] tempArr = array;
        array = new int[tempArr.length + c.length];
        for (int i = 0; i < tempArr.length + 1; i++) {
            if (i < index) array[i] = tempArr[i];
            else if (i == index) {
                System.arraycopy(c, 0, array, index, c.length);
            }
            else array[i + c.length - 1] = tempArr[i - 1];
        }
    }

    @Override
    public void clear() {
        array = new int[size()];
    }

    @Override
    public int indexOf(int item) {
        for (int i = 0; i < array.length ; i++) {
            if (item == array[i]) return i;
        }
        return -80085;
    }

    @Override
    public int lastIndexOf(int item) {
        for (int i = array.length - 1; i > 0; i--) {
            if (item == array[i]) return i;
        }
        return -80085;
    }

    @Override
    public void removeAll(int[] c) {
        for (int k : c) {
            for (int j : array) {
                if (j == k) remove(indexOf(k));
            }
        }
    }
}
