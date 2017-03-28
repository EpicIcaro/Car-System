/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import persistencia.CadastroDeCarros;
import negocio.Carro;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Ingrid
 */
public class CadstroDeCarroTeste {
    
    @Test
    public void adicionarCarros(){
        CadastroDeCarros cad = new CadastroDeCarros();
        assertTrue(cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina")));
    }
    
    @Test
    public void pesquisaPlaca(){
        CadastroDeCarros cad = new CadastroDeCarros();
        cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina"));        
        Carro carro = cad.pesquisaPlaca("IGC-2312");        
        assertNotNull(carro);
    }
    
    @Test
    public void pesquisaModelo(){
        CadastroDeCarros cad = new CadastroDeCarros();
        cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina"));        
        List<Carro> carros = cad.pesquisaModelo("Hatch");        
        assertNotNull(carros);
    }
    
    @Test
    public void pesquisaAno(){
        CadastroDeCarros cad = new CadastroDeCarros();
        cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina"));        
        List<Carro> carros = cad.pesquisaAno(0);        
        assertNotNull(carros);
    }
    
    @Test
    public void pesquisaFabricante(){
        CadastroDeCarros cad = new CadastroDeCarros();
        cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina"));        
        List<Carro> carros = cad.pesquisaFabricante("Chevrolet");        
        assertNotNull(carros);
    }
    
    @Test
    public void pesquisaCobustivel(){
        CadastroDeCarros cad = new CadastroDeCarros();
        cad.add(new Carro("IGC-2312", "Hatch", 0, "Chevrolet", 0, 0, "Gasolina"));        
        List<Carro> carros = cad.pesquisaCobustivel("Gasolina");        
        assertNotNull(carros);
    }
    
    
}
