package day39_graph;

public class Bellanman_Ford_Summary {
}
//1. Graph ka Structure:
//
//Pehli Code Mein:
//Har ek vertex (node) ke liye ek alag list banayi gayi hai, jisme us vertex se connected edges hain.
//Dusri Code Mein:
//Sabhi edges ko ek hi list mein daala gaya hai. Matlab, ek list mein sabhi edges hain.
//
//        2. Graph Ko Banane Ka Tarika:
//
//Pehli Code Mein:
//Har vertex ko apni ek list milti hai, jisme usse connected edges ko store kiya jata hai.
//Dusri Code Mein:
//Sare edges ek hi list mein store hote hain.
//
//3. Edge Ko Process Karna:
//
//Pehli Code Mein:
//Sabse pehle har vertex ko dekhte hain, aur phir us vertex ke saare edges ko process karte hain.
//Dusri Code Mein:
//Seedha sabhi edges ko ek list se dekh kar process karte hain.
//
//        4. Code Ki Length:
//
//Pehli Code Mein:
//Thoda lamba hai, kyunki har vertex ke liye alag list banani padti hai.
//Dusri Code Mein:
//        Chhota hai, kyunki sabhi edges ko ek hi list mein rakhte hain.
//
//        Summary:
//
//Pehli Code mein har vertex ke liye alag list hai, thoda zyada complex hai.
//Dusri Code mein sabhi edges ek hi list mein hain, jisse code chhota aur samajhne mein aasan hota hai.
//
//Dono ka kaam ek hi hai, bas dusri code thodi simple aur compact hai.