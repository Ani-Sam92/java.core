package chapter3;

public class ClassLight {

    public static void main(String[] args) {
        int lightspeed; {
            long days;
            long seconds;
            long distance;

            lightspeed = 186000;
            days = 1000;
            seconds = days * 24 * 60 * 60;
            distance = lightspeed * seconds;

            System.out.print (" 3a "  + days );
            System.out.print( " дней свет пройдет около " );
            System.out.println(distance + " миль ");
        }
    }
    }


