package java_classless;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");

        String nome = scanner.next();

        System.out.println("Olá "+ nome);


    }
}