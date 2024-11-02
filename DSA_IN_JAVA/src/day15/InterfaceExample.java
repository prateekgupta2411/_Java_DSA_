package day15;
interface ChessPlayer{
    void move();
}
class Queen implements ChessPlayer{
public void move(){
    System.out.println("left,right,up,down,diagonal(all four directions");
}
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("left,right,up,down");
    }
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("left,right,up,down,diagonal - (By one step)");
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Queen q1 = new Queen();
        q1.move();
    }
}
