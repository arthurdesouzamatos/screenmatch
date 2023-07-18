import br.com.alura.screematch.modelos.Filme.Filme;
import br.com.alura.screematch.modelos.Filme.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Old Enry");
        meuFilme.setAnoDeLancamento(2023);
        meuFilme.setDuracaoEmMinutos(100);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(6);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2004);
        lost.exibeFichaTecnica();
        lost.setTemporada(5);
        lost.setEpisodiosPorTemporada(15);
    }
}
