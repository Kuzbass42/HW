package javase01.t04.arrays;

public class OneDimensionArray {
    public static void main(String[] args) {
        double  max;
        int     i;

        if (args.length == 0 || args.length % 2 != 0) {
            System.out.println("Введите четное число аргументов.");
        }
        else {
            try {

                max = Double.parseDouble(args[0]) + Double.parseDouble(args[args.length - 1]);

                for (i = 1; i <= args.length / 2; i++){
                    max = max > Double.parseDouble(args[i]) + Double.parseDouble(args[args.length - i - 1]) ?
                                max : Double.parseDouble(args[i]) + Double.parseDouble(args[args.length - i - 1]);
                }

                System.out.println("Максимальное значение = " + max);

            } catch (NumberFormatException e) {
                System.err.println("Неверный формат аргумента.");
            }
        }
    }
}