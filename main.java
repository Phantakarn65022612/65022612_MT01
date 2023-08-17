class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }   

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

class Electronics extends Product {
    private String brand;
    private String model;

    public Electronics(String name, double price, String brand, String model) {
        super(name, price);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Smartphone extends Electronics {
    private String operatingSystem;

    public Smartphone(String name, double price, String brand, String model, String operatingSystem) {
        super(name, price, brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}

class Book extends Product {
    private String author;
    private int numberOfPages;

    public Book(String name, double price, String author, int numberOfPages) {
        super(name, price);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}

public class Main {
    public static void main(String[] args) {
        Product P1 = new Product("chair", 500.0);
        Electronics P2 = new Electronics("Television", 20000.0, "SumSung", "Neo QLED");
        Smartphone P3 = new Smartphone("Iphone", 40000.0, "Apple", "Iphone99", "ios");
        Book P4 = new Book("OOP Programming", 250.0, "John Doe", 300);

        System.out.println("Product Name: " + P1.getName());
        System.out.println("Product Price: " + P1.getPrice());
        System.out.println("************************");
        System.out.println("Product Name: " + P2.getName());
        System.out.println("Product Price: " + P2.getPrice());
        System.out.println("Brand: " + P2.getBrand());
        System.out.println("Model: " + P2.getModel());
        System.out.println("************************");
        System.out.println("Product Name: " + P3.getName());
        System.out.println("Product Price: " + P3.getPrice());
        System.out.println("Brand: " + P3.getBrand());
        System.out.println("Model: " + P3.getModel());
        System.out.println("Operating System: " + P3.getOperatingSystem());
        System.out.println("************************");
        System.out.println("Product Name: " + P4.getName());
        System.out.println("Product Price: " + P4.getPrice());
        System.out.println("Author: " + P4.getAuthor());
        System.out.println("Number of Pages: " + P4.getNumberOfPages());
    }
}
