package opps;

public class basic {
    public static void main(String args[]) {
        horse h = new horse();
        h.eat();
        h.walk();

        chicken c = new chicken();
        c.eat();
        c.walk();

        fish f = new fish();
        f.eat();
        f.walk();

        queen q = new queen();
        q.moves();
    }
}

abstract class animal {
    String color;

    animal() {
        System.out.println("animal constructor is called");
    }

    void eat() {
        System.out.println("animal is eating");
    }

    abstract void walk();
}

class horse extends animal {
    horse() {
        System.out.println("hourse constructor is called");
    }

    void walk() {
        System.out.println("walk in four steps ");
    }
}

class chicken extends animal {
    void walk() {
        System.out.println("walk in two steps ");
    }
}

class fish extends animal {
    void walk() {
        System.out.println("walk in zero steps ");
    }
}

interface chessplayer {
    void moves();
}

class queen implements chessplayer {
    public void moves() {
        System.out.println("queen can move in any direction such that up,down,left,right,diagonal ");

    }
}

class rook implements chessplayer {
    public void moves() {
        System.out.println("rook can move in any direction such that up down left right but note in diagonal");
    }
}

class pawn implements chessplayer {
    public void moves() {
        System.out.println("pawn can move in only one steps ahead in the forward direction");
    }
}