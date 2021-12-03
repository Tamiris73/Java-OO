import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

class Elevador {
    private int numero_pessoas;
    private int andar_atual; 
    private int total_andar;
    private int capacidade;
    public Elevador(){
        System.out.printf("O elevador chegou !");
    }
    public void Inicializar( int _capacidade, int _total_andar ){
        this.capacidade = _capacidade;
        this.total_andar = _total_andar;
        this.numero_pessoas = 0;
        this.andar_atual = 0;
    }
    public void Entra(){
        if(capacidade == numero_pessoas){
            System.out.printf("Esta cheio !");
        }else{
          numero_pessoas++;
        }
    }
    public void Sai(){
        if(capacidade == 0){
            System.out.printf("Esta cheio !");
        }else{
          numero_pessoas--;
        }
    }
    public void Sobe(){
        if(andar_atual == total_andar){
            System.out.printf("Ultimo andar !");
        }else{
          andar_atual++;
        }
    }
    public void Desce(){
        if(andar_atual == 0){
            System.out.printf("Esta no terreo !");
        }else{
            andar_atual--;
        }
    }
    public int getAndar(){
        return  andar_atual;
    }
    public int getTotal(){
        return total_andar;
    }
    public int getCapacidade(){
        return capacidade;
    }
    public int getNumeroPessoas(){
        return numero_pessoas;
    }
}
