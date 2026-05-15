public abstract class Midia {
    protected String titulo;
    protected int duracaoEmMinutos;

    public Midia(String titulo, int duracaoEmMinutos) {
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;

    }

    public void exibirDetalhes() {
        System.out.println("titulo" + titulo);
        System.out.println("Duração" + duracaoEmMinutos + "minutos");
    }

    public abstract double calcularCusto();

}

