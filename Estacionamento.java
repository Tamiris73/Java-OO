import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Estacionamento {
    private String modelo;
    private String placa;
    private int entrada;
    private int saida;
    
    public Estacionamento(String modelo, String placa, int entrada, int saida) {
        this.modelo = modelo;
        this.placa = placa;
        this.entrada = entrada;
        this.saida = saida;
    }
    public String getNome(){

        return modelo ;
    }
    public String getPlaca(){
  
        return placa;
    }
    public int getEntrada(){
        return entrada;
    }
    public int getSaida(){
        return saida;
    }
    public double CalculaPreco(){
        double preco;
        preco = saida - entrada;
        preco=preco*1.5;
        return preco;
    }
}

