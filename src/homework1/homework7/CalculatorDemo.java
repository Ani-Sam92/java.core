package homework1.homework7;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator ca = new Calculator();
        double c = ca.pluse(45.2, 66.4);
        System.out.println(c);
        double j = ca.minus(78.5, 12.8);
        System.out.println(j);
        double v = ca.multi(12.8, 7.1);
        System.out.println(v);
        double p = ca.divide(32.1, 10.2);
        System.out.println(p);
    }
}
