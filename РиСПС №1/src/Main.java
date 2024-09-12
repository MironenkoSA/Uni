public class Main {
    public static void main(String[] args) {
        Object restaurant = new Object() {
            String name = "Гурман";
            String address = "ул. Центральная, д. 10";
            String phone = "+7 123 456 7890";

            void printRestaurantInfo() {
                System.out.println("Название ресторана: " + name);
                System.out.println("Адрес: " + address);
                System.out.println("Телефон: " + phone);
            }
        };

        System.out.println("Информация о ресторане:");
        restaurant.getClass().getDeclaredMethods()[0].setAccessible(true);
        try {
            restaurant.getClass().getDeclaredMethods()[0].invoke(restaurant);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();

        Object dish = new Object() {
            String name = "Паста";
            int calories = 400;
            int weight = 300; // в граммах
            double price = 350.00; // в рублях

            void printDishInfo() {
                System.out.println("Название блюда: " + name);
                System.out.println("Калорийность: " + calories + " ккал");
                System.out.println("Вес: " + weight + " г");
                System.out.println("Стоимость: " + price + " руб");
            }
        };

        System.out.println("Информация о блюде:");
        dish.getClass().getDeclaredMethods()[0].setAccessible(true);
        try {
            dish.getClass().getDeclaredMethods()[0].invoke(dish);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
