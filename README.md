## Sweet Tooth Bakery App

### Project Overview
The Sweet Tooth Bakery App is a Java console application that allows users to order bakery items, including cakes, pastries, and bread. Users can select a category, choose a specific type, specify a quantity, and view an order summary with the total price.

The project demonstrates object-oriented programming concepts, including abstract classes, inheritance, enums, getters and setters, encapsulation, and method types (void, return, public, private).

### Features
Interactive console menu to select bakery items.

1. Supports multiple categories:

- Cakes (Sponge Cake, Apple Pie, Chocolate Cake, Birthday Cake)
- Pastries (Butter Croissant, Cinnamon Roll, Raspberry Danish Pastry)
- Bread (Sourdough, Baguette, Whole Wheat)

2. Quantity input and automated total price calculation.
3. Order summary displaying each item’s name, price, and optional custom note.
4. Polymorphic design: all items inherit from an abstract BakeryItem class.
5. Cleanly implemented enum Type with display names and prices.
6. Demonstrates private helper methods, public methods, void methods, and methods with return types.

### Running Instructions

Ensure Java is installed on your system (Java 11+ recommended). You can check by running:
```
java -version
```

Compile the Java files:
Open a terminal in the project directory and run:
```
javac *.java
```

Run the application:
```
java Main
```

Follow the prompts in the console:
Select a category (Cake, Pastry, or Bread) by entering 1, 2, or 3.
Enter the quantity you want to order.
Choose the specific item type from the displayed options.
After the order, you will see a summary including item names, prices, and total cost.
The app will ask if you want to order anything else; type yes to continue or no to exit.

### Example run

```
Welcome to the Sweet Tooth Bakery!
What would you like to order today?
1. Cake
2. Pastry
3. Bread
Please enter 1, 2 or 3 to choose.
1
Thank you! How many would you like to order?
2
Please choose a type.
1. Sponge Cake
2. Apple Pie
3. Chocolate Cake
4. Birthday Cake
Please enter 1, 2, 3 or 4 to choose.
3
Baking a fresh Chocolate Fudge Cake...
Thank you for your order!
Here's a summary:

2 x Delicious Chocolate Fudge Cake (6.25)
Total price: 12.50
```


_Assignment X for the CFG +Masters Java Course, by Ewa J