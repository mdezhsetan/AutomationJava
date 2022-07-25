public class FizzBuzz {

    public String checkFizzBuzz(int number){

        if(number%3==0) {
            if (number % 5 == 0)
                return "fizzbuzz";
            return "fizz";
        }
        if(number%5 == 0)
            return "buzz";

        return String.valueOf(number);
    }
}
