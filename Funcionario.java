package herança;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhar;

    public void StartStop() {

        this.setTrabalhar(!this.trabalhar);
        System.out.println(this.isTrabalhar());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhar() {
        return trabalhar;
    }

    public void setTrabalhar(boolean trabalhar) {
        this.trabalhar = trabalhar;
    }

}
