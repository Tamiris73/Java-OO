public class Questao3 {
    public static void main(String args[]) throws IOException {
        FileInputStream pastadoarquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert 2\arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String modelo=b.readLine();
        String placa=b.readLine();
        String line=b.readLine();
        String line2=b.readLine();
        int entrada = Integer.parseInt(line);
        int saida = Integer.parseInt(line2);
        Estacionamento estacionamento = new Estacionamento(modelo,placa,entrada,saida); 
        System.out.printf("Modelo:");
        System.out.println(estacionamento.getNome());
        System.out.printf("Placa:");
        System.out.println(estacionamento.getPlaca());
        System.out.printf("Entrada:");
        System.out.println(estacionamento.getEntrada());
        System.out.printf("Saida:");
        System.out.println(estacionamento.getSaida());
        System.out.printf("Preço pago:");
        System.out.println(estacionamento.CalculaPreco());
    }
}