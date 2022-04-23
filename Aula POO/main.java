// Criando o objeto teclado e definindo as propriedades;

public class main {
    public static void main(String[] args) {
        Teclado t1 = new Teclado();
        t1.marca = "HyperX";
        t1.cor = "Preto";
        t1.qtdteclas = 72;

        // aqui começo a chamar os métodos para rodar e ver os resultados;
        t1.conectar();
        t1.led();
        t1.propriedades();
        t1.digitar();
    }
}
