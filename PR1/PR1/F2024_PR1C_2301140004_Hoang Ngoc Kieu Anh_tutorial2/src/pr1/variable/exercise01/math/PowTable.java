package pr1.variable.exercise01.math;

public class PowTable {
    public static void main( String[] args){
        System.out.printf("%-6s %-6s %-6s", "a", "b", "pow(a , b)");
        System.out.println();
        System.out.printf("%-6s %-6s %6s", 1, 2, (int) Math.pow(1, 2));
        System.out.println();
        System.out.printf("%-6s %-6s %6s", 2, 3, (int) Math.pow(2, 3));
        System.out.println();
        System.out.printf("%-6s %-6s %6s", 3, 4, (int) Math.pow(3, 4));
    }
}
