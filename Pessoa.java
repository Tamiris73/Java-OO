import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pessoa
{
  private String nome;
  private int anoNascimento;
  private double altura;
  private String info;
  
  public void nome (String nome){		
    this.nome = nome;	
  }
  public String getNome (){			
    return this.nome;
  }

  public void setAnoNascimento (int anoNascimento){		
    this.anoNascimento = anoNascimento;
  }
  public int anoNascimento (){			
    return this.anoNascimento;
  }
  
  public void setAltura (double altura){		
    this.altura = altura;	
  }
  public double getAltura (){			
    return this.altura;
  }
  
  public void ImprimirDados(){
    System.out.printf("Nome: ",nome);
    System.out.printf("Data de Nascimento: ",anoNascimento);
    System.out.printf("Altura: ",altura);
  }

  public double idade (double anoNascimento, double anoAtual) {
	return anoAtual - anoNascimento;
  }
}

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

class Pessoa {
        private String nome;
        private int altura;
        private int data;
        
        public Pessoa(String _nome, int _altura, int _data) {
            this.nome = _nome;
            this.altura = _altura;
            this.data = _data;
        }
        public Pessoa() {
        }
        public String getNome(){
    
            return nome;
        }
        public int getAltura(){
      
            return altura;
        }
        public int getData(){
          
            return data;
        }
        public int CalculaData(){
            return 2021-data;
        }
    }

p