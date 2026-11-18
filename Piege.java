public class Piege extends Element {

    private int degats;

    public Piege(int x, int y, int degats) {
        super(x, y);
        this.degats = degats;
    }

    @Override
    public void interagir(Souris souris) {

        souris.subirDegats(degats); // a voir dans la classe souris
    }

    @Override
    public char getSymbole() {
        return 'P';
    }
}
