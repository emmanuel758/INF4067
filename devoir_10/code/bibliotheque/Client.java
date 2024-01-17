public class Client {
    public static void main(String[] args) {

        /**
         * Utilisation de l'iterateur provenant d'une liste
         * -----------------------------------------
         */
        ICollection library = new Library();

        // Ajout de quelques livres à la bibliothèque
        library.addBook(new Book("Livre 1"));
        library.addBook(new Book("Livre 2"));
        library.addBook(new Book("Livre 3"));

        // Obtention de l'itérateur pour parcourir la collection de livres
        Iterator iterator = library.createIterator();

        // Parcours de la collection à l'aide de l'itérateur
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println("Titre : " + book.getTitle());
        }

    }
}
