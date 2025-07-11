import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Personagem thor = new Personagem("Thor", "Guerreiro");

    System.out.println("\n STATUS INICIAL DE THOR ");
    thor.mostrarStatus();
    
    System.out.println("\n THOR ATACA COM SUA ESPADA! ");
    thor.atacar();

    System.out.println("\n THOR RECEBE 15 DE DANO");
    thor.receberDano();

    System.out.println("\n THOR USOU GOLPE PODEROSO! ");
    thor.usarHabilidadeEspecial();

    System.out.println("\n THOR SUBIU DE NIVEL! ");
    thor.subirNivel();

    System.out.println("\n STATUS FINAL DE THOR");
    thor.mostrarStatus();

    scanner.close();

    }
}

