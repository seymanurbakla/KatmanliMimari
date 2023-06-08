package business;
import core.loggin.Logger;
import dataAccess.Category.CategoryDao;
import entities.Category;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager {

    ArrayList<String> categoryList = new ArrayList<>();
    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void addCategory(Category category) throws Exception {
        for (String dongu:categoryList) {
            if(category.getName() == dongu){
                throw new Exception("Kategori ismi tekrar edemez.");
            }
            categoryDao.addCategory(category);
            for (Logger logger:loggers) {
                logger.log(category.getName());
            }

        }



    }

    public CategoryDao getCategoryDao() {
        return categoryDao;
    }

    public void setCategoryDao(CategoryDao categoryDao) {
        this.categoryDao = categoryDao;
    }

    public List<Logger> getLoggers() {
        return loggers;
    }

    public void setLoggers(List<Logger> loggers) {
        this.loggers = loggers;
    }
}
