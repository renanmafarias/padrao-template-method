package templatemethod;

public class PessoaSexoMasculino extends Pessoa {

    public String verificarSituacao() {
        if (this.calcularImc() < 20.7f) {
            return "Abaixo do peso";
        }
        else {
            if (this.calcularImc() < 26.4) {
                return "No peso normal";
            }
            else {
                if (this.calcularImc() < 27.8) {
                    return "Marginalmente acima do peso"
                }
                else {
                    if (this.calcularImc() < 31.1) {
                        return "Acima do peso ideal"
                    }
                    else {
                        return "Obeso"
                    }
                }
            }
        }
    }

}
