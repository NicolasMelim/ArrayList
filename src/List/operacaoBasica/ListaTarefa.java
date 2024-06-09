package List.operacaoBasica;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
       List<Tarefa> tarefasParaRemover = new ArrayList<>();
       for(Tarefa tarefa : tarefaList){
           if(tarefa.getListaTarefa().equalsIgnoreCase(descricao)){
               tarefasParaRemover.add(tarefa);
           }
       }
       tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotaldeTarefas(){
        return tarefaList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotaldeTarefas());

        //removendo tarefas

        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos é: " + listaTarefa.obterNumeroTotaldeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
