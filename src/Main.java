public class Main {

    public static void processarPlayer(Reproduzivel item) {
        item.darPlay();
    }
        public static void main (String[]args){

            Filme filme = new Filme("Rambo", 120, "4K");
            Musica musica = new Musica("Camila", 4, "Nenhum de Nós");

            System.out.println("Título do filme: " + filme.getTitulo());
            System.out.println("Duração do filme: " + filme.getDuracaoEmMinutos() + " minutos");

            System.out.println("Título da música: " + musica.getTitulo());
            System.out.println("Duração da música: " + musica.getDuracaoEmMinutos() + " minutos");

            filme.setTitulo("Rambo II");
            filme.setDuracaoEmMinutos(130);

            musica.setTitulo("Astronauta de Mármore");
            musica.setDuracaoEmMinutos(5);

            System.out.println("\nApós alterar os dados:\n");

            filme.exibirDetalhes();
            System.out.println("Duração formatada: "
                    + ConversorDeTempo.formatarMinutos(filme.getDuracaoEmMinutos()));
            System.out.println("Custo do filme: R$ " + filme.calcularCusto());

            System.out.println();

            musica.exibirDetalhes();
            System.out.println("Duração formatada: "
                    + ConversorDeTempo.formatarMinutos(musica.getDuracaoEmMinutos()));
            System.out.println("Custo da música: R$ " + musica.calcularCusto());

            System.out.println();

            processarPlayer(filme);
            processarPlayer(musica);

            System.out.println();

            filme.realizarDownload();
        }
    }