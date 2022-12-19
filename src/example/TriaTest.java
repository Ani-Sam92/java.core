package example;

public class TriaTest {

    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        lightspeed = 186000;

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.println("3a" + days);
        System.out.println(" дней свет пройдет около");
        System.out.println(distance + " миль");
    }

    public static class ForExample {

        public static void main(String[] args) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }
}
