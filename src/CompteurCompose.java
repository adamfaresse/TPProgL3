import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CompteurCompose {

    CompteurSimple compteurSimple;
    CompteurCompose suivant;


    public CompteurCompose(CompteurSimple compteurSimple){

        this.compteurSimple = compteurSimple;

    }

    public CompteurCompose(CompteurSimple compteurSimple,CompteurCompose compteurCompose){

        this.compteurSimple = compteurSimple;
        this.suivant = compteurCompose;
    }



    public void inc(){
            if(this.compteurSimple.inc()){
                if(this.suivant != null){
                    this.suivant.inc();
            }
        }
    }

    public void affiche(){
            if(this.suivant != null) {
                this.suivant.affiche();
                this.compteurSimple.affiche();
            }else{
                this.compteurSimple.affiche();
            }
    }

    public CompteurCompose copie(){
        CompteurCompose copieCompteurCompose ;
        if(this.suivant != null){
            copieCompteurCompose = new CompteurCompose(this.compteurSimple.copie(),this.suivant.copie());
        }

        return copieCompteurCompose = new CompteurCompose(this.compteurSimple.copie());
    }

    public boolean compare(CompteurCompose compteurCompose){
        if(this.compteurSimple.compare(compteurCompose.compteurSimple)){
            if(this.suivant != null){
                if(compteurCompose.suivant != null){
                    return this.suivant.compare(compteurCompose.suivant);
                }
            }return true;
        }
        return false;
    }

}
