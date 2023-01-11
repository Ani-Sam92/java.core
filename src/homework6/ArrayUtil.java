package homework6;

public class ArrayUtil {
    void max (int[] array ) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
        }
}
        System.out.println("max: " + max);

    }
    void min (int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" min:" + min);
    }
    void allelements(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i != array.length - 1) {

            }
        }
    }
    void evennumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("sum of even numbers" + array[i]);
            }
        }
    }
    void oddnumbers(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("sum of odd numbers" + array[i]);
            }
        }
    }
    void oddcount (int[] array){
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount" + oddCount);
    }
    void evencount(int[] array){
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount" + evenCount);
    }
    void sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length  ; i++) {
            sum += array [i];
        }
        System.out.println("Sum" + sum);
        System.out.println();
        System.out.println("Sum" + sum / array.length);

    }


}

