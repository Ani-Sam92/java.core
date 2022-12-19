package homework1;

public class FigurePainter {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0;  j <= i ; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }


        int size = 5;
        for (int i = 0; i < size; i++) {
            for (int k = size - i ; k > 0; k--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }




            }


        }



