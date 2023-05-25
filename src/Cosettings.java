import java.io.FileNotFoundException;
public class Cosettings {

    private String bdd = "";
    private String name = "";
    private String pass = "";

    public Cosettings(){
        this.bdd = "basdedonne.gk";
        this.name = "Jean-louis";
        this.pass = "q2sd16q54f6q";
    }


    public String getBdd() {
        return bdd;
    }

    public void setBdd(String bdd) {
        this.bdd = bdd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
