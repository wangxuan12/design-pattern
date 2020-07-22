package creational.abstractfactory.java;

public class SonyCompanyFactory implements CompanyFactory{
    @Override
    public Game makeGame() {
        return new GodOfWarGame();
    }

    @Override
    public GameMachine makeGameMachine() {
        return new PS5GameMachine();
    }
}
