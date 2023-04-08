import java.util.Scanner;
public class CALCITOG {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String example;
        String resultRR = "";
        Double result = null;
        int ri1 = 0;
        int ri2 = 0;
        String plus = "+";
        String minus = "-";
        String div = "/";
        String multiply = "*";
        System.out.println("¬ведите выражение");
        example = scan.nextLine();
        String[] parts = example.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        boolean romeNumb = false;

        String[] rims = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        double[] arabs = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        try {
            Integer.parseInt(part1);
        } catch (Exception e) {
            romeNumb = true;
        }

        if (romeNumb == true) {

            switch (part1) {

                case "I":
                    ri1 = 1;
                    break;

                case "II":
                    ri1 = 2;
                    break;

                case "III":
                    ri1 = 3;
                    break;

                case "IV":
                    ri1 = 4;
                    break;

                case "V":
                    ri1 = 5;
                    break;

                case "VI":
                    ri1 = 6;
                    break;

                case "VII":
                    ri1 = 7;
                    break;

                case "VIII":
                    ri1 = 8;
                    break;

                case "IX":
                    ri1 = 9;
                    break;

                case "X":
                    ri1 = 10;
                    break;
            }

            switch (part3) {

                case "I":
                    ri2 = 1;
                    break;

                case "II":
                    ri2 = 2;
                    break;

                case "III":
                    ri2 = 3;
                    break;

                case "IV":
                    ri2 = 4;
                    break;

                case "V":
                    ri2 = 5;
                    break;

                case "VI":
                    ri2 = 6;
                    break;

                case "VII":
                    ri2 = 7;
                    break;

                case "VIII":
                    ri2 = 8;
                    break;

                case "IX":
                    ri2 = 9;
                    break;

                case "X":
                    ri2 = 10;
                    break;
            }

            switch (part2) {

                case "+":
                    result = Double.valueOf(ri1 + ri2);
                    break;
                case "-":
                    result = Double.valueOf(ri1 - ri2);
                    break;
                case "*":
                    result = Double.valueOf(ri1 * ri2);
                    break;
                case "/":
                    result = Double.valueOf(ri1 / ri2);
                    break;
            }

            for (int i = 0; i <= 8; i++) {
                while (true) {
                    if (result >= arabs[i]) {
                        result -= arabs[i];
                        resultRR += rims[i];

                    } else {
                        break;
                    }
                }
            }

            System.out.println(resultRR);

        } else {

            Double i1 = Double.valueOf(part1);
            Double i2 = Double.valueOf(part3);

            switch (part2) {

                case "+":
                    result = i1 + i2;
                    break;
                case "-":
                    result = i1 - i2;
                    break;
                case "*":
                    result = i1 * i2;
                    break;
                case "/":
                    result = i1 / i2;
                    break;
            }
            System.out.println(result);

        }
    }
}




