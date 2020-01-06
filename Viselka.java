package com.company;
import com.sun.deploy.util.StringUtils;
import java.util.Scanner;

public class Main {
    public static void search(String word, String podskazka) {

            boolean trueorfalse;

            // Массив для показа пользователю
            System.out.println(podskazka);
            String[] exe = new String[]{"*", "*", "*", "*", "*", "*"};
            for (int j = 0; j < exe.length; j++) {
                System.out.print(exe[j]);
            }

            Scanner scan = new Scanner(System.in);
// Ввод пользователем буквы
            System.out.println("\n  Введите вашу букву: ");
            String x = scan.nextLine();

// Условие,в случае угадывания буквы

            if (word.contains(x)) {

                trueorfalse = true;
                // Массив для замены и показа его пользователю (создал новый так как была ошибка и я пока не разобрался в ней)
                String[] exe1 = new String[]{"*", "*", "*", "*", "*", "*"};
                int index = word.indexOf(x);
                System.out.println("\n Правильно,это буква под номером: " + (index + 1));
                // Замена элемента в массиве
                for (int h = 0; h < exe1.length; h++) {
                    exe1[index] = x;
                    System.out.print(exe1[h]);
                }
            }

            else {

                trueorfalse = false;

                System.out.println("Нет такой буквы" );
            }
    }
    public static void main (String [] args){
        search("колесо","не было у ацтеков");
    }

}
