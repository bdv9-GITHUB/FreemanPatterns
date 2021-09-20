package decorator.beverage;


import java.util.logging.Logger;

public abstract class Beverage {
    static Logger logger = Logger.getLogger(Beverage.class.getName());
    private String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public void print() {
        String log = this.getDescription() + " - " + this.cost();
        logger.info(log);
//                System.out.println(this.getDescription() + " - " + this.cost());
    }
}
