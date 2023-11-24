package templatemethod;

public class PessoaSexoFeminino extends Pessoa {

    public String verificarSituacao() {
        if (this.calcularImc() < 19.1f) {
            return "Abaixo do peso";
        }
        else {
            if (this.calcularImc() < 25.8) {
                return "No peso normal";
            }
            else {
                if (this.calcularImc() < 27.3) {
                    return "Marginalmente acima do peso"
                }
                else {
                    if (this.calcularImc() < 32.3) {
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
