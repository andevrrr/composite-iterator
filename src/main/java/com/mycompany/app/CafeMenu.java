package com.mycompany.app;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class CafeMenu extends MenuComponent{
    Map<String, MenuItem> menuItems = new HashMap<String, MenuItem>();
    
    public CafeMenu() {
        addItem("Veggie Burger and Air Fries", "Veggie burger on a whole wheat bun, lettuce, tomato, and fries", true, 3.99);
        addItem("Soup of the day", "A cup of the soup of the day, with a side salad", false, 4.49);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }

    public void addToAllMenus(MenuComponent allMenus) {
        for (MenuItem menuItem : menuItems.values()) {
            allMenus.add(menuItem);
        }
    }
    
}
