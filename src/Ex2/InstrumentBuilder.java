package Ex2;
public interface InstrumentBuilder {

    MusicalInstrument build();
    InstrumentBuilder name(String name);
    InstrumentBuilder id(int id);
    InstrumentBuilder model(String model);
    InstrumentBuilder colour(String colour);
    InstrumentBuilder price(double price);
}
