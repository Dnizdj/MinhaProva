import java.util.Scanner;

public class Main {
    private static int[] votos;
    private static String[] participantes;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        participantes = new String[]{"Alane Dias", "Beatriz Reis", "Davi Brito", "Deniziane Ferreira", "Fernanda Bande",
                "Giovanna Lima", "Giovanna Pitel", "Isabelle Nogueira", "Juninho", "Leidy Elin", "Lucas Henrique",
                "Lucas Luigi", "Lucas Pizane", "Marcus Vinicius", "Matteus Amaral", "Maycon Cosmer", "MC Bin Laden",
                "Michel Nogueira", "Nizam", "Raquele Cardozo", "Rodriguinho", "Thalyta Alves", "Vanessa Lopes",
                "Vinicius Rodrigues", "Wanessa Camargo", "Yasmin Brunet"};

        votos = new int[participantes.length];

        int getVotos;

        do {
            System.out.println("Em quem você vota para sair da casa?");
            for (int voto = 0; voto < participantes.length; voto++) {
                System.out.println((voto + 1) + ") " + participantes[voto]);
            }
            System.out.println("0) Sair");

            System.out.print("Escolha um jogador:");
            getVotos = scanner.nextInt();

            switch (getVotos) {
                case 0:
                    break;
                default:
                    if (getVotos >= 1 && getVotos <= participantes.length) {
                        incrementaUmVoto(getVotos - 1);
                    } else {
                        System.out.println("Opção inválida. Tente novamente.");
                    }
            }
        } while (getVotos != 0);

        for (int voto = 0; voto < participantes.length; voto++) {
            System.out.println(participantes[voto] + ": " + votos[voto] + " votos");
        }

        scanner.close();
    }

    public static void incrementaUmVoto(int index) {
        votos[index]++;
        System.out.println("Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                "domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                "conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                "vou conseguir te eliminar com alegria. Com " + votos[index] + " votos, é você quem sai: " + participantes[index]);
    }

    }

