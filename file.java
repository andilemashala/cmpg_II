package  com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner car = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<String>();
        list.add("oil change");
        list.add("tire change");
        list.add("battery change");
        list.add("brake inspection");

        System.out.println(list);

        System.out.println("How can we help you? ");
        String carService = car.nextLine();

        if(carService.equals("oil change")){
            System.out.println("Price = R25");
        }
        else if(carService.equals("tire change")){
            System.out.println("Price = R22");
        }
        else if(carService.equals("battery check")){
            System.out.println("Price = R15");
        }
        else if(carService.equals("brake inspection")){
            System.out.println("Price = R5");
        }
        else {
            System.out.println("Invalid..");
        }

    }

}
