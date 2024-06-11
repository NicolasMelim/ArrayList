package Set.Operacao;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
       ConjuntoConvidados cjc = new ConjuntoConvidados();
       cjc.adicionarConvidado("Nicolas", 234);
       cjc.adicionarConvidado("Alan", 235);
       cjc.adicionarConvidado("Alan", 235);
       cjc.adicionarConvidado("Gabrielle", 236);
       cjc.adicionarConvidado("Guilherme", 237);
        cjc.removerConvidadoPorCodigoConvite(235);
        System.out.println("Existem ");
        cjc.exibirConvidados();
       System.out.println("Existem " + cjc.contarConvidados() + " convidados na lista");
    }
}
