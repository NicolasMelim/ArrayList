package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome,numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> contatoPorNome(String nome){
        Set<Contato> contatoPorNome = new  HashSet<>();
        for(Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato: contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agc = new AgendaContatos();

        agc.adicionarContato("Nicolas", 11939591);
        agc.adicionarContato("Nicolas Melim", 1198593);
        agc.adicionarContato("Nicolas", 1223);
        agc.adicionarContato("Nicolas Melim da Silva", 119849283);

       System.out.print(agc.contatoPorNome("Nicolas"));
       System.out.println("Atualizando o contato: " + agc.atualizarNumeroContato("Nicolas Melim", 118756));

        agc.exibirContato();
    }
}
