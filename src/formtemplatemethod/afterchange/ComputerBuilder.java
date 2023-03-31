package formtemplatemethod.afterchange;

public abstract class ComputerBuilder {
    public final void buildComputer() {
        addMotherboard();
        setupMotherboard();
        addProcessor();
    }
    public abstract void addMotherboard();
    public abstract void setupMotherboard();
    public abstract void addProcessor();
}


