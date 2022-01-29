import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        boolean gaming = true;
        
        // main game loop
        while (gaming) {
            update();
            render();
        }
    }

    //////// START FUNCTIONS THAT HAVE TO DO WITH UPDATE() ////////
    
    public static void update() {
        String userInput = scan.nextLine();

        if (userInput.equals("w")) temp();
        else if (userInput.equals("s")) temp();
        else if (userInput.equals("a")) temp();
        else if (userInput.equals("d")) temp();
        else if (userInput.equals("inspect")) inspect();
        else if (usable(userInput)) Item.tryUseItem(userInput.substring(4));
        else System.out.println("thats not an option"); // TODO convert to printqueue

    }

    public static void inspect() {
        // TODO just test code rn
        Inventory.obtain("fragile glass bottle");
    }

    /** @return if a string is a properly formatted command starting with use **/
    private static boolean usable(String query) {
        return (query.substring(0,3).equals("use")) && (query.length() > 4);
    }

    public static void temp() {
        // pass
    }

    //////// START FUNCTIONS THAT HAVE TO DO WITH RENDER() ////////

    public static void render() {

    }

}