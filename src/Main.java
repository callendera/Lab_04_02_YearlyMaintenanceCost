public class Main {
    public static void main(String[] args) {
        double totalMaintenanceCost;
        double springCost = 1000;
        double summerCost = 967.57;
        double fallCost = 666;
        double winterCost = 400.85;

        totalMaintenanceCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Fall maintenance cost: $" + fallCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Your total yearly maintenance cost is $" + totalMaintenanceCost);
    }
}