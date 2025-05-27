package dao;

import java.util.List;
import vo.Book;

public interface BookDao {
    public List<Book> getBookByCategory(int category_id);
}
