public class Main {
    public static void main(String[] args) {
        for (int i=0; i <= 100; i++) {
            System.out.println(generateFizzBuzz(i));
        }
    }

    static String generateFizzBuzz(Integer num) {
        String output="";
        if (num % ConstString.FIZZ_NUM == 0) {
            output+=ConstString.FIZZ_STRING;
        }
        if (num % ConstString.BUZZ_NUM == 0) {
            output+=ConstString.BUZZ_STRING;
        }
        return output.equals("") ? num.toString() : output;
    }
}
