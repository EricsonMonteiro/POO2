package Sprint1;

public class Professor extends Isecmarini implements ModeradorGrupo{


    public String area;
    public String grau;
    public String departamento;

    public Professor(String userName, String email, String nome, String alcunha, double password, String area, String grau, String departamento) {
        super(userName, email, nome, alcunha, password);
        this.area = area;
        this.grau = grau;
        this.departamento = departamento;
    }

    public Professor(String userName, String email, double password, String area) {
        super(userName, email, password);
        this.area = area;
    }



    public void mandaColegas(Isecmarini[] membros) {}

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
    public void criar() {

    }

    @Override
    public void apagar() {

    }

    @Override
    public void adicionarMembro() {

    }

    @Override
    public void muteMembro() {

    }

    @Override
    public void removerMembro() {

    }

    @Override
    public void moderar() {

    }
}
