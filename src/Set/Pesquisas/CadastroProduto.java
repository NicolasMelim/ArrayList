package Set.Pesquisas;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(String nome, long codigo, double preco, int qtd) {
        produtoSet.add(new Produto(nome, codigo,preco, qtd));
    }
    public Set<Produto> exibirPordutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet); //usar o TreeSet para deixar organizado por nome no Comparable!!
        return produtosPorNome;
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cdp = new CadastroProduto();
        cdp.adicionarProduto("Coca", 567, 10, 2);
        cdp.adicionarProduto("Agua", 234, 4, 1);
        cdp.adicionarProduto("Sabao", 213, 2, 1);
        cdp.adicionarProduto("Arroz", 343, 5, 1);
        cdp.adicionarProduto("Coca", 567, 5, 1);

        System.out.println(cdp.produtoSet);
        System.out.println(cdp.exibirPordutosPorNome());
        System.out.println(cdp.exibirPorPreco());
    }

}
