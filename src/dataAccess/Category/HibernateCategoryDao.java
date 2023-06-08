package dataAccess.Category;

import entities.Category;

public class HibernateCategoryDao implements CategoryDao{

    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernate ile veritabanına eklendi.");
    }
}
