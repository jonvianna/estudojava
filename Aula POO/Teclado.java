// Aqui estou criando a classe Teclado e depois definindo as propriedades dele

public class Teclado {
    String marca;
    String cor;
    int qtdteclas;
    boolean led;
    boolean conectado;


    //  Aqui começo a definir os métodos que esse teclado possui para depois eu chamar no MAIN
    void digitar() {
        if (this.conectado = true){
            System.out.println("Você está digitando");
        } else {
            System.out.println("O teclado não está conectado :(");
        }
    }

    void led() {
        if (this.conectado = true){
            System.out.println("O teclado está conectado e com os leds ligados");
        } else {
            System.out.println("Leds não estão ligados pois o teclado não está conectado");
        }
    }

    void propriedades(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Quantidade de teclas: " + this.qtdteclas);
    }

    void conectar(){
        this.conectado = true;
    }

    void desconectar(){
        this.conectado = false;
    }
}
