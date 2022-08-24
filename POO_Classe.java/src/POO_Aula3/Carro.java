package POO_Aula3;

public class Carro {
    String cor;                                     //atributo
    String modelo;                                  //atributo
    int capacidadeDoTanque;                         //atributo

    //construtor aqui  (sobrecarga)

    Carro() {

    }

    Carro(String cor, String modelo, int capacidadeDoTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeDoTanque = capacidadeDoTanque;

    }

    void setCor(String cor) {               // set utilizado para colocar o valor em um atributo
        this.cor = cor;
    }

    String getCor (){                       // get utilizado para retornar um valor
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo () {
        return modelo;
    }

    // get e set tanque

    void setCapacidadeDoTanque(int capacidadeDoTanque){
        this.capacidadeDoTanque = capacidadeDoTanque;
    }

    int getCapacidadeDoTanque () {
        return  capacidadeDoTanque;
    }

    // metodo de total para encher o tanque

    double totalValorTanque (double valorCombustivel) {
        return capacidadeDoTanque * valorCombustivel;

    }
}
