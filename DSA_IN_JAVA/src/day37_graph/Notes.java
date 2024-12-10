package day37_graph;

public class Notes {
    // Why DFS and not BFS for finding cycle in graphs

//    DFS aur BFS ke basic farq samajh lo:
//
//    DFS:
//    Depth tak explore karta hai, phir wapas aata hai (backtracking hota hai).
//    Ek stack (recursion stack ya explicit stack) use karta hai to track kare ki kaunse nodes visit ho chuke hain aur kis path par hain.
//
//    BFS:
//    Level by level explore karta hai, ek queue use karta hai.
//    Ek baar ek node explore kar li, toh uska pura layer explore karega.
//
//    Graph Cycle Detection ka logic:
//
//    Cycle ka matlab kya hai?
//    Agar tum ek node pe wapas aa jao bina path ko "terminate" kiye, to cycle hai.
//
//    DFS me cycle detect kaise hoti hai?
//    DFS apne recursion stack se track karta hai ki kaunse nodes current path me hain.
//    Agar ek node "visited" hai aur woh recursion stack me already hai, iska matlab hai ki tumne wapas ek purane node pe cycle banayi hai.
//
//    Ye bahut asaan hota hai kyunki DFS naturally stack maintain karta hai (recursion ke wajah se).
//
//    BFS me cycle detect karna mushkil kyun hota hai?
//    BFS layer-wise explore karta hai, aur uska queue path ka track nahi rakhta.
//    Tumhe explicitly check karna padta hai ki koi node revisit ho rahi hai.
//    Directed graphs me parent-child relationships ko bhi track karna padta hai, jo logic ko complex bana deta hai.
//
//    Directed Graph ke Example ke through Samajhte Hain
//    Graph:
//
//    Nodes: 0 → 2 → 3 → 0 (cycle hai)
//    Edges:
//
//            0 → 2
//            2 → 3
//            3 → 0
//
//    DFS Approach:
//
//    DFS recursion start karega node 0 se.
//    0 → 2 jaayega, aur 2 recursion stack me add hoga.
//    2 → 3 jaayega, aur 3 recursion stack me add hoga.
//            Jab 3 → 0 explore karega, to dekhega ki 0 already stack me hai → Cycle detect ho gayi.
//
//    BFS Approach:
//
//    BFS node 0 explore karega aur 2 ko queue me daalega.
//            2 explore karega aur 3 ko queue me daalega.
//            3 explore karega aur 0 ko wapas milega, lekin ab parent-child relationship explicitly track karna padega.
//    Tumhe manually check karna padega ki ye revisit parent ke through hai ya kisi aur ke.
//
//    Key Takeaways:
//
//    DFS me recursion stack ki wajah se current path ka track rakhna easy hota hai.
//    BFS me layer-wise traversal ke karan path ka manual track rakhna padta hai, jo logic ko complex banata hai.
//    Directed graphs ke liye DFS is natural choice cycle detection ke liye.
}

