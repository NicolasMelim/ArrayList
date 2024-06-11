package List.pesquisas;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numeroList) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MAX_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero >= maiorNumero) {

                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return maiorNumero;
    }

    public int encontrarMenorNumeor() {
        int menorNumero = Integer.MIN_VALUE;
        if (!numeroList.isEmpty()) {
            for (Integer numero : numeroList) {
                if (numero <= menorNumero) {

                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeroList.isEmpty()) {
            System.out.println(this.numeroList);
        } else {
            System.out.println("A lista está vazia!");
        }

    }

public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(15);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(25);

        somaNumeros.exibirNumeros();

        int soma =  somaNumeros.calcularSoma();
            System.out.println("A soma dos numeros é: " + soma);

        int numMario = somaNumeros.encontrarMaiorNumero();
            System.out.println("O maior numero é o: " + numMario);
         int menorNumero = somaNumeros.encontrarMenorNumeor();
          System.out.println("O menor número é: " + menorNumero);


}
}
