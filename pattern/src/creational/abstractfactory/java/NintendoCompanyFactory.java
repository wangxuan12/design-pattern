package creational.abstractfactory.java;

public class NintendoCompanyFactory implements CompanyFactory{
    @Override
    public Game makeGame() {
        return new TheLegendOfZaldaGame();
    }

    @Override
    public GameMachine makeGameMachine() {
        return new SwitchGameMachine();
    }
}
