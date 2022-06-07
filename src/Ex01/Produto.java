package Ex01;

public class Produto {

    public String nome;
    public static double preco;
    public static int tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static int getTipo() {
        return tipo;
    }

    public static void setTipo(int tipo) {
        Produto.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}
