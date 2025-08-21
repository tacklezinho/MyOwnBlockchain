package view;

import java.util.Scanner;

public class Menu {

    public static int menu_inicial(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu Inicial");
        System.out.println("1- Criar Bloco");
        System.out.println("2- Listar Blocos");

        return sc.nextInt();
    }


    public static String menu_criar_bloco(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o conteúdo do bloco: ");
        return sc.next();
    }
}
