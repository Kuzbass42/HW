package javase01.t03.loops;

public class FunctionEngine {
    public static void main(String[] args) {
        double a;
        double b;
        double h;
        double x;

        if (args.length != 3) {
            System.out.println("Неверное число аргументов.");
        }
        else {
            try {
                a = Double.parseDouble(args[0]);
                b = Double.parseDouble(args[1]);
                h = Double.parseDouble(args[2]);

                if (a < b) {
                    for (x = a; x <= b; x += h) {
                        System.out.println("x= " + x + ", " + "y= " + calcFunction(x));
                    }
                }
                else{
                    System.out.println("Координата начала отрезка больше координаты конца отрезка.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Неверный формат аргумента.");
            }
        }
    }

    static strictfp double calcFunction(double _x){

        return Math.tan(2*_x) - 3;
    }
}