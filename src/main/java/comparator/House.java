package comparator;




public class House implements Comparable<House> {
    int area;
    int price;
    String city;
    boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("House{");
        sb.append("area=").append(area);
        sb.append(", price=").append(price);
        sb.append(", city='").append(city).append('\'');
        sb.append(", hasFurniture=").append(hasFurniture);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(House o) {
        if (this.price == o.price) {
            return 0;
        } else if (this.price < o.price) {
            return -1;
        } else {
            return 1;
        }

    }


}
