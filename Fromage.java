public class Fromage extends Element {

    private int soin;

    public Fromage(int x, int y, int soin) {
        super(x, y);
        this.soin = soin;
    }

    @Override
    public void interagir(Souris souris) {

        souris.subirDegats(-soin);
    }

    @Override
    public char getSymbole() {
        return 'F';
    }
} 
