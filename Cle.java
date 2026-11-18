public class Cle extends Element {

    public Cle(int x, int y) {
        super(x, y);
    }

    @Override
    public void interagir(Souris souris) {
        souris.ajouterCle();
    }

    @Override
    public char getSymbole() {
        return 'K';
    }
}
