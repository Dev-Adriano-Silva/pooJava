//public class NOME{} esqueleto de uma classe
public class Produto {
    // 1. atributo
    // public tipo nome
    //tamanhp, preco, cor, unidade, marca, nome
    private String nome;
    private double tamanho;
    private double preco;
    private String cor;
    private int unidade;
    private String marca;

    //getters setters
    // get - pegar

    //public String getNome(){
    // return nome;
    // }

    //set - definir, mudar

    //public void setNome(String nome){
    // this.nome = nome;
    // }

    //2. Metodo
    // mostra informacao do produto
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("marca: " + marca);
        System.out.println("cor: " + cor);

    }


}
