public class VerkaufteProduktenPerJahr {
    private final int jahr1;
    private final int quantitatVerkauftJahr1;
    private final int quantitatFabriziertJahr1;
    private final int jahr2;
    private final int quantitatVerkauftJahr2;
    private final int quantitatFabriziertJahr2;
    private final Produkt produkt;

    public VerkaufteProduktenPerJahr(int jahr1, int quantitatVerkauftJahr1, int quantitatFabriziertJahr1, int jahr2, int quantitatVerkauftJahr2, int quantitatFabriziertJahr2, Produkt produkt) {
        this.jahr1 = jahr1;
        this.quantitatVerkauftJahr1 = quantitatVerkauftJahr1;
        this.quantitatFabriziertJahr1 = quantitatFabriziertJahr1;
        this.jahr2 = jahr2;
        this.quantitatVerkauftJahr2 = quantitatVerkauftJahr2;
        this.quantitatFabriziertJahr2 = quantitatFabriziertJahr2;
        this.produkt = produkt;
    }

    public float nachfrage() {
        double prozent1 = 100 * ((double) quantitatVerkauftJahr1 / quantitatFabriziertJahr1);
        double prozent2 = 100 * ((double) quantitatVerkauftJahr2 / quantitatFabriziertJahr2);
        return (float) (prozent2+prozent1)/2;
    }

    public void anordnung() {
        System.out.println("Produkt: " + produkt.getName());
        double prozent1 = 100 * ((double) quantitatVerkauftJahr1 / quantitatFabriziertJahr1);
        prozent1 = Math.round(prozent1);
        System.out.println("Prozent Jahr1: " + prozent1);
        double prozent2 = 100 * ((double) quantitatVerkauftJahr2 / quantitatFabriziertJahr2);
        prozent2 = Math.round(prozent2);
        System.out.println("Prozent Jahr2: " + prozent2);
        if (prozent1 == prozent2 || (prozent1 + 1 >= prozent2 && prozent1 < prozent2) || (prozent2 + 1 >= prozent1 && prozent2 < prozent1)) {
            System.out.println("Die Nachfrage der " + produkt.getName() + " ist der selbe geblieben im " + jahr1 + " wie im " + jahr2 + " und zwar " + prozent2);
            System.out.println("Empfohlen ist est mit 10% mehr zu produzieren, also " + ((float) (110 * quantitatVerkauftJahr2) / 100));
        } else if (prozent1 < prozent2) {
            System.out.println("Die Nachfrage der " + produkt.getName() + " ist mit " + (prozent2 - prozent1) + "% vom " + jahr1 + " zu " + jahr2 + " gestiegen");
            System.out.println("Empfohlen ist est mit 50% mehr zu produzieren, also " + ((float) (150 * quantitatVerkauftJahr2) / 100));}
        else{
            System.out.println("Die Nachfrage der " + produkt.getName() + " ist mit " + (prozent2 - prozent1) + "% vom " + jahr1 + " zu " + jahr2 + " runtergefallen");
            System.out.println("Empfohlen ist est mit 10% weniger zu produzieren, also " + ((float) (90 * quantitatVerkauftJahr2) / 100));
        }
    }

    public String produktName() {
        return produkt.getName();
    }
}
