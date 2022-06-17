public class client extends personne {
    private String numero;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public client(String nom, String prenom, Adresse adresse, String numero) {
        super(nom, prenom, adresse);
        this.numero = numero;
    }
}
