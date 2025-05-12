import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cinema {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            List<Filme> filmes = new ArrayList<>();
            filmes.add(new Filme("Psicose (Suspense)", 14, "Uma mulher foge após roubar dinheiro e se hospeda em um hotel isolado. Lá, conhece Norman Bates, o misterioso dono do estabelecimento. Aos poucos, ela percebe que há algo estranho na relação dele com a mãe. O que parecia uma estadia tranquila se transforma em um pesadelo aterrorizante."));
            filmes.add(new Filme("It: A coisa (Terror)", 16, "Um grupo de crianças se une para investigar o misterioso desaparecimento de vários jovens em sua cidade. Eles descobrem que o culpado é Pennywise, um palhaço cruel que se alimenta de seus medos e cuja violência teve origem há vários séculos."));
            filmes.add(new Filme("365 days", 18, "Laura é uma diretora de vendas que embarca em uma viagem à Sicília para salvar seu relacionamento. Lá, ela conhece Massimo, um membro da máfia siciliana, que a sequestra e lhe dá 365 dias para se apaixonar por ele."));
            filmes.add(new Filme("A Rede Social", 14, "Em 2003, Mark Zuckerberg, estudante de Harvard, inicia um projeto que evolui para o Facebook. Seis anos depois, com milhões de usuários, ele se torna o mais jovem bilionário da história. No entanto, seu sucesso vem acompanhado de desafios legais e pessoais."));

            System.out.println("\nFilmes disponíveis para você " + nome + ":");
             for(int i = 0; i < filmes.size(); i++){
                System.out.println((i + 1) + ". " + filmes.get(i).titulo);
             }

             System.out.println("\nEscolha um filme digitando o número correspondente: ");
             int escolhaFilme = scanner.nextInt();
        
            if (escolhaFilme >= 1 && escolhaFilme <= filmes.size()){
                Filme filmeSelecionado = filmes.get(escolhaFilme - 1);
                if (idade >= filmeSelecionado.classificacao || idade >= 18) {
                    double precoFinal = idade >18 ? 25.0 : 15.0;
                    System.out.println("\nVocê escolheu: " + filmeSelecionado.titulo);
                    System.out.println("\nSinopse: " + filmeSelecionado.sinopse);
                    System.out.println("\nO preço do seu ingresso é de R$" + precoFinal);
                } else {
                    System.out.println("\nDesculpe, " + nome + ", você não tem idade suficiente para assistir a esse filme.");
                }
            } else {
                System.out.println("\nOpção inválida. Tente novamente!");
            }

             scanner.close(); 
    }
}
