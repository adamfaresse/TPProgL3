public class Main {

    public static void main(String[] args){
        /*CompteurSimple trimestre = new CompteurSimple(1,4,"Trimestre");
        trimestre.affiche();
        trimestre.inc();trimestre.inc();trimestre.inc();
        trimestre.affiche();
        trimestre.inc();
        trimestre.affiche();
        CompteurSimple copieTrimestre = trimestre.copie();
        copieTrimestre.affiche();
        System.out.println(trimestre.compare(copieTrimestre));*/

        CompteurCompose c;
        c = new CompteurCompose(new CompteurSimple(0,59,"Minute"),
                new CompteurCompose(new CompteurSimple(0,23,"Heure"),
                new CompteurCompose(new CompteurSimple(1,365,"Jour"))));
        c.affiche();
        for (int i = 1; i < 10000; i++) {
            c.inc();
        }
        c.affiche();

        CompteurCompose p;
        p = c.copie();

        System.out.println(c.compare(p));
        p.affiche();


    }
}
