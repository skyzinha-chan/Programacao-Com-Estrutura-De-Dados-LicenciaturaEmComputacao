/* Escreva um código em Java que apresente a classe Circulo, com atributos
raio, area e perimetro e, os métodos calcularArea, calcularPerimetro e
imprimir. Os métodos calcularArea e calcularPerimetro devem efetuar
seus respectivos cálculos e colocar os valores nos atributos área e
perimetro. O método imprimir deve mostrar na tela os valores de todos os
atributos. Salienta-se que a área de um círculo é obtida pela fórmula (pi*
raio*raio)e o perímetro por (2*pi*raio),onde pi=3,141516. Não se esqueça de
criar um construtor para inicializar os dados.
 */

public class Circulo {
    @SuppressWarnings("unused")
    private double raio, area, perimetro;
    private double pi = 3.141516;

    public Circulo(double raio) {
        this.raio = raio;
        this.area = calcularArea(raio);
        this.perimetro = calcularPerimetro(raio);
    }

    public double calcularArea(double raio) {
        return (pi * raio * raio);
    }

    public double calcularPerimetro(double raio) {
        return (2 * pi * raio);
    }
    
    public void imprimir() {
        System.out.println("\t-------------- Área e Perímetro de um Circulo --------------\t");
        System.out.println("\tA Área é: " + area);
        System.out.println("\tO Perímetro é: " + perimetro + "\n\n");
    }

}
