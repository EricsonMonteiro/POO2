package Sprint1;

public class Alumni extends Estudante{

    String trabalho;
    String funcao;
    String email;

    public Alumni(String userName, String email, String nome, String alcunha, double password, int codigo, String curso, int anomatricula, int anocurso, String vidaEstudante, String trabalho, String funcao, String email1) {
        super(userName, email, nome, alcunha, password, codigo, curso, anomatricula, anocurso, vidaEstudante);
        this.trabalho = trabalho;
        this.funcao = funcao;
        this.email = email1;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    @Override
    public void novo() {

    }

    @Override
    public void novoRecorrente() {

    }

    @Override
    public void convidar() {

    }
}
