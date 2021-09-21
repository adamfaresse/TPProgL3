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

    public CompteurSimple copie(){
        CompteurSimple copieCompteurSimple = new CompteurSimple(this.init,this.max,this.name);
        copieCompteurSimple.compteur = this.compteur;
        return copieCompteurSimple;
    }
    public boolean compare(CompteurSimple compteurSimple){
        if (compteurSimple.init == this.init){
            if(compteurSimple.max == this.max){
                if (compteurSimple.name.equals(this.name)){
                    return compteurSimple.compteur == this.compteur;
                }
            }
        }
        return false;
    }
}
