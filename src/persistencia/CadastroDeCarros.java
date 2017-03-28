package persistencia;

import java.util.ArrayList;
import negocio.CadastroDeCarrosDAO;
import negocio.Carro;

public class CadastroDeCarros implements CadastroDeCarrosDAO {

    private final ArrayList<Carro> listaDeCarros;   
    private CadastroDeCarrosDAO cadastroDeCarrosDAO;

    public CadastroDeCarros() {
        listaDeCarros = new ArrayList<Carro>();        
    }

    
    @Override
    public boolean add(Carro carro){
        return listaDeCarros.add(carro);
    }


    @Override
    public Carro pesquisaPlaca(String placa) {
        for(Carro i: listaDeCarros){
            if(i.getPlaca().equals(placa)){
                return i;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Carro> pesquisaModelo(String modelo) {
        ArrayList<Carro> resultadoDaPesquisa = new ArrayList<>();

        for(Carro i: listaDeCarros){
            if(i.getModelo().toLowerCase().equals(modelo.toLowerCase())){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }

    @Override
    public ArrayList<Carro> pesquisaAno(int ano) {
        ArrayList<Carro> resultadoDaPesquisa = new ArrayList<>();

        for(Carro i: listaDeCarros){
            if(i.getAno() == ano){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }


    @Override
    public ArrayList<Carro> pesquisaFabricante(String fabricante) {
        ArrayList<Carro> resultadoDaPesquisa = new ArrayList<>();

        for(Carro i: listaDeCarros){
            if(i.getFabricante().toLowerCase().equals(fabricante.toLowerCase())){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }

    @Override
    public ArrayList<Carro> pesquisaCobustivel(String tipo) {
        ArrayList<Carro> resultadoDaPesquisa = new ArrayList<>();

        for(Carro i: listaDeCarros){
            if(i.getTipoDeCombustivel().toLowerCase().equals(tipo.toLowerCase())){
                resultadoDaPesquisa.add(i);
            }
        }
        return resultadoDaPesquisa;
    }

    public ArrayList<Carro> getLista() {
            return listaDeCarros;
    }

}
