import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Produkt kaffee = new Produkt("Tschibo",1001);
        Produkt schokolade = new Produkt("Milka",1002);
        Produkt bombon = new Produkt("Chokotoff",1003);
        Produkt kopfhorer = new Produkt("JBL" ,1004);

        VerkaufteProduktenPerJahr verkaufteKafee = new VerkaufteProduktenPerJahr(2021,80,100,2022,81,100,kaffee);
        VerkaufteProduktenPerJahr verkaufteSchockolade = new VerkaufteProduktenPerJahr(2021,100,100,2022,90,100,schokolade);
        VerkaufteProduktenPerJahr verkaufteBombone = new VerkaufteProduktenPerJahr(2021,50,200,2022,99,200,bombon);
        VerkaufteProduktenPerJahr verkaufteKopfhorer = new VerkaufteProduktenPerJahr(2021,100,300,2022,250,300,kopfhorer);

        Fabrik fabrik = new Fabrik(Arrays.asList(verkaufteKafee, verkaufteSchockolade, verkaufteBombone, verkaufteKopfhorer));

        System.out.println("Sortierung:");
        System.out.println();

        fabrik.nachfrageSortierung();

        System.out.println();
        System.out.println("Anordnung:");
        System.out.println();
        fabrik.anordnung();
    }
}