public class Cliente {
    private String nome;
    private int quantidade;

    public Cliente() {
        this.nome = "Sem nome";
        this.quantidade = 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
