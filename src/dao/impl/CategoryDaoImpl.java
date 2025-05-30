package dao.impl;

import vo.Category;
import dao.JDBCUtil;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDaoImpl implements dao.CategoryDao {
    @Override
    public void add(Category category) {
    }
    @Override
    public void delete(Category category) {
    }
    @Override
    public List<Category> findAll() {
        Connection connection = null;
        Statement stat = null;
        List<Category> list = new ArrayList<Category>();
        try {
            connection = JDBCUtil.getConnection();
            stat = (Statement)connection.createStatement();
            String sql = "select id,name,description from category";
            ResultSet resultSet = (ResultSet)stat.executeQuery(sql);
            while (resultSet.next()){
                Category category = new Category();
                category.setId(resultSet.getInt("id"));
                category.setName(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                list.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            JDBCUtil.closeConnection(connection);
        }
        return list;
    }
}
