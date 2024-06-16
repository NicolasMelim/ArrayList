package Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContato {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContato() {
        this.agendaContatoMap = new HashMap<>();
    }
    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }
    public void exibirContato(){
        System.out.print(agendaContatoMap);

        }
        public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
            numeroPorNome =  agendaContatoMap.get(nome);
        }
        return numeroPorNome;
        }

    public static void main(String[] args) {
        AgendaContato agc = new AgendaContato();
        agc.adicionarContato("Nicolas", 119395261);
        agc.adicionarContato("Gabrielle", 119543453);
        agc.adicionarContato("Freire", 119445354);
        agc.adicionarContato("Melim", 119432455);
        agc.exibirContato();

       System.out.println("O numero é. " + agc.pesquisarPorNome("Melim"));
    }
    }


