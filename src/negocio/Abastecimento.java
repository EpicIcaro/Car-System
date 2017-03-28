package negocio;

import persistencia.CadastroDeAbastecimentos;
import java.util.Date;

public class Abastecimento {
    
    private final Date    diaDoAbastecimento;
    private final double  valorDoOdometroNaHoraDoAbs;
    private final double  quantidadeAbastecida;
    private final double  custoTotal;
    private final double  precoPorLitro;
    private final boolean inicioDeSerie;
    private CadastroDeAbastecimentos cadastroDeAbastecimentos;    
    private final String  tipoDeCombustivel;

   
    public Abastecimento(String tipoDeCombustivel, Date diaDoAbastecimento, double valorDoOdometroNaHoraDoAbs, double quantidadeAbastecida, double custoTotal, double precoPorLitro, boolean inicioDeSerie) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.diaDoAbastecimento = diaDoAbastecimento;
        this.valorDoOdometroNaHoraDoAbs = valorDoOdometroNaHoraDoAbs;
        this.quantidadeAbastecida = quantidadeAbastecida;
        this.custoTotal = custoTotal;
        this.precoPorLitro = precoPorLitro;
        this.inicioDeSerie = inicioDeSerie;
    }

	
     public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public Date getDiaDoAbastecimento() {
        return diaDoAbastecimento;
    }

    public double getValorDoOdometroNaHoraDoAbs() {
        return valorDoOdometroNaHoraDoAbs;
    }

    public double getQuantidadeAbastecida() {
        return quantidadeAbastecida;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public double getPrecoPorLitro() {
        return precoPorLitro;
    }

    public boolean isInicioDeSerie() {
        return inicioDeSerie;
    }	
}
