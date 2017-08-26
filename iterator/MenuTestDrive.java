package Design.iterator;


public class MenuTestDrive {

    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("PanCake House", "Breakfast");
        MenuComponent dinnerMenu = new Menu("Dinner House", "Lunch");
        MenuComponent cafeMenu = new Menu("Cafe House", "Dinner");
        MenuComponent dessertMenu = new Menu("Dessert House", "Dessert of course");

        MenuComponent allMenus = new Menu("All Menus", "All menus combined");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        allMenus.add(dessertMenu);

        dinnerMenu.add(new MenuItem(
                "Pasta",
                "Pasta",
                true,
                1.59
        ));

        cafeMenu.add(new MenuItem(
                "Lan",
                "KuDe",
                false,
                2.55
        ));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
        waitress.printVegetarianMenu();
    }
}
