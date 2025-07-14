<<<<<<< HEAD
import java.util.Scanner;

public class Personagem {

    public String nome;
    public String classe;
    public int nivel = 1;
    public int vida = 100;
    public int mana; // so usa se for mago
    public int forca;
   

    public String Personagem(){
        nome = nomePersonagem;
        classe = classePersonagem;
        nivel = 1;
        vida = 100;
    }

    switch (classe()){
        case "mago":
            mana = 100;
            forca = 5;
            break;
        case "guerreiro":
            forca = 10;
            break;
        case "arqueiro":
            forca = 7;
            break;
        default:
            forca = 5:
            break;
    }

        public void desenharPersonagem(int personagem) {
        System.out.println("                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                      +++*#*                                            \r\n" + //
                        "                                                                                                                   -*+**#%=                                             \r\n" + //
                        "                                                                            :@@@@%.                              #++**%@.                                               \r\n" + //
                        "                                                                        :#*=  :*@#*%@+                        :*+**%%=                                                  \r\n" + //
                        "                                                                      -#=-  .-=+*@%+**@:                    +#%%%%#                                                     \r\n" + //
                        "                                                                      :#=. .--==*@@%+*@*                .#%**%#%+                                                       \r\n" + //
                        "                                                                      -#=. .--==*@@%+*@*           .%@*%%+**@#                                                          \r\n" + //
                        "                                                                      -%#@@%%@%%@%#@@#@*      -*%#*#@@*+*##-                                                            \r\n" + //
                        "                                                                      :#-=#*=--=+=+++*@# :%@###%*. *++*#*                                                               \r\n" + //
                        "                                                                      -@#==@*-++=#@+#@@@##@+    #*+*%#=                                                                 \r\n" + //
                        "                                                            :#+=--==+++%%@%-:+%%#--#@@@@%#%%*#*+*#%@.                                                                   \r\n" + //
                        "                                                          ==: .:--=##*#@#**%#*+**%@**%##@#%#*+*#%%#**#                                                                  \r\n" + //
                        "                                                         *+%@+==+@=**@#@%%@**#+::=%***%*##+**%@%*+**#%=                                                                 \r\n" + //
                        "                                                          @@=::::-@**@%@###@@%%**%#%%%%++*@%@#**@@#*                                                                    \r\n" + //
                        "                                                        %#%@%%@*--=@@%%#****+*#@#@##*+*#%@%#%%*-:*@*%:                                                                  \r\n" + //
                        "                                                     :%#%#***###%%@@@@@@#*++**#%@#++*%%@##@@+:::-=#*:=%+                                                                \r\n" + //
                        "                                                    +@+::-%##*%@@@@@@@##@@@%#*-::*%%@@#****@@%%%%#*+*%=**                                                               \r\n" + //
                        "                                                   -%=:====*@@@=.@@@%**++*#--=+#-:::-%@@%#%*=+@=--*++*@=+.                                                              \r\n" + //
                        "                                                  :=:-+%%%*%%    +@@@@%@@@*=+*=:-:::::::::::::-%###@##%*#.                                                              \r\n" + //
                        "                                                  .+-:::#+:=+.   -%@@@@%++%@@#+==+#+**=-:-+**%@%*##%%%%*:                                                               \r\n" + //
                        "                                                   :%=::::::-@   -#@%#**#%@@%#**#%@***@*****                                                                            \r\n" + //
                        "                                                     ##=:::**#*=+%##%%%%@@%%*****%@***@***#%##:                                                                         \r\n" + //
                        "                                                     :%=-::::::-=#*%%@%###%@@@@@@@@*#%#*******@                                                                         \r\n" + //
                        "                                                        *:-:::+*-::++%@%#**##@#***%%%#**###%%%@                                                                         \r\n" + //
                        "                                                         *+*=#=*++#@%*****###%#**+#@**##%%#*****                                                                        \r\n" + //
                        "                                                       .#*@%++#@%#**+*#%@@@@@#****+*@@*#+*%%####@:                                                                      \r\n" + //
                        "                                                    .+++*%##@@###**%%%%%#%%@@#######%@@@#+#++*##@=                                                                      \r\n" + //
                        "                                                  -*+*#%+ -%##@%-:+****%##@@@####%@@@@@@@@@@@*%***#                                                                     \r\n" + //
                        "                                               .*++*%*     %%*:.-**####%@@@@@@@@@@@@@@@@@@@@@@@@#*#                                                                     \r\n" + //
                        "                                             -++*#%=      -#*--*#%#*##%@@@@@@@@@@@@@@@@@@@@@@@%%%%%%                                                                    \r\n" + //
                        "                                            *%*%%.        :%#:-+***##@@@@@@@@@@@@@@@@@@@@%*********#-                                                                   \r\n" + //
                        "                                                          -*. *##%@@@#*****%@@@@@@@@@@@#*********%@@@.                                                                  \r\n" + //
                        "                                                          -#%#+**##@#*******#@@@@@@@@@******#@#******#.                                                                 \r\n" + //
                        "                                                          :+:-**#@@@%####***#@@@@@@@@@@**#@@#*********=                                                                 \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        \r\n" + //
                        "                                                                                                                                                                        ");
    }
}











    public int Ataque(){
        return ataque;
    }

    public int dano(){
        return dano;
    }

    public int forca(){
        return forca;
    }

    public int nivel(){
        return nivel;
    }

    public void status(){
        return nome + ataque + dano + nivel + 
    }



   



   
}
=======
public class Personagem {
    public String nome;
    public String classe;
    public int nivel;
    public int vida;
    public int mana; // só usa se for mago
    public int forca;

    // Construtor
    public Personagem(String nomePersonagem, String classePersonagem) {
        this.nome = nomePersonagem;
        this.classe = classePersonagem;
        this.nivel = 1;
        this.vida = 100;

        switch (this.classe.toLowerCase()) {
            case "mago":
                this.mana = 100;
                this.forca = 5;
                break;
            case "guerreiro":
                this.forca = 10;
                this.mana = 0;
                break;
            case "arqueiro":
                this.forca = 7;
                this.mana = 20;
                break;
            default:
                this.forca = 5;
                this.mana = 0;
                break;
        }
    }

    public void mostrarStatus() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Classe: " + this.classe);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida);
        System.out.println("Mana: " + this.mana);
        System.out.println("Força: " + this.forca);
    }

    public void atacar() {
        System.out.println(this.nome + " atacou com " + this.forca + " de força!");
    }

    public void receberDano() {
        this.vida -= 15;
        if (this.vida < 0) this.vida = 0;
        System.out.println(this.nome + " agora tem " + this.vida + " de vida.");
    }

    public void usarHabilidadeEspecial() {
        System.out.println(this.nome + " usou uma habilidade especial!");
    }

    public void subirNivel() {
        this.nivel += 1;
        this.forca += 2;
        this.vida += 10;
        System.out.println(this.nome + " subiu para o nível " + this.nivel + "!");
    }
}
>>>>>>> 21f59b0 (update)
