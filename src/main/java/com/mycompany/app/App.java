package com.mycompany.app;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String args[] )
    {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course!");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        MenuComponent pancakeHouseMenuItems = new PancakeHouseMenu();
        MenuComponent cafeMenuItems = new CafeMenu();
        allMenus.add(pancakeHouseMenu);
        pancakeHouseMenuItems.addToAllMenus(allMenus);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        cafeMenuItems.addToAllMenus(allMenus);

        dinerMenu.add(new MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89
        ));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
            "Apple Pie",
            "Apple pie with a flakey crust, topped with vanilla ice cream",
            true,
            1.59
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        
    }
}
