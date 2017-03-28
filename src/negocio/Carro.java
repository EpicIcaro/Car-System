package negocio;

import persistencia.CadastroDeAbastecimentos;

public class Carro {

    private final String placa;
    private final String modelo;
    private final int ano;
    private final String fabricante;
    private final int capacidadeDoTanque;
    private double odometro;
    private final String tipoDeCombustivel;


    private final CadastroDeAbastecimentos historicoDeAbastecimentos;
    private RelatorioDeConsumo relatorioDeConsumo;


    public Carro(String placa, String modelo, int ano, String fabricante, int capacidadeDoTanque, double odometro, String tipoDeCombustivel) {
        this.placa = placa;
        this.modelo= modelo;
        this.ano = ano;
        this.fabricante = fabricante;
        this.capacidadeDoTanque = capacidadeDoTanque;
        this.odometro = odometro;
        this.tipoDeCombustivel = tipoDeCombustivel;

        historicoDeAbastecimentos = new CadastroDeAbastecimentos();
    }

    public String getPlaca() {
            return placa;
    }

    public String getModelo() {
            return modelo;
    }

    public int getAno() {
            return ano;
    }

    public String getFabricante() {
            return fabricante;
    }

    public int getCapacidadeDoTanque() {
            return capacidadeDoTanque;
    }

    public double getOdometro() {
            return odometro;
    }

    public void setOdometro(double valor) {
        odometro = valor;
    }

    public CadastroDeAbastecimentos getHistoricoDeAbastecimentos(){
        return historicoDeAbastecimentos;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

}
