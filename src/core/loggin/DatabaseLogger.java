package core.loggin;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Veritabanı loglandı." + data);
    }
}
