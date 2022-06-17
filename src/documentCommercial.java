import java.util.List;

public abstract class documentCommercial {

    private long numero;
    client client;
    Detail detail;

    public documentCommercial(long numero, client client, Detail detail) {
        this.numero = numero;
        this.client = client;
        this.detail = detail;
    }

    public double getTotal() {
        return 0;
    }

    public double getTva() {
        return 0;
    }
}
