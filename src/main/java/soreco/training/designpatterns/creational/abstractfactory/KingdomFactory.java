package soreco.training.designpatterns.creational.abstractfactory;

public interface KingdomFactory {

    Castle createCastle();
    King createKing();
    Army createArmy();
}
