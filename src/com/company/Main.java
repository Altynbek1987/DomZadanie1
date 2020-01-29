package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String салам = "Привет   ";// констант всегда пишется в большой буквой
        System.out.println("Это констант "+ салам);
        String secondName = "Мир";
        String ata = салам + secondName;// конкатинация
        System.out.println(ata);
//todo это инструмент для ввода в консоль

        Scanner input = new Scanner(System.in);
        String  name = input.nextLine(); //todo input это ссылка на инструмент а nextLine это вызов функии этого интсрумента
        System.out.println(салам+name);
        System.out.println("как дела?");
        String answer =input.nextLine();
        System.out.println("круто");
    }
}
