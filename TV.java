vpublic class TV {

    int tamanhoTela;
    int volume = 5;
    String marca;
    int voltagem;
    int canal;

    void ligar() {
        int consumo = voltagem * tamanhoTela;
        System.out.println("TV ligada");
        System.out.println("Consumo: " + consumo);
    }

    void desligar() {
        System.out.println("TV desligada");
    }

    void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    void subirCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    void descerCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }
}
