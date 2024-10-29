
public class Node {
    private int valor;
    private Node NoDireito;
    private Node NoEsquerdo;


    //Construtor
    Node(int valor) {
    this.valor = valor;
    this.NoDireito = null;
    this.NoEsquerdo = null;    
    }

    //Getters & Setters

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getNoDireito() {
        return NoDireito;
    }

    public void setNoDireito(Node noDireito) {
        NoDireito = noDireito;
    }

    public Node getNoEsquerdo() {
        return NoEsquerdo;
    }

    public void setNoEsquerdo(Node noEsquerdo) {
        NoEsquerdo = noEsquerdo;
    }
}