package service;

import java.util.List;
import dao.BookDao;
import dao.impl.BookDaoImpl;
import vo.Book;

public class BookService {
        private BookDao book = new BookDaoImpl();
        public List<Book> getBookByCategory(int category_id){
            return book.getBookByCategory(category_id);
    }
}