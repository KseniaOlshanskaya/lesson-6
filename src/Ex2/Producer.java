package Ex2;

public class Producer extends Thread{
    MusicalShop shop;
    String[] namesOfInstruments = {"Фортепьяно", "Гитара", "Барабаны", "Флейта", "Синтезатор",
            "Маракасы", "Укулеле"};
    String[] models = {"KOFOF", "SFDS", "DBFHH", "AWRR", "TTHT",
            "SDFTT", "УDSDTD"};
    String[] colours = {"black", "red", "white", "brown", "blue",
            "orange", "pink"};

    public Producer(MusicalShop shop) {
        this.shop = shop;
    }

    public void run() {
        nstrumentBuilderImpl builder = new InstrumentBuilderImpl();
        while(!isInterrupted()) {
            try {
                sleep(500);
            } catch (InterruptedException e) {
                break;
            }
            MusicalInstrument instrument = builder
                    .name(namesOfInstruments[(int) (Math.random() * 7)])
                    .id((int) (Math.random() * 7))
                    .model(models[(int) (Math.random() * 7)])
                    .colour(colours[(int) (Math.random() * 7)])
                    .price((int) (Math.random() * 10000))
                    .build();
            shop.sell(instrument);
        }
    }
}
