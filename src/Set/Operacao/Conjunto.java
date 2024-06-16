package Set.Operacao;

import java.util.Objects;

public class Conjunto {
    private String palavra;

    public Conjunto(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    @Override
    public String toString() {
        return "Conjunto{" +
                "palavra='" + palavra + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conjunto conjunto = (Conjunto) o;
        return Objects.equals(palavra, conjunto.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(palavra);
    }
}
