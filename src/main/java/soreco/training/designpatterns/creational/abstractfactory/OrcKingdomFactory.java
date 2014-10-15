package soreco.training.designpatterns.creational.abstractfactory;

public class OrcKingdomFactory implements KingdomFactory {

    public Castle createCastle() {
        return new OrcCastle();
    }

    public King createKing() {
        return new OrcKing();
    }
    
    public Queen createQueen() {
        return new OrcQueen();
    }

    public Army createArmy() {
        return new OrcArmy();
    }
}
