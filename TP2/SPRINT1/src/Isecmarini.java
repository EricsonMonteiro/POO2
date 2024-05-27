package Sprint1;

import java.util.List;

public abstract class Isecmarini implements MembroRede {
    private String userName,email,nome ,alcunha ;
    private double password;

    List<Isecmarini> marins;

    boolean visivel ;

    public Isecmarini(String userName, String email, String nome, String alcunha, double password) {
        this.userName = userName;
        this.email = email;
        this.nome = nome;
        this.alcunha = alcunha;
        this.password = password;
    }

    public Isecmarini(String userName, String email, double password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getAlcunha() {
        return alcunha;
    }

    public double getPassword() {
        return password;
    }

    public List<Isecmarini> getMarins() {
        return marins;
    }




    public boolean isVisivel() {
        return visivel;
    }


    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAlcunha(String alcunha) {
        this.alcunha = alcunha;
    }

    public void setPassword(double password) {
        this.password = password;
    }

    public void setMarins(List<Isecmarini> marins) {
        this.marins = marins;
    }



    public void setVisivel(boolean visivel) {

        this.visivel = visivel;
    }

    public void signin(){}

    public void signoff(){}

    public  void resetpassword(){}


}
