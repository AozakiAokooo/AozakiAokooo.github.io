package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import vo.Book;
import java.util.List;
import service.BookService;

@WebServlet("/getBookByCategoryID")
public class BookController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        BookService bookService = new BookService();
        int id = Integer.parseInt(request.getParameter("id"));
        List<Book> books = bookService.getBookByCategory(id);
        response.setContentType("application/json;charset=utf-8");
        ObjectMapper mapper = new ObjectMapper();
        String jsonStr=mapper.writeValueAsString(books);
        PrintWriter out = response.getWriter();
        out.print(jsonStr);
    }
}
