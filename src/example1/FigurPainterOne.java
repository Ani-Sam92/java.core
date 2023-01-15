package example1;

public class FigurPainterOne {

    void FigurPainterOne(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    void FigurePainterTwo(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j > i ; j++) {
                System.out.println(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.println("* ");

            }
            for (int j = 4; j > i ; j++) {
                System.out.println(" ");

                }

            }

        }
    }


