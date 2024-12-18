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



//Aapka question bilkul sahi hai! Chaliye, main aapko step by step samjhata hoon ki phle code mein 3 loops hone ke bawajood uski time complexity O(V×E)O(V×E) kyun hai, na ki O(V3)O(V3).
//Code mein 3 loops hai, to aapko yeh lag raha hoga ki time complexity O(V3)O(V3) hogi. Lekin yeh galat hai. Main aapko reason samjhata hoon:
//Code mein jo loops hain:
//
//Outer loop (for ii loop):
//Yeh loop V−1V−1 baar chalega, kyunki Bellman-Ford algorithm ko V−1V−1 iterations ki zarurat hoti hai (kahi baar apne algorithm ko poora karne ke liye).
//Time Complexity = O(V).
//
//        Middle loop (for jj loop):
//Yeh loop VV baar chalega, kyunki yeh graph ke saare vertices ko check karta hai.
//Time Complexity = O(V).
//
//        Inner loop (for kk loop):
//Yeh loop har ek vertex se uski connected edges ko process karta hai. Har edge ko process karna EE baar hota hai, jahan EE edges hain.
//Time Complexity = O(E).
//
//        Total Complexity:
//
//Outer loop ko O(V)O(V) samajh sakte hain.
//Middle loop ko bhi O(V)O(V) samajh sakte hain.
//Inner loop ko O(E)O(E) samajhna hoga, kyunki har vertex ke liye usse connected edges ko process karna hai.
//
//        Toh, time complexity hogi:
//O(V)×O(V)×O(E)=O(V×E)
//O(V)×O(V)×O(E)=O(V×E)
//Kaha pe galat samajh rahe the:
//
//Aapko yeh lag raha tha ki 3 loops ka combination O(V3)O(V3) ho sakta hai, lekin actually, inner loop O(E)O(E) ko handle karta hai, jo edges ki sankhya hai, vertices ki nahi.
//V×EV×E ka matlab hai ki aap har edge ko V−1V−1 baar process kar rahe hain, na ki har vertex ko 3 baar.
//
//        Conclusion:
//
//Isliye phle code ki time complexity O(V×E)O(V×E) hai, na ki O(V3)O(V3), kyunki inner loop edges ke liye chal raha hai, na ki vertices ke liye.