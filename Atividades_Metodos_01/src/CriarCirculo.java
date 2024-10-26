/* Escreva um código em Java que apresente a classe Circulo,com atributos
raio,area e perimetro e, os métodos calcularArea, calcularPerimetro e
imprimir.Os métodos calcularArea e calcularPerimetro devem efetuar
seus respectivos cálculos e colocar os valores nos atributos área e
perimetro.O método imprimir deve mostrar na telaos valores de todos os
atributos.Salienta-se que a área de um círculo é obtida pela fórmula(pi*
raio*raio)e operímetro por (2*pi*raio),onde pi=3,141516. Não se esqueça de
criar um construtor para inicializar os dados.
 */

public class CriarCirculo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Circulo novo_Circulo = new Circulo(15);
        novo_Circulo.imprimir();
    }

}
