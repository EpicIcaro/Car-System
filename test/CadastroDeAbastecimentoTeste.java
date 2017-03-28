/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Date;
import negocio.Abastecimento;
import persistencia.CadastroDeAbastecimentos;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Ingrid
 */
public class CadastroDeAbastecimentoTeste {
    Abastecimento abast;
    CadastroDeAbastecimentos cadastroDeAbastecimentos;
    
    // Classe CadastroDeAbastecimentos esta retornando NULL em todos
    // Estes testes irão falhar
    
    @BeforeClass
    public void before(){
        abast = new Abastecimento("Gasolina", new Date(), 0, 0.1, 0, 0, true);
        cadastroDeAbastecimentos = new CadastroDeAbastecimentos();
    }
    
    @Test
    public void add(){        
        assertTrue(cadastroDeAbastecimentos.add(abast));
    }
    
    @Test
    public void pesquisaTipoDeCombustivel() {
        assertNotNull(cadastroDeAbastecimentos.pesquisaTipoDeCombustivel("Gasolina"));
    }
    
    @Test
    public void pesquisaDiaDoAbastecimento() {
        assertNotNull(cadastroDeAbastecimentos.pesquisaDiaDoAbastecimento(new Date()));
    }
    
    @Test
    public void pesquisaQuantidadeAbastecida() {
        assertNotNull(cadastroDeAbastecimentos.pesquisaQuantidadeAbastecida(0.1));
    }
    
    
}
