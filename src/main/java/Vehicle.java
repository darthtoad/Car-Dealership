public class Vehicle {
    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;

        public boolean worthBuying(int maxPrice) {
            return (price < maxPrice);
        }
}