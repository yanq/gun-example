import grace.datastore.Entity
import org.grails.datastore.gorm.GormEntity

/**
 * book
 */
class Book implements Entity<Book> {
    String title

    public static void main(String[] args) {
        Book book = Book.get(1)
    }
}

