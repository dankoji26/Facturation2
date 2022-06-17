import java.util.Date;

public class Produit<T> {
    private String code;
    public Categori designation;
    private double prix;
    private T unitedemesure;
    private Date dateExpiration;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Categori getDesignation() {
        return designation;
    }

    public void setDesignation() {
        this.designation = designation;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public T getUnitedemesure() {
        return unitedemesure;
    }

    public void setUnitedemesure(T unitedemesure) {
        this.unitedemesure = unitedemesure;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Produit(String code, Categori designation, double prix, T unitedemesure, Date dateExpiration) {
        this.code = code;
        this.designation = designation;
        this.prix = prix;
        this.unitedemesure = unitedemesure;
        this.dateExpiration = dateExpiration;
    }
}
