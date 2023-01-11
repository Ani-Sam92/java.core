package homework6;

public class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        au.max(array);
        au.min(array);
        au.allelements(array);
        au.evennumbers(array);
        au.oddnumbers(array);
        au.oddcount(array);
        au.evencount(array);
        au.sum(array);


    }
}
