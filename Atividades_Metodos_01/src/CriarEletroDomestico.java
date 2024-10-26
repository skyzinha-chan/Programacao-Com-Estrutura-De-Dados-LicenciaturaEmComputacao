public class CriarEletroDomestico {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        EletroDomestico geladeira = new EletroDomestico();
        geladeira.imprimir(); // Deve mostrar "Estado do eletrodoméstico: Desligado"
        geladeira.ligar();
        geladeira.imprimir(); // Deve mostrar "Estado do eletrodoméstico: Ligado"
        geladeira.desligar();
        geladeira.imprimir(); // Deve mostrar "Estado do eletrodoméstico: Desligado"
    }
}
