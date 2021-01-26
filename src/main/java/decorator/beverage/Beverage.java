package decorator.beverage;

public abstract class Beverage {
    private String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public void print() {
        System.out.println(this.getDescription() + " - " + this.cost());
    }
}
