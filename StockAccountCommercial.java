public class StockAccountCommercial { 

    private final String name;    //customer name 
    private double cash;           
    private int n;                 
    private int[] shares;          // shares[i] = number of shares of stock i
    private String[] stocks;       // stocks[i] = symbol of stock i

    // build data structure from file
    public StockAccountCommercial (String filename) {
        In in = new In(filename);
        name = in.readLine(); 
        cash = in.readDouble(); 
        n = in.readInt(); 
        shares = new int[n]; 
        stocks = new String[n]; 
        for (int i = 0; i < n; i++) {
            shares[i] = in.readInt(); 
            stocks[i] = in.readString(); 
        } 
    } 

    public void printReport() { 
        StdOut.println(name); 
        double total = cash; 
        for (int i = 0; i < n; i++) {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += amount * price;
            StdOut.printf("%4d %5s ", amount, stocks[i]);
            StdOut.printf("%9.2f %11.2f\n", price, amount * price);
        }
        StdOut.printf("%21s %10.2f\n", "Cash: ", cash);
        StdOut.printf("%21s %10.2f\n", "Total:", total);
    } 

    public double valueOf() { 
        StdOut.println(name); 
        double total = cash; 
        for (int i = 0; i < n; i++) {
            int amount = shares[i];
            double price = StockQuote.priceOf(stocks[i]);
            total += amount * price;
        }
        return total;
    } 


    public static void main(String[] args) { 
        String filename = args[0];
        StockAccountCommercial account = new StockAccountCommercial(filename); 
        account.printReport(); 
    } 
} 