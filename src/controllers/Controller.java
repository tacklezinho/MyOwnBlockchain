package controllers;


import models.Bloco;
import view.Menu;

public class Controller {

    public void startApplication() {
        System.out.println("Aplicaçao Inciada");
        menu_incial();
    }

    private void menu_incial() {


        int escolhaUser = Menu.menu_inicial();
        switch (escolhaUser) {
            case 1:
                criar_bloco();
                break;
            case 2:
                listar_bloco();
                break;
            default:
                System.out.println("Opção Inválida");
        }
        menu_incial();

    }

    private void criar_bloco() {
    }

    public void listar_bloco() {
    }

}
