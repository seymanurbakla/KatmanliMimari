package dataAccess.Category;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

    @Override
    public void addCategory(Category category) {
        System.out.println("Jdbc ile veritabanına eklendi.");
    }
}
