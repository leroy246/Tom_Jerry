import java.util.ArrayList;
import java.util.Random;

public class Level {

    /**Attribut */
    private int numero;
    private int width;
    private int heigth;
    private int departx;
    private int departy;
    private ArrayList<Element> elements = new ArrayList<>();
    private Chat chat;

    /**Méthode */
    public Level(int num, int lar, int lon){
        this.numero = num;
        this.width = lar;
        this.heigth = lon;
        this.chat = null;
    }

    // Met le chat dans le level (seulement au level 3)
    public void setChat(Chat c){
        this.chat = c;
    }

    public int getNumero(){
        return numero;        
    }

    public int getWidth(){
        return width;
    }

    public Chat getChat(){
        return chat;
    } 

    public int getHeight(){
        return heigth;
    }

    void setDepart(int x, int y){
        this.departx = x;
        this.departy = y;
    }
    void setPositionDepart(int x, int y){
        this.departx = x;
        this.departy = y;
    }

    void ajouterElement(Element e){
        elements.add(e);
    } 

    void removeElement(Element e)
    {
        if (elements != null)
            elements.remove(e);
    }


    public boolean estDansLaCarte(int x, int y){
        return (x >= 0 && x < width && y >= 0 && y < heigth);
    }
    
    public Element getElement(int x, int y){
        for (Element e : elements) {
            if (e.getX() == x && e.getY() == y) {
                return e;
            }
        }
        return null;
    }
    
    // Place un élément sur une case vide choisie au hasard
    public void placerAuHasard(Element e, Random r){
        int x = r.nextInt(width);
        int y = r.nextInt(heigth);
        while (getElement(x, y) != null || (x == departx && y == departy)) {
            x = r.nextInt(width);
            y = r.nextInt(heigth);
        }
        e.setPositionDepart(x, y);
        ajouterElement(e);
    }
}