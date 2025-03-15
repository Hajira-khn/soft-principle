============================================
  INFORMATION EXPERT PRINCIPLE (GRASP)
============================================

This project demonstrates the **Information Expert Principle** using Java OOP and packages.  
The project is divided into two parts:

1️⃣ `withoutprinciple` → **Violating Information Expert**  
2️⃣ `withprinciple` → **Applying Information Expert**  

By following this principle, we improve **maintainability, scalability, and low coupling**.

--------------------------------------------
🚀 WHAT IS THE INFORMATION EXPERT PRINCIPLE?
--------------------------------------------
The **Information Expert** principle states that **a class that has the necessary information should be responsible for handling related behavior**.  
This **reduces coupling** and **ensures encapsulation**.

--------------------------------------------
❌ WITHOUT INFORMATION EXPERT (Bad Design)
--------------------------------------------
📂 **Package:** `withoutprinciple`

In this design, the `Order` class is responsible for calculating the total price of items.  
However, **pricing details belong to the `Item` class**, so `Order` should not handle this logic.

🔹 **Classes:**
   - `Item.java`: Stores item name and price.
   - `Order.java`: Stores a list of items but also calculates total price (violates Information Expert).
   - `WithoutInformationExpert.java`: Runs the program.

🛑 **Problems:**
- `Order` depends on `Item`'s internal data (tight coupling).  
- If pricing logic changes (e.g., discounts, tax), `Order` must be modified.  
- Violates **Single Responsibility Principle (SRP)**, making code harder to maintain.  

--------------------------------------------
✅ WITH INFORMATION EXPERT (Good Design)
--------------------------------------------
📂 **Package:** `withprinciple`

This design **correctly assigns responsibility** by letting `Item` handle price calculations.  
Now, `Order` simply **aggregates** totals instead of calculating them.

🔹 **Classes:**
   - `Item.java`: Now has a method `getTotalPrice()` to calculate item price.
   - `Order.java`: Only sums the totals returned by `Item`.
   - `WithInformationExpert.java`: Runs the program.

🎯 **Improvements:**
- `Item` calculates its own price, **following Information Expert**.  
- `Order` only aggregates totals, reducing **tight coupling**.  
- If pricing logic changes, **we modify only `Item`**, improving maintainability.  
