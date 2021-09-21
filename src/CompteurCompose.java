import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CompteurCompose {
    /*int init;
    int max;
    String name;
    int compteur;*/
    CompteurSimple compteurSimple;
    CompteurCompose compteurCompose;
    static List<CompteurSimple> compteurSimplesList = new ArrayList<>();
    static int listSize;

    public CompteurCompose(CompteurSimple compteurSimple){
        /*this.init = compteurSimple.init;
        this.max = compteurSimple.max;
        this.name = compteurSimple.name;
        this.compteur = compteurSimple.init;*/
        compteurSimplesList.add(compteurSimple);
        listSize = listSize +1;

    }

    public CompteurCompose(CompteurSimple compteurSimple,CompteurCompose compteurCompose){
        compteurSimplesList.add(compteurSimple);
        //this.compteurCompose = compteurCompose;
        listSize = listSize +1;
    }

    int x= listSize-1;

    public boolean inc(){

        if (compteurSimplesList.get(x).inc()){
            x -=1;
            this.inc();
        }
        x= 2;
        return false;
    }

    public void affiche(){
        for(CompteurSimple compteurSimple : compteurSimplesList){

            compteurSimple.affiche();
        }
    }


}
