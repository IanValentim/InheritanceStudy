package herança;

public class Principal {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pivete");
        p2.setNome("Ian");
        p3.setNome("Guanabara");
        p4.setNome("Kurt");

        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");

        p1.setIdade(0);
        p2.setIdade(15);
        p3.setIdade(32);
        p4.setIdade(27);

        p2.setCurso("Java com Poo");
        p3.setSalario(2500.75f);
        p4.setSetor("Mercado do trap, bitch");

        p1.Status();
        p2.Status();
        p3.Status();
        p4.Status();

    }

}
