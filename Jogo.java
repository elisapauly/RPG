<<<<<<< HEAD
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

=======
public class Personagem {
    public String nome;
    public String classe;
    public int nivel;
    public int vida;
    public int mana;
    public int forca;

    public Personagem(String nomePersonagem, String classePersonagem) {
        this.nome = nomePersonagem;
        this.classe = classePersonagem;
        this.nivel = 1;
        this.vida = 100;

        switch (classe.toLowerCase()) {
            case "mago":
                this.mana = 100;
                this.forca = 5;
                break;
            case "guerreiro":
                this.mana = 0;
                this.forca = 10;
                break;
            case "arqueiro":
                this.mana = 20;
                this.forca = 7;
                break;
            default:
                this.mana = 0;
                this.forca = 5;
                break;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nível: " + nivel);
        System.out.println("Vida: " + vida);
        System.out.println("Mana: " + mana);
        System.out.println("Força: " + forca);
    }

    public void atacar() {
        System.out.println(nome + " atacou com " + forca + " de força!");
    }

    public void receberDano() {
        vida -= 15;
        if (vida < 0) vida = 0;  // Evitar vida negativa
        System.out.println(nome + " agora tem " + vida + " de vida.");
    }

    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou uma habilidade especial!");
    }

    public void subirNivel() {
        nivel += 1;
        forca += 2;
        vida += 10;
        System.out.println(nome + " subiu para o nível " + nivel + "!");
    }

    public void desenharPersonagem(int personagem) {
        System.out.println("Desenhando personagem número: " + personagem);
        System.out.println(
            "  /^\\   \n" +
            " (⚡_⚡)  \n" +
            " /|_|\\  \n" +
            "  | |   \n" +
            " / | \\  \n" +
            "   |    \n" +
            "  /\\    \n" +
            " [##]   \n"
        );
    }
}
>>>>>>> 21f59b0 (update)
