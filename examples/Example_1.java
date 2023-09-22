class Example_1{

    public static boolean inRange(double min, double max, double value) {
        if ((value >= min) && (value <= max)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        if(args.length != 3) { // if the number of arguments does not equal three end the program
            System.out.println("java Example_1 min max value");
            return;
        }
        double min = Double.parseDouble(args[0]);
        double max = Double.parseDouble(args[1]);
        double value = Double.parseDouble(args[2]);
        if(inRange(min,max,value)){
            System.out.println(value+" is in range ["+min+" "+max+"]");
        } else{
            System.out.println(value+" is NOT in range ["+min+" "+max+"]");
        }
    }
}