package persistencia;

import java.util.ArrayList;
import java.util.Date;
import negocio.Abastecimento;
import negocio.CadastroDeAbastecimentosDAO;

public class CadastroDeAbastecimentos implements CadastroDeAbastecimentosDAO{
    private ArrayList<Abastecimento> listaDeAbastecimentos;    
    
    public CadastroDeAbastecimentos() {
        listaDeAbastecimentos = new ArrayList<Abastecimento>();
    }
	       

    @Override
    public Boolean add(Abastecimento abastecimento) {
        return listaDeAbastecimentos.add(abastecimento);
    }

    @Override
    public ArrayList<Abastecimento> pesquisaTipoDeCombustivel(String tipo) {
        ArrayList<Abastecimento> resultadoDaPesquisa = new ArrayList<>();

        for(Abastecimento i: listaDeAbastecimentos){
            if(i.getTipoDeCombustivel().toLowerCase().equals(tipo.toLowerCase()) ){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }

    @Override
    public ArrayList<Abastecimento> pesquisaDiaDoAbastecimento(Date data) {
        ArrayList<Abastecimento> resultadoDaPesquisa = new ArrayList<>();

        for(Abastecimento i: listaDeAbastecimentos){
            if(i.getDiaDoAbastecimento().equals(data)){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }

    @Override
    public ArrayList<Abastecimento> pesquisaQuantidadeAbastecida(Double qnt) {
        ArrayList<Abastecimento> resultadoDaPesquisa = new ArrayList<>();

        for(Abastecimento i: listaDeAbastecimentos){
            if(i.getQuantidadeAbastecida() == qnt){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }
        
        
       

}
