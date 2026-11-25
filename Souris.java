public class Souris extends Personnage {
    private int nombrekey;

    public Souris(String p_nom, int p_pointsDeVie, int p_xPosition, int p_yPosition, int p_nombrekey) {
        super(p_nom, p_pointsDeVie, p_xPosition, p_yPosition);
        this.nombrekey = p_nombrekey;
    }

    public int getNombrekey() {
        return nombrekey;
    }

    public void setNombrekey(int p_nombrekey) {
        this.nombrekey = p_nombrekey;
    }

public void MouvementAvant() {
        xPosition += 1;
    }

    public void MouvementArriere() {
        xPosition -= 1;
    }

    public void MouvementGauche() {
        yPosition -= 1;
    }

    public void MouvementDroite() {
        yPosition += 1;
    }

    public void GrabKey() {
        nombreclé += 1;
    }

    public void LoseKey() {
        nombreclé -= 1;
    }

    public void LoseLife() {
        PointsDeVie -= 1;
    }

    public void GainLife() {
        PointsDeVie += 1;
    }

    public String toString() {
        return "Souris{" +
                "Nom='" + Nom + '\'' +
                ", PointsDeVie=" + PointsDeVie +
                ", xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", nombreclé=" + nombreclé +
                '}';
    }
}
