package com.mycompany.app;


public class Waitress {
    
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    private void printMenu() {
        allMenus.print();
    }
    
    
}
