public classQuestao2{
    public static void main (String [] args) {
        FileInputStream pastadoarquivo = new FileInputStream("C:\Users\User\Desktop\Tarefas 3 ano\Aplicações Moveis\hebert 2\arquivo.txt");
        InputStreamReader ainput = new InputStreamReader(pastadoarquivo);
        BufferedReader b = new BufferedReader(ainput);
        String line=b.readLine();
        String line2=b.readLine();
        int andar = Integer.parseInt(line);
        int capacidade= Integer.parseInt(line2);
        Elevador elevador = new Elevador();
        elevador.Inicializar(capacidade,andar);
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Entra();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Sobe();
        elevador.Desce();
        elevador.Desce();
        elevador.Desce();
        elevador.Sai();
        elevador.Desce();
    }
    }
}