public class Parsing_String {
    public static void main(String [] args){
        String mystring_value = "2000";
        System.out.println(mystring_value);
        mystring_value = mystring_value+1;
        System.out.println(mystring_value);
        int my_integer = Integer.parseInt(mystring_value);
        my_integer += 1;
        System.out.println(my_integer);
        mystring_value = "2000.52314";
        System.out.println(mystring_value);
        double my_double = Double.parseDouble(mystring_value);
        my_double += 0.365;
        System.out.println(my_double);
    }
}
