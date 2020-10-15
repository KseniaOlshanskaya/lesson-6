package Ex2;

import java.util.ArrayList;

public class MusicalShop {
    public static ArrayList<MusicalInstrument> instruments = new ArrayList<>();

    public synchronized void sell(MusicalInstrument instrument) {
        if(instruments.size() >= 10) {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else {
            instruments.add(instrument);
            System.out.println("Производитель добавил товар: " + instrument.getName());
            notify();
        }
    }

    public synchronized void buy() {
        if(instruments.size() < 1) {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(instruments.size() > 1){

            instruments.remove((int) (Math.random()) * (instruments.size() + 1) );
            System.out.println("Покупатель купил инструмент " + instruments.get(0).getName());
            notify();
        }
    }
}
