import java.util.ArrayList;

public class PrintQueue {
    private static ArrayList<String> queue = new ArrayList<String>();

    /** 
     * adds a string to the queue to be printed on next render()
     * does this by adding string to queue.size()-1 
     * TODO what order do you want these to be printed out?
     * rn, recent queues are printed last
     * if you want to change that, mess with this func
     */
    public static void add(String s) {
        queue.add(queue.size(), s);
    }

    /** 
     * TODO this, remember to format with screen size
     * Removes the item in queue.
     * @returns next in printqueue
     */
    public static String next() {
        String output = queue.get(0);
        queue.remove(0);

        return output;
    }

    /** bootleg toString but its static **/
    public static String getQueue() {
        String output = "";
        for(String s: queue) {
            output += s;
            output += "\n";
        }
        return output;
    }

    /** test program **/
    public static void main(String[] args) {
        PrintQueue.add("yes");
        PrintQueue.add("no");
        PrintQueue.add(";alksfj");

        System.out.println(PrintQueue.getQueue());

        System.out.println(PrintQueue.next());

        System.out.println("getting new q");
        System.out.println(PrintQueue.getQueue());
    }
}