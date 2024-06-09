package List.operacaoBasica;

public class Tarefa {
    private String ListaTarefa;

    public Tarefa(String listaTarefa) {
        ListaTarefa = listaTarefa;
    }

    public String getListaTarefa() {
        return ListaTarefa;
    }

    @Override
    public String toString() {
        return  ListaTarefa;

    }
}
