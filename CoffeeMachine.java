package machine;

import java.util.*;

public class CoffeeMachine {
    public static int water = 400;
    public static int milk = 540;
    public static int beans = 120;
    public static int cup = 9;
    public static int money = 550;

    public static void main(String[] args) {
        action();
    }

    public static void action() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        String key = sc.next();
//        do {
//            if (key.equals("buy")) {
//                buyCoffee();
//                action();
//            } else if (key.equals("fill")) {
//                fillBase();
//                action();
//            } else if (key.equals("take")) {
//                takeMoney();
//                action();
//            } else if (key.equals("remaining")) {
//                base();
//                action();
//            }
//            else if (key.equals("exit")){
//                break;
//            }
//        } while (true);
        switch (key){
            case "buy":
                buyCoffee();
                action();
                break;
            case "fill":
                fillBase();
                action();
                break;
            case "take":
                takeMoney();
                action();
                break;
            case "remaining":
                base();
                action();
                break;
                case "exit":
                    break;
            default:
                System.out.println("Try Again :)");
                action();
        }
    }

    public static void base() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
        System.out.println(cup + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void buyCoffee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String key = sc.next();
        switch (key){
            case "1":
                Espresso();
                break;
            case "2":
                Latte();
                break;
            case "3":
               Cappuccino();
                break;
            case "back":
                break;
            default:
                System.out.println("Wrong input! \nTry Again...");
                buyCoffee();
                break;
        }
    }

    public static void fillBase() {
        Scanner sc = new Scanner(System.in);
        int addwater,addmilk,addbeans,addcup;
        System.out.println("Write how many ml of water you want to add: ");
        addwater = sc.nextInt();
        water += addwater;
        System.out.println("Write how many ml of milk you want to add: ");
        addmilk = sc.nextInt();
        milk += addmilk;
        System.out.println("Write how many grams of coffee beans you want to add: ");
        addbeans = sc.nextInt();
        beans += addbeans;
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        addcup = sc.nextInt();
        cup += addcup;
    }

    public static void takeMoney() {
        System.out.println("l gave you $" + money);
        money = 0;
    }

    public static void Espresso(){
        final int ewater = 250,ebeans = 16,cost = 4;

        if(water < ewater) {
            System.out.println("Sorry, not enough water!");
        }
        else if(beans < ebeans){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= ewater;
            beans -= ebeans;
            money += cost;
            cup -= 1;
        }
    }

    public static void Latte(){
        final int lwater = 350,lmilk = 75,lbeans= 20,cost = 7;
        if(water < lwater) {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk < lmilk){
            System.out.println("Sorry, not enough milk!");
        }
        else if(beans < lbeans){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= lwater;
            milk -= lmilk;
            beans -= lbeans;
            money += cost;
            cup -= 1;
        }
    }

    public static void Cappuccino(){
        final int cwater = 200,cmilk = 100,cbeans = 12,cost = 6;
        if(water < cwater) {
            System.out.println("Sorry, not enough water!");
        }
        else if(milk < cmilk){
            System.out.println("Sorry, not enough milk!");
        }
        else if(beans < cbeans){
            System.out.println("Sorry, not enough coffee beans!");
        }
        else {
            System.out.println("I have enough resources, making you a coffee!");
            water -= cwater;
            milk -= cmilk;
            beans -= cbeans;
            money += cost;
            cup -= 1;
        }
    }
}