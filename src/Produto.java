//public class NOME{} esqueleto de uma classe
public class Produto {
    // 1. atributo
    // public tipo nome
    //tamanhp, preco, cor, unidade, marca, nome
    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;



    //2. Metodo
    // mostra informacao do produto
    public void mostrarInformacoes(){
        System.out.println("nome: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("marca: " + marca);
        System.out.println("cor: " + cor);

    }


}
