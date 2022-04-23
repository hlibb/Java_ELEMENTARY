package lesson9.HomemadeArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestArrayList {

    @Test
    void size() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(23);
        array.add(12);
        assertEquals(3, array.size());
    }

    @Test
    void isEmpty1() {
        hArrayList array = new hArrayList(0);
        assertTrue(array.isEmpty());
    }

    @Test
    void isEmpty2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        assertFalse(array.isEmpty());
    }

    @Test
    void contains1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        assertTrue(array.contains(12));

    }

    @Test
    void contains2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        assertFalse(array.contains(11));
    }

    @Test
    void clear1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.clear();
        assertEquals(0, array.get(1));
    }

    @Test
    void get1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        assertEquals(13, array.get(1));
    }

    @Test
    void set1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.set(1, 15);
        assertEquals(15, array.get(1));
    }

    @Test
    void add1() {
        hArrayList array = new hArrayList(0);
        array.add(1);
        array.add(1);
        assertEquals(2, array.size());
    }

    @Test
    void add2() {
        hArrayList array = new hArrayList(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.remove(1);

        assertEquals(3, array.get(1));
    }

    @Test
    void addIndex1() {
        hArrayList array = new hArrayList(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(1, 4);
        assertEquals(4, array.get(1));
    }

    @Test
    void addIndex2() {
        hArrayList array = new hArrayList(0);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(3, 4);
        assertEquals(4, array.get(3));
    }

    @Test
    void addAll1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.addAll(new int[]{14, 15, 16});
        assertEquals(4, array.size());
    }

    @Test
    void addAll2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.addAll(new int[]{14, 15, 16});
        assertEquals(15, array.get(2));
    }

    @Test
    void addAllIndex1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.addAll(1, new int[]{22, 33, 44});
        assertEquals(33, array.get(2));
    }

    @Test
    void addAllIndex2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.addAll(1, new int[]{22, 33, 44});
        assertEquals(6, array.size());
    }

    @Test
    void removeIndex1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(22);
        array.add(32);
        array.remove(0);
        assertEquals(22, array.get(0));
    }

    @Test
    void removeIndex2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(22);
        array.add(32);
        array.remove(2);
        assertEquals(2, array.size());
    }

    @Test
    void removeItem1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(14);
        array.remove((Integer) 14);
        assertEquals(2, array.size());

    }

    @Test
    void removeItem2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.remove((Integer) 12);
        assertEquals(2, array.size());
    }

    @Test
    void removeItem3() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.remove((Integer) 12);
        assertEquals(2, array.size());
    }

    @Test
    void removeAll1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new int[]{15, 12});
        assertEquals(2, array.size());
    }

    @Test
    void removeAll2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new int[]{15, 12, 16, 78});
        assertEquals(2, array.size());
    }

    @Test
    void removeAll3() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        array.add(15);
        array.removeAll(new int[]{});
        assertEquals(6, array.size());
    }

    @Test
    void indexOf1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        assertEquals(3, array.indexOf(15));
    }

    @Test
    void indexOf2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(14);
        array.add(15);
        assertEquals(-80085, array.indexOf(21));
    }

    @Test
    void indexOf3() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(1, array.indexOf(13));
    }

    @Test
    void lastIndexOf1() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(2, array.lastIndexOf(13));
    }

    @Test
    void lastIndexOf2() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(-80085, array.lastIndexOf(12));
    }

    @Test
    void lastIndexOf3() {
        hArrayList array = new hArrayList(0);
        array.add(12);
        array.add(13);
        array.add(13);
        array.add(15);
        assertEquals(-80085, array.lastIndexOf(122));
    }

    public static void main(String[] args) {
        hArrayList array = new hArrayList(0);
        //set()
        array.add(12);
        array.add(13);
        array.set(1, 15);
        System.out.println(array);

        //
    }
}


