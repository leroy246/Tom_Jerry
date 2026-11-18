public class Porte extends Element {

    private int clesRequises;
    private boolean ouverte;

    public Porte(int x, int y, int clesRequises) {
        super(x, y);
        this.clesRequises = clesRequises;
        this.ouverte = false;
    }

    public void ouvrir() {
        ouverte = true;
    }

    public boolean estOuverte() {
        return ouverte;
    }

    @Override
    public boolean estTraversable(Souris souris) {

        if(ouverte) {
            return true;
        }

        if(souris.getCles() >= clesRequises) {
            ouvrir();
            return true;
        }

        return false;
    }

    @Override
    public void interagir(Souris souris) {
        estTraversable(souris);
    }

    @Override
    public char getSymbole() {
        return 'D';
    }
}
