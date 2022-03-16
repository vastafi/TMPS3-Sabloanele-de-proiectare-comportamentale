package Memento;

public class TestMemento {
    public static void main(String[] args) {
        State state = new UserState();
        SoldCard soldCard = new UserCard("Andrei", "Ambros",22,"1987-02-15","Chisinau",8000);
        soldCard.setSold(850);
        System.out.println(soldCard);
        state.addMemento(soldCard.save());
        soldCard.setSold(9000);
        System.out.println(soldCard);
        state.addMemento(soldCard.save());
        soldCard.setSold(9500);
        System.out.println(soldCard);
        soldCard.restore( state.getMemento() );
        System.out.println(soldCard);
    }
}
