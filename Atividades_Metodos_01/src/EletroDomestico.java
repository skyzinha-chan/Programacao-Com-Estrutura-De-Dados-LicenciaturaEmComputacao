/* Escreva um código em Java que apresente a classe Eletrodomestico,com
 * atributo estadoEletroDomestico e os métodos ligar, desligar e imprimir.O
 * método imprimir deve mostrar na tela os valores de todos os atributos, os métodos
 * ligar e desligar devem realizar alteração do valor do atributo
 * estadoEletroDomestico.O atributo ligadoserá boolean o e deverá indicar o estado
 * atual do eletrodoméstico, se ligado ou desligado.
 */
public class EletroDomestico {
    private boolean ligado;
    private String estadoEletroDomestico;

    public EletroDomestico() {
        this.ligado = true;
        this.estadoEletroDomestico = "Eletrodoméstico está Ligado!";
    }

    public void ligar() {
        this.ligado = true;
        this.estadoEletroDomestico = "Eletrodoméstico está Ligado!";
    }

    public void desligar() {
        this.ligado = false;
        this.estadoEletroDomestico = "Eletrodoméstico está Desligado!";
    }

    public void imprimir() {
        System.out.println("\t------------------O Eletrodoméstico------------------\t");
        System.out.println("\tEstá ligada: " + ligado);
        System.out.println("\tEntão: " + estadoEletroDomestico + "\n\n");
    }
}

