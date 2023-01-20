package homework8;

public class DynamicArray {

    private int [] array =  new int [15];
    private int size;

    DynamicArray() {
        size = 0;
    }

    public void add(int value) {
        if(size == array.length ){

        }
        array [ size ++] = value;
    }

    private void extend() {
        int [] tmp = new int [array.length + 15];
        for (int i = 0; i < size ; i++) {
            tmp[i] = array [i];
        }
        array = tmp;
    }

    public int getByIndex(int index) {
        if (index > 0 && index < array.length) {
            return array[index];
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size ; i++) {
            System.out.print(array[i]);
            System.out.print(",");

        }
    }



}
