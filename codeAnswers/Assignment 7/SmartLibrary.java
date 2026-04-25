import java.util.function.*;
public class SmartLibrary{
    public static void main(String[] args){
        Book book1 = new Book("of Mice and Men", "Stein", 9.99, 143, true);
        Book book2 = new Book("Miffy and her friends", "Zena", 6.9, 90, false);
        Book book3 = new Book("How to make vietnamese iced coffee", "Vietnam", 1.0, 3, true);
        Book book4 = new Book("Rabbit", "Nguyen", 9.7, 900, true);

        // Predicate
        Predicate<Double> isAffordable = bookPrice -> bookPrice < 20;
        System.out.println(isAffordable.test(book1.getPrice()));
        Predicate<Integer> isLongBook = bookPages -> bookPages > 500;
        System.out.println(isLongBook.test(book2.getPages()));

        // BiPredicate
        BiPredicate<Double, Double> fitsBudget = (budget, price) -> price <= budget;
        System.out.println(fitsBudget.test(20.0, book3.getPrice()));

        // Consumer lambda
        Consumer<String> printInfo = book -> System.out.println(book);
        printInfo.accept(book1.toString());

        Consumer<String> printInfoMR = System.out::println;
        printInfoMR.accept(book2.toString());
        printInfoMR.accept(book3.toString());

        // BiConsumer
        BiConsumer<Double, Double> applyDiscount = (book , discountRate) ->System.out.println(book * discountRate);
        applyDiscount.accept(book1.getPrice(), 0.9);

        // Supplier
        Supplier<Book> newBook = () -> new Book("Roses", "Addison", 3.9, 400, false);
        System.out.println(newBook.get());

        // Function lambda
        Function<Book, String> getTitle = title -> title.getTitle();
        System.out.println(getTitle.apply(book3));
        Function<Book, String> authorName = name -> name.getAuthor();
        System.out.println(authorName.apply(book2));

        Function<Book, String> getTitleMR = Book::getTitle;
        System.out.println(getTitleMR.apply(book1));
        Function<Book,String> authorNameMR = Book::getAuthor;
        System.out.println(authorNameMR.apply(book3));

        // BiFunction
        BiFunction<Book, Double, Double> calcTax = (bookOGPrice, taxRate) -> bookOGPrice.getPrice() * taxRate;
        System.out.println(calcTax.apply(book2, 0.8));

        // UnaryOperator
        UnaryOperator<String> capitalize = bookTitle -> bookTitle.toUpperCase();
        System.out.println(capitalize.apply(book2.getTitle()));

        UnaryOperator<String> capitalizeMR = String::toUpperCase;
        System.out.println(capitalizeMR.apply(book2.getTitle()));


        UnaryOperator<Book> applyNewEditionMarkup = book -> new Book(book.getTitle().concat("(2nd Edition)"), book.getAuthor(), book.getPrice() *1.10, book.getPages(), book.isDigital());
        System.out.println(applyNewEditionMarkup.apply(book4));

        UnaryOperator<Book> discountBook = book -> new Book(book, book.getPrice() * 0.9);
        System.out.println(discountBook.apply(book1));

        //Primitive Specialization
        IntPredicate isThickBook = bookPages -> bookPages > 600;
        System.out.println(isThickBook.test(book4.getPages()));

        ToDoubleFunction<Book> getPriceRaw = bookPrice -> bookPrice.getPrice();
        System.out.println(getPriceRaw.applyAsDouble(book4));

        ToDoubleFunction<Book> getPriceRawMR = Book::getPrice;
        System.out.println(getPriceRawMR.applyAsDouble(book4));

    }
}
