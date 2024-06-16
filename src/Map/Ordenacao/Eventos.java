package Map.Ordenacao;

public class Eventos {
    private String nome;
    private  String atracao;

    public Eventos(String nome, String atracao) {
        this.nome = nome;
        this.atracao = atracao;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return atracao;
    }

    @Override
    public String toString() {
        return "Eventos{" +
                "nome='" + nome + '\'' +
                ", data='" + atracao+ '\'' +
                '}';
    }
}
