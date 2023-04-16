package Calulator;
import java.util.Objects;
import java.util.Scanner;
public class calsv2 {
    public static String Calc(String[] str) throws myException {
        String resultRR = "";
        int result = 0, ri1 = 0, ri2 = 0;
        boolean arabNumb = false, sign = false;
        String[] parts = str[0].split(" ");
        if(parts.length !=3) throw new myException("Некорректный ввод");
        String[] rims = {"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String[] rims2 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        double[] arabs = {100, 90, 50, 40, 10, 9, 5, 4, 1};

        try {
            Integer.parseInt(parts[0]);
        } catch (Exception e) {
            arabNumb = true;
        }

            if (arabNumb) {

                int r = 0;

                for (int i = 0; i <= 2; i += 2) {

                    for (int j = 0; j < 10; j++) {
                        if (Objects.equals(parts[i], rims2[j])) {
                            r = j + 1;
                        }
                    }

                    if (i == 0) {
                        ri1 = r;
                    } else {
                        ri2 = r;

                        if (ri1 < 1 || ri1 > 10 || ri2 < 1 || ri2 > 10) throw new myException("Некорректный ввод");
                    }
                }

                switch (parts[1]) {
                    case "+":
                        result = (ri1 + ri2);
                        sign = true;
                        break;
                    case "-":
                        result = (ri1 - ri2);
                        sign = true;
                        break;
                    case "*":
                        result = (ri1 * ri2);
                        sign = true;
                        break;
                    case "/":
                        result = (ri1 / ri2);
                        sign = true;
                        break;

                }

                if (result <= 0) throw new myException("Ответ должен быть положительным");

                if (!sign) throw new myException("Некорректный ввод");

                for (int i = 0; i <= 8; i++)
                    while (result >= arabs[i]) {
                        result -= arabs[i];
                        resultRR += rims[i];
                    }

            } else {

                int i1 = Integer.parseInt(parts[0]);
                int i2 = Integer.parseInt(parts[2]);

                if (i1 < 1 || i1 > 10 || i2 < 1 || i2 > 10) throw new myException("Некорректный ввод");

                switch (parts[1]) {
                    case "+":
                        result = i1 + i2;
                        sign = true;
                        break;
                    case "-":
                        result = i1 - i2;
                        sign = true;
                        break;
                    case "*":
                        result = i1 * i2;
                        sign = true;
                        break;
                    case "/":
                        result = i1 / i2;
                        sign = true;
                        break;
                }

                if (!sign) throw new myException("Некорректный ввод");

                resultRR = String.valueOf(result);


                resultRR = String.valueOf(result);

            }
            return resultRR;
        }

        public static void main (String[]str )throws myException {
            Scanner scan = new Scanner(System.in);
            String in, out;
            System.out.print("Input string: ");
            in = scan.nextLine();
            out = Calc(new String[]{in});
            System.out.print("Output string: " + out);
        }
    }