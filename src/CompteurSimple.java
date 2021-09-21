public class CompteurSimple {

    public int init;
    public int max;
    public String name;
    public int compteur;

    public CompteurSimple(int init,int max, String name){
        this.init = init;
        this.max = max;
        this.name = name;
        this.compteur = init;
    }

    public boolean inc(){
        if (this.compteur == this.max){
            this.compteur = this.init;
            return true;
        }
        this.compteur +=1 ;
        return false;
    }

    public void affiche(){
        System.out.println(name +":"+ this.compteur);
    }
}
