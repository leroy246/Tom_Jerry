public class Mur extends Element {

    public Mur(int x, int y) {
        super(x, y);
    }

    @Override
    public void interagir(Souris souris) {  // Rien ne se passe, Pour etre claire, mettre sans paramettre    
    }

    @Override
    public char getSymbole() {
        return '#';
    }

    public boolean estTraversable(Souris souris) {
        return false;
    }
}