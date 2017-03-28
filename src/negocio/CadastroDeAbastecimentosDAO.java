package negocio;

import java.util.ArrayList;
import java.util.Date;


public interface CadastroDeAbastecimentosDAO {
    
    public Boolean add(Abastecimento abastecimento);        
    public ArrayList<Abastecimento> pesquisaTipoDeCombustivel(String tipo);
    public ArrayList<Abastecimento> pesquisaDiaDoAbastecimento(Date data);
    public ArrayList<Abastecimento> pesquisaQuantidadeAbastecida(Double qnt);
}
