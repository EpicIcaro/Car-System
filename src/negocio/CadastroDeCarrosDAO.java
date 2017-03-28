package negocio;

import java.util.ArrayList;

public interface CadastroDeCarrosDAO {
    
    public boolean add(Carro carro);
    public Carro pesquisaPlaca(String placa);
    public ArrayList<Carro> pesquisaModelo(String modelo);
    public ArrayList<Carro> pesquisaAno(int ano);
    public ArrayList<Carro> pesquisaFabricante(String fabricante);
    public ArrayList<Carro> pesquisaCobustivel(String tipo);  
    public ArrayList<Carro> getLista();
}
