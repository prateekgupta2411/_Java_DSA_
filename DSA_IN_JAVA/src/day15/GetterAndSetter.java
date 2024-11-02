package day15;


class Pens {
    private String color;
    private int id;

    void setColor(String color) {
        this.color = color;
    }

    void setId(int id) {
        this.id = id;
    }

    String getColor() {
        return this.color;
    }

    int getId() {
        return this.id;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("Black");
        System.out.println(p1.getColor());
        p1.setId(5);
        System.out.println(p1.getId());
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
    }
}
