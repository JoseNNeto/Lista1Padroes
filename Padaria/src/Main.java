import Cake.ChocolateCake;
import Cake.StrawberryCake;
import Cake.VanillaCake;
import Decorator.MultiLayered;
import Decorator.Sprinkles;
import Decorator.WithSaying;
import Cake.Cake;
/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();

        // Add cakes to the order
        Cake chocolate = new ChocolateCake(); //sem adicionais
        Cake baunilha1 = new VanillaCake(); //Dizer: "PLAIN!"
        Cake baunilha2 = new VanillaCake(); // Granulado + Dizer: "FANCY"
        Cake morango = new StrawberryCake(); // Varias Camadas, Granulado duplo e dizer "One of" e "EVERYTHING"

        // Add decorations to the cakes
        baunilha1 = new WithSaying(baunilha1, "PLAIN!"); //somente

        baunilha2 = new Sprinkles(baunilha2); //Granulado
        baunilha2 = new WithSaying(baunilha2, "FANCY"); //Dizer: "FANCY"

        morango = new MultiLayered(morango); //Varias Camadas
        morango = new Sprinkles(morango); //Granulado
        morango = new Sprinkles(morango); //Granulado
        morango = new WithSaying(morango, "One of"); //Dizer: "One of"
        morango = new WithSaying(morango, "EVERYTHING");

        // Add the cakes to the order
        order.addCake(chocolate);
        order.addCake(baunilha1);
        order.addCake(baunilha2);
        order.addCake(morango);


        // Print the order
        order.printOrder();
    }
}
