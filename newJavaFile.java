

class HelloWorld{
    public static void main(String[] args) {
        Carro corsa = new Carro("Corsa", "GM", 2000, 160.80f);

        System.out.printf("Valor Inicial: %f\n", corsa.getVMax());
        
        corsa.setName("");
        corsa.setBrand("");
        corsa.setYear(1800);

        // aumentando velocidade
        corsa.increaseVelocity(10.0f);
        System.out.printf("Valor Incrementado: %f\n", corsa.getVMax());
        // diminuindo velocidade
        corsa.decreaseVelocity(30.0f);
        System.out.printf("Valor Decrementado em 30: %f\n", corsa.getVMax());
}       
}