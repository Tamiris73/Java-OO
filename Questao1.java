public class Questao1{
    public static void main (String [] args) {
        FileInputStream pastadoarquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert 2\arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String nome= b.readLine();
        String line=b.readLine();
        String line2=b.readLine();
        int altura = Integer.parseInt(line);
        int anoNascimento= Integer.parseInt(line2);
    	Pessoa p = new Pessoa();
    	p.ImprimirDados();
    	double resultado;
    	resultado = p.idade(anoNascimento, 2021);
    	System.out.println("Minha idade é:"+resultado);
    }
}