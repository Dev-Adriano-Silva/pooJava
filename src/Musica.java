
// criando as classes e atributos ou caracteristicas

public class Musica {
    public String titulo;
    public String artista;
    public int duracaoEmSegundos;

//    metodos
    public Musica(String tituloExterno, String artistaExterno, int duracao) {
        titulo = tituloExterno;
        artista = artistaExterno;
        duracaoEmSegundos = duracao;
    }

    public void informacao(){
        System.out.println("tocando agora: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("duracao em segundos: " + duracaoEmSegundos);
    }
}




