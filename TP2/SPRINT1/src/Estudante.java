package Sprint1;

public  class Estudante extends Isecmarini implements GestorEvento {
    int codigo;
    String curso;
    int anomatricula;
    int anocurso;
    String vidaEstudante ;

    public Estudante(String userName, String email, String nome, String alcunha, double password, int codigo, String curso, int anomatricula, int anocurso, String vidaEstudante) {
        super(userName, email, nome, alcunha, password);
        this.codigo = codigo;
        this.curso = curso;
        this.anomatricula = anomatricula;
        this.anocurso = anocurso;
        this.vidaEstudante = vidaEstudante;
    }

    public Estudante(String userName, String email, double password, int codigo) {
        super(userName, email, password);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAnomatricula() {
        return anomatricula;
    }

    public void setAnomatricula(int anomatricula) {
        this.anomatricula = anomatricula;
    }

    public int getAnocurso() {
        return anocurso;
    }

    public void setAnocurso(int anocurso) {
        this.anocurso = anocurso;
    }

    public String getVidaEstudante() {
        return vidaEstudante;
    }

    public void setVidaEstudante(String vidaEstudante) {
        this.vidaEstudante = vidaEstudante;
    }

    @Override
    public void manda(MembroRede membro) {

    }

    @Override
    public void mostrarPerfil() {

    }

    @Override
    public void mudarVisibilidade() {

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
