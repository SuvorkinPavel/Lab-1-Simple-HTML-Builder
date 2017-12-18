package HTML_BUILDER;


import java.util.Scanner;

public class ExtraClass {



    public  void Entroduction(){
        String str =("\n\n\t\tПриветствую! это программа генерирует html код.\n\tНачинаем... ");
        System.out.println(str);
    }


    public int AskUser() {
        System.out.print("Сколько блоков section вам необходимо?\n");
        Scanner in = new Scanner(System.in);
        return (in.nextInt());
    }

    public int[] Frame(int i) {
        //i количество создаваемых секций
        Scanner in = new Scanner(System.in);
        System.out.print("Какие (по номерам) секции должны содержать рамки?\n\tВведите номера секций (начало с 1).\n\tЕсли вы закончили- введите '0'\n");
        int[] n = new int[i];
        for (int j = 0; j < i; j++) {
            n[j] = 0;
        }
        int k;
        k = in.nextInt();
        while(k !=0) {

            if (k > i || k < 0) {
                System.out.println("ERROR: неверно введён индекс, попробуйте ещё раз:\n");
                k = in.nextInt();
            }
            n[k - 1] = 1;
            k = in.nextInt();
        }

        return n;
    }
}
