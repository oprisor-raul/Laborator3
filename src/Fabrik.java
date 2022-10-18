import java.util.List;

public class Fabrik {
    private final List<VerkaufteProduktenPerJahr> arrayVerkaufteProduktenPerJahr;

    public Fabrik(List<VerkaufteProduktenPerJahr> arrayVerkaufteProduktenPerJahr) {
        this.arrayVerkaufteProduktenPerJahr = arrayVerkaufteProduktenPerJahr;
    }

    public void nachfrageSortierung() {
        float[] arrayNachfrage = new float[arrayVerkaufteProduktenPerJahr.size()];
        for(int i=0; i<arrayVerkaufteProduktenPerJahr.size(); i++) {
            arrayNachfrage[i] = arrayVerkaufteProduktenPerJahr.get(i).nachfrage();
//            System.out.println(arrayNachfrage[i]);
//            System.out.println(arrayVerkaufteProduktenPerJahr.get(i).produktName());
        }

        for (int i = 0; i<arrayVerkaufteProduktenPerJahr.size() - 1; i++)
            for (int j = 0; j < arrayVerkaufteProduktenPerJahr.size() - i - 1; j++)
                if (arrayNachfrage[j] > arrayNachfrage[j + 1]) {
                    float temp = arrayNachfrage[j];
                    arrayNachfrage[j] = arrayNachfrage[j + 1];
                    arrayNachfrage[j + 1] = temp;

                    VerkaufteProduktenPerJahr temporary = arrayVerkaufteProduktenPerJahr.get(j);
                    arrayVerkaufteProduktenPerJahr.set(j,arrayVerkaufteProduktenPerJahr.get(j + 1));
                    arrayVerkaufteProduktenPerJahr.set(j+1,temporary);
                }

        for (VerkaufteProduktenPerJahr verkaufteProduktenPerJahr : arrayVerkaufteProduktenPerJahr) {
            System.out.println(verkaufteProduktenPerJahr.produktName() + " with ID: " + verkaufteProduktenPerJahr.produktiD());
        }
    }

    public void anordnung() {
        for (VerkaufteProduktenPerJahr verkaufteProduktenPerJahr : arrayVerkaufteProduktenPerJahr) {
            verkaufteProduktenPerJahr.anordnung();
        }
    }
}
