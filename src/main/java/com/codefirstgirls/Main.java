package com.codefirstgirls;

import com.codefirstgirls.model.BakeryItem;
import com.codefirstgirls.model.Type;
import com.codefirstgirls.service.BakingService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        BakingService bakery = new BakingService();
        boolean continueOrdering = true;

        while (continueOrdering) {
            handleSingleOrder(bakery);

            System.out.println("\nWould you like to order anything else? (yes/no)");
            scanner.nextLine();
            String response = scanner.nextLine().trim().toLowerCase();

            continueOrdering = response.equals("yes");
        }

        System.out.println("Thank you for visiting the Sweet Tooth Bakery!");
    }

    private static void handleSingleOrder(BakingService bakery) {
        printWelcomeMessage();
        listInitialOptions();

        System.out.println("Please enter 1, 2 or 3 to choose.\n");
        int categoryChoice = scanner.nextInt();
        System.out.println("Thank you! How many would you like to order?");
        int amountToCreate = scanner.nextInt();
        System.out.println("Please choose a type.");

        List<BakeryItem> items = new ArrayList<>();
        double price = 0;
        Type bakeryItemType;

        switch (categoryChoice) {
            case 1 -> { // Cake
                listCakeOptions();
                System.out.println("Please enter 1, 2, 3 or 4 to choose.");
                int typeChoice = scanner.nextInt();
                bakeryItemType = switch (typeChoice) {
                    case 1 -> Type.SPONGE_CAKE;
                    case 2 -> Type.APPLE_PIE;
                    case 3 -> Type.CHOCOLATE_CAKE;
                    case 4 -> Type.BIRTHDAY_CAKE;
                    default -> throw new IllegalStateException("Item unavailable: " + typeChoice);
                };
                items.addAll(bakery.getItems(amountToCreate, bakeryItemType));
                price = bakery.calculatePrice(amountToCreate, bakeryItemType);
            }
            case 2 -> { // Pastry
                listPastryOptions();
                System.out.println("Please enter 1, 2 or 3 to choose.");
                int typeChoice = scanner.nextInt();
                bakeryItemType = switch (typeChoice) {
                    case 1 -> Type.CROISSANT;
                    case 2 -> Type.CINNAMON_ROLL;
                    case 3 -> Type.DANISH_PASTRY;
                    default -> throw new IllegalStateException("Item unavailable: " + typeChoice);
                };
                items.addAll(bakery.getItems(amountToCreate, bakeryItemType));
                price = bakery.calculatePrice(amountToCreate, bakeryItemType);
            }
            case 3 -> { // Bread
                listBreadOptions();
                System.out.println("Please enter 1, 2 or 3 to choose.");
                int typeChoice = scanner.nextInt();
                bakeryItemType = switch (typeChoice) {
                    case 1 -> Type.SOURDOUGH;
                    case 2 -> Type.BAGUETTE;
                    case 3 -> Type.WHOLE_WHEAT;
                    default -> throw new IllegalStateException("Item unavailable: " + typeChoice);
                };
                items.addAll(bakery.getItems(amountToCreate, bakeryItemType));
                price = bakery.calculatePrice(amountToCreate, bakeryItemType);
            }
        }
        printOrderSummary(items, price);
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to the Sweet Tooth Bakery!");
        System.out.println("What would you like to order today?");
    }

    private static void listInitialOptions() {
        System.out.println("1. Cake");
        System.out.println("2. Pastry");
        System.out.println("3. Bread");
    }

    private static void listCakeOptions() {
        System.out.println("1. Sponge Cake");
        System.out.println("2. Apple Pie");
        System.out.println("3. Chocolate Cake");
        System.out.println("4. Birthday Cake");
    }

    private static void listPastryOptions() {
        System.out.println("1. Butter Croissant");
        System.out.println("2. Cinnamon Roll");
        System.out.println("3. Danish Raspberry Pastry");
    }

    private static void listBreadOptions() {
        System.out.println("1. Sourdough Bread");
        System.out.println("2. Baguette");
        System.out.println("3. Whole wheat bread");
    }

    private static void printOrderSummary(List<BakeryItem> items, double price) {
        System.out.println("Thank you for your order!");
        System.out.println("Here's a summary:\n");
        System.out.printf("%d x %s", items.size(), items.get(0).displayItem());
        System.out.printf("Total price: %.2f",price);
    }
}