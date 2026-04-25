import java.util.*;
public class Stock {
    private String name;
    private String symbol;

    public Stock(String name, String symbol){
        this.name = name;
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString(){
        return "Stock name: " + name + "\nStock symbol: " + symbol;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Map<String, Stock> stock = new HashMap<>();

        stock.put("NFLIX", new Stock("Netflix", "NFLIX"));
        stock.put("FB", new Stock("Facebook", "FB"));
        stock.put("meta", new Stock("Instagram", "meta"));

        System.out.println("What is the stock symbol? ");
        String symbol  = scan.next();

        Stock object = stock.get(symbol);
        if(object != null){
            System.out.println(object);

        } else System.out.println("Not found"); }

    }


