package day13;

public class GetPath {

    public static float getShortestPath(String path){
        int x = 0,y = 0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){ // South
                y--;
            } else if (dir == 'N') { // North
                y++;
            } else if (dir == 'E') { // East
                x++;
            } else {
                x--; // west
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "NS";
        System.out.println(getShortestPath(path));
    }
}
