package Ex2;

public class InstrumentBuilderImpl implements InstrumentBuilder {
    private MusicalInstrument instrument;

    public InstrumentBuilderImpl() {
        instrument = new MusicalInstrument();
    }
    @Override
    public MusicalInstrument build() {
        return instrument;
    }

    @Override
    public InstrumentBuilder name(String name) {
        instrument.setName(name);
        return this;
    }

    @Override
    public InstrumentBuilder id(int id) {
        instrument.setId(id);
        return this;
    }

    @Override
    public InstrumentBuilder model(String model) {
        instrument.setModel(model);
        return this;
    }

    @Override
    public InstrumentBuilder colour(String colour) {
        instrument.setColour(colour);
        return this;
    }

    @Override
    public InstrumentBuilder price(double price) {
        instrument.setPrice(price);
        return this;
    }
}
