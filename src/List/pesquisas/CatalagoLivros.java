package List.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro livro : livroList){
                if (livro.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(livro);
                }
            }

        }
        return livrosPorAutor;
    }
    public List<Livro>pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro li: livroList){
                if (li.getAnoPublicacao() >= anoInicial && li.getAnoPublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(li);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }
    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro lis: livroList){
                if(lis.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = lis;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros catalagoLivros = new CatalagoLivros();

        catalagoLivros.adicionarLivro("É Assim que Acaba",  " Colleen Hoover ", 2018);
        catalagoLivros.adicionarLivro("Algoritmos e Lógica da Programação",  "Marco A. Furlan de Souza",  2019);
        catalagoLivros.adicionarLivro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",  "Aditya Y. Bhargava",  2017);
        catalagoLivros.adicionarLivro("Desenvolvimento Real de Software: um Guia de Projetos Para Fundamentos em Java Capa comum",  "Raoul-Gabriel Urma ", 2021);
        catalagoLivros.adicionarLivro("Código Limpo: Habilidades Práticas do Agile Software ",  " Robert C. Martin ", 2009);

        System.out.println(catalagoLivros.pesquisarPorAutor("Marco A. Furlan de Souza"));
        System.out.println(catalagoLivros.pesquisarPorIntervaloAnos(2018, 2022));
        System.out.println(catalagoLivros.pesquisarPorTitulo("É Assim que Acaba"));
        System.out.println();
    }
}
