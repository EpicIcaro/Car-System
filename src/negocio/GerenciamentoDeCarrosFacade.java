package negocio;

import java.util.ArrayList;
import persistencia.CadastroDeAbastecimentos;
import java.util.Date;
import persistencia.CadastroDeCarros;

public class GerenciamentoDeCarrosFacade {

    private CadastroDeCarrosDAO cadastroDeCarros = null;
    private CadastroDeAbastecimentosDAO cadastroDeAbastecimentos= null;

    public GerenciamentoDeCarrosFacade() {
        cadastroDeAbastecimentos = new CadastroDeAbastecimentos();
        cadastroDeCarros = new CadastroDeCarros();
        
        cadastroDeCarros.add(new Carro("ihi9074","monza",1990,"gm",40,300000,"Gasolina"));
        cadastroDeCarros.add(new Carro("ihg8970","corsa",2003,"gm",40,120000,"Gasolina"));
        cadastroDeCarros.add(new Carro("eji5960","idea",2010,"fiat",35,50000,"Flex"));
        
        cadastroDeCarros.pesquisaPlaca("ihi9074").getHistoricoDeAbastecimentos().add(new Abastecimento("Gasolina", new Date(26, 05, 1993, 15, 27), 300000, 35, 40, 3.60, true));
        cadastroDeCarros.pesquisaPlaca("ihg8970").getHistoricoDeAbastecimentos().add(new Abastecimento("Gasolina", new Date(26, 11, 1993, 15, 27), 120010, 37, 52, 3.69, true));
    }

    
    public ArrayList<Carro> getLista(){
        return cadastroDeCarros.getLista();
    }
    
    
    public boolean add(Carro carro) {
       return cadastroDeCarros.add(carro);
    }

    public Carro pesquisaPlaca(String placa) {
       return cadastroDeCarros.pesquisaPlaca(placa);
    }

    public ArrayList<Carro> pesquisaModelo(String modelo) {
       return cadastroDeCarros.pesquisaModelo(modelo);
    }

    public ArrayList<Carro> pesquisaAno(int ano) {
            return cadastroDeCarros.pesquisaAno(ano);
    }

    public ArrayList<Carro> pesquisaFabricante(String fabricante) {
            return cadastroDeCarros.pesquisaFabricante(fabricante);
    }

    public ArrayList<Carro> pesquisaCobustivel(String tipo) {
            return cadastroDeCarros.pesquisaCobustivel(tipo);
    }

    public Boolean add(Abastecimento abastecimento) {
            return cadastroDeAbastecimentos.add(abastecimento);
    }

    public ArrayList<Abastecimento> pesquisaTipoDeCombustivel(String tipo) {
            return cadastroDeAbastecimentos.pesquisaTipoDeCombustivel(tipo);
    }

    public ArrayList<Abastecimento> pesquisaDiaDoAbastecimento(Date data) {
            return cadastroDeAbastecimentos.pesquisaDiaDoAbastecimento(data);
    }

    public ArrayList<Abastecimento> pesquisaQuantidadeAbastecida(Double qnt) {
            return cadastroDeAbastecimentos.pesquisaQuantidadeAbastecida(qnt);
    }

}
