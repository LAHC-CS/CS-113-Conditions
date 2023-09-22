class Example_2{

    public static void main(String[] args) {

        if(args.length != 2) { // if the number of arguments does not equal three end the program
            System.out.println("java Example_2 x y");
            return;
        }
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        x = Math.floor(x * 1000);
        x = x / 1000;

        y = Math.floor(y * 1000);
        y = y / 1000;

        System.out.println(x);
        System.out.println(y);

        if (x == y) {
            System.out.println("They are the same up to three decimal places");
        }
        else {
            System.out.println("They are different");
        }
    }
}