public class ConversorDeTempo {

    public static String formatarMinutos(int minutos) {

        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;

        return String.format("%dh %02dmin", horas, minutosRestantes);
    }
}