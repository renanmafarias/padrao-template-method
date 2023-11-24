package templatemethod;

public abstract class Pessoa {

    private float peso;
    private float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float calcularImc() {
        return this.peso * this.altura ** 2;
    }

    public abstract String verificarSituacao();

    public String exibirResultado() {
        return "A situação é " + this.verificarSituacao();
    }
}
