package List.operacaoBasica;
import java.util.ArrayList;
import java.util.List;
public class CarrinhoDeCompra {
    private List<Compras> comprasList;

    public CarrinhoDeCompra() {
        this.comprasList = new ArrayList<>();
    }
    public void adicionarItem(String nome, int quant, double preco){
        Compras compras = new Compras(nome, preco, quant);
        this.comprasList.add(compras);
    }
    public void removerItem(String descricao){
        List<Compras> itensParaRemover = new ArrayList<>();
        if (!comprasList.isEmpty()) {
            for (Compras i : comprasList) {
               if (i.getNome().equalsIgnoreCase(descricao)) {
                    itensParaRemover.add(i);
                }
            }
            comprasList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public double calcularValorTotal(){
        double valorTotal = 0d;
        if(!comprasList.isEmpty()){
            for (Compras com : comprasList){
                double valorItem = com.getPreco() * com.getQuant();
                valorTotal = valorTotal + valorItem;

            }
            return valorTotal;
        }else {
            throw new RuntimeException ("A lista está vazia");
        }
    }
    public void exibirItens(){
        if(!comprasList.isEmpty()){
            System.out.println(this.comprasList);

        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem("Camiseta: ", 3, 150d);
        carrinhoDeCompra.adicionarItem("Calça: ", 1, 100d);
        carrinhoDeCompra.adicionarItem("Meia", 1, 50d);

        carrinhoDeCompra.removerItem("Meia");
        carrinhoDeCompra.exibirItens();
        System.out.println("O valor ficou em:  " + carrinhoDeCompra.calcularValorTotal());

    }

}