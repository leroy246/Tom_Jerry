import java.util.ArrayList;

public class Level {

    /**Attribut */
    private int numero;
    private int width;
    private int heigth;
    private int departx;
    private int departy;
    private ArrayList<Element> elements = new ArrayList<>();

    /**Méthode */
    public Level(int num, int lar, int lon){
        this.numero = num;
        this.width = lar;
        this.heigth = lon;  
    }

    public void setDepart(int x, int y){
    }

    public void ajouterElements(Element e){
    }

    public void retirerElements(Element e){

    }

    public void localiserElements (Element e){

    }

    public boolean estDansLaCarte (int x, int y){

    }

    public void ajouterSouris(Souris s){
    }

    public void retirerSouris(Souris s){

    }

    public boolean niveauTerminé(Souris s){

    }

    public int getNumero(){
        
    }



}
