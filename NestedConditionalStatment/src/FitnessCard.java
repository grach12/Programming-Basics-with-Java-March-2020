import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String gender = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String sport = scan.nextLine();

        double price = 0;
        if ("m".equals(gender)) {
            switch (sport) {
                case "Gym":
                    price = 42;
                    break;
                case "Boxing":
                    price = 41;
                    break;
                case "Yoga":
                    price = 45;
                    break;
                case "Zumba":
                    price = 34;
                    break;
                case "Dances":
                    price = 51;
                    break;
                case "Pilates":
                    price = 39;
                    break;
            }
        } else {
            switch (sport) {
                case "Gym":
                    price = 35;
                    break;
                case "Boxing":
                    price = 37;
                    break;
                case "Yoga":
                    price = 42;
                    break;
                case "Zumba":
                    price = 31;
                    break;
                case "Dances":
                    price = 53;
                    break;
                case "Pilates":
                    price = 37;
                    break;
            }
        }

        if (age<20){
            price*=0.8;
        }

        if (budget > price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        }
        else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price-budget);
        }

    }
}
