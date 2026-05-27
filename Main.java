import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        iniciarJarvis();

    }

    public static void iniciarJarvis() {

        int hora = LocalTime.now().getHour();

        String mensagem;

        if (hora >= 5 && hora < 12) {

            mensagem = "Bom dia chefe. Sistema iniciado.";

        } else if (hora >= 12 && hora < 18) {

            mensagem = "Boa tarde chefe. Todos os sistemas online.";

        } else {

            mensagem = "Boa noite chefe. Segurança ativada.";

        }

        System.out.println(mensagem);

        falar(mensagem);



    }

    public static void falar(String texto) {

        try {

            Runtime.getRuntime().exec(new String[]{
                "espeak",
                "-v",
                "pt-br+m3",
                "-s",
                "145",
                texto
            });

        } catch (Exception e) {

            System.out.println("Erro na voz");

        }

    }

    public static void abrirVSCode() {

        try {

            Runtime.getRuntime().exec("code");

        } catch (Exception e) {

            System.out.println("VS Code não encontrado");

        }

    }

    public static void abrirFirefox() {

        try {

            Runtime.getRuntime().exec("firefox");

        } catch (Exception e) {

            System.out.println("Firefox não encontrado");

        }

    }

}