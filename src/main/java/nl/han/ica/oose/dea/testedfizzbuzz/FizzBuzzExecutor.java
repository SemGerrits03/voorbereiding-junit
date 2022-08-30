package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){
        if (i == 3) {
            return "Fizz";
        }
        if (i == 5) {
            return "Buzz";
        }
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        }
        return String.valueOf(i);
    }
}
