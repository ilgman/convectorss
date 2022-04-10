import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("""
                Введите нужный вам пункт
                1.Перевод из 10-тичной сс в 16-ричную
                2.Перевод из 10-тичной в 2-ичную сс
                3.Перевод из 2-ичной сс в 10 ричную сс
                """);
        String strOut = "";
        int chastno;
        int i =0;
        int punkt = in.nextInt();
        switch (punkt) {
            case (1):
                // перевод в 16-ричную сс
                System.out.println("Введите число в 10-ричной системе счисления");
                int sourceNum = in.nextInt();
                while (sourceNum > 16){
                    chastno=sourceNum /16;
                    strOut=strOut + conv(sourceNum - 16 * chastno);
                    sourceNum = chastno;
                    i++;
                }
                strOut=strOut+String.valueOf(conv(sourceNum));
                if (i== 0)
                {
                    System.out.println(conv(sourceNum));
                }else {
                    System.out.println(reverse(strOut));
                }
                break;
            // перевод в 2-ичнкю сс
            case (2):
                System.out.println("Введите число в 10-ричной системе счисления");
                sourceNum = in.nextInt();
                i =0;
                while (sourceNum > 1){
                    chastno = sourceNum /2;
                    strOut=strOut + String.valueOf(sourceNum-2*chastno);
                    sourceNum = chastno;
                };
                strOut= strOut+ String.valueOf(sourceNum);
                System.out.println(reverse(strOut));
                break;
            case (3):
                double numOut = 0;
                Scanner st = new Scanner(System.in);
                System.out.println("Введите число в 2-ичной системе счисления");
                String sourseStr = st.nextLine();
                for(i=sourseStr.length()-1 ; i >= 0 ;i--){
                    int s = sourseStr.charAt(i);
                    if(s == 49 || s == 48){
                        if (s == 49){
                            numOut = numOut + Math.pow(2, i);
                        }
                    }else {
                        System.out.println("Некоректный Ввод");
                        System.exit(1);
                    }

                }
                System.out.println(numOut);
                break;

            default:
                System.out.println("Некоректный пункт");

        }

    }

    //перевод цифр в вид букв и строк
    public static String conv(int a){
        String num;
        switch (a){
            case (10): num = "A";
                break;
            case (11): num = "B";
                break;
            case (12): num = "C";
                break;
            case (13): num = "D";
                break;
            case (14): num = "E";
                break;
            case (15) : num ="F";
                break;
            default: num = String.valueOf(a);
        }

        return num;
    }
    // развернуть строчку
    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }

}