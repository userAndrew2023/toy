public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();

        toyShop.addToy(new Toy(1, "Мяч", 10, 25.0));
        toyShop.addToy(new Toy(2, "Кукла", 5, 15.0));
        toyShop.addToy(new Toy(3, "Машинка", 8, 10.0));

        toyShop.updateWeight(1, 30.0);

        Toy prizeToy = toyShop.drawToy();
        if (prizeToy != null) {
            System.out.println("Выиграна игрушка: " + prizeToy.getName());
        } else {
            System.out.println("Произошла ошибка при розыгрыше.");
        }
    }
}
