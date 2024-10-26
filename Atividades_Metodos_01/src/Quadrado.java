/******************************************************************************
 * 
 * Escreva um código em Java que apresente a classe Quadrado,com
 * atributos lado,área e perímetro e os métodos calcular Área,calcularPerímetro
 * e imprimir.Os métodos calcularArea e calcularPerímetro devem efetuar seus
 * respectivos cálculos e colocar os valores nos atributos área e perímetro.O
 * método imprimir deve mostrar na tela os valores de todos os atributos.
 * Lembrando que a área de um quadrado é obtida pela fórmula(lado*lado) e o
 * perímetro por(4*lado). Não se esqueça de criar um construtor para inicializar
 * os dados.
 * 
 * 
 *******************************************************************************/

public class Quadrado {
    @SuppressWarnings("unused")
    private int lado, area, perimetro;

    public Quadrado(int lado) {
        this.lado = lado;
        this.area = calcularArea(lado);
        this.perimetro = calcularPerimetro(lado);
    }

    public int calcularArea(int lado) {
        return lado * lado;
    }

    public int calcularPerimetro(int lado) {
        return 4 * lado;
    }

    public void imprimir() {
        System.out.println("\t------------------Área e Perímetro de um Quadrado------------------\t");
        System.out.println("\tA Área é: " + area);
        System.out.println("\tO Perímetro é: " + perimetro + "\n\n");
    }

}
