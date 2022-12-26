package homework1.homework2;

public class ArrayUtil {

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if (i != array.length - 1) {

            }
        }

        System.out.println();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println(" max :" + max);

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(" min:" + min);

        System.out.println();


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println("sum of odd numbers" + array[i]);
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) ;
            {
                System.out.println("sum of even numbers" + array[i]);
            }
        }

        System.out.println();
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                oddCount++;
            }

        }
        System.out.println("oddCount" + oddCount);
        System.out.println();
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                evenCount++;
            }
        }
        System.out.println("evenCount" + evenCount);

        System.out.println();
        int sum = 0;
        for (int i = 0; i < array.length  ; i++) {
            sum += array [i];
        }
        System.out.println("Sum" + sum);
        System.out.println();
        System.out.println("Sum" + sum / array.length);

        }

    }


