package odys.com.data;

public class Magazine extends Publication {
    private int month;
    private int day;
    private String language;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year, int month, int day) {
        this.setTitle(title);
        this.setPublisher(publisher);
        this.setLanguage(language);
        this.setYear(year);
        this.setMonth(month);
        this.setDay(day);
    }

    public void printInfo() {
        String info = getTitle() + "; " + getPublisher() + "; " + getLanguage() + "; " + getYear() + "; " + getMonth()
                + "; " + getDay();
        System.out.println(info);
    }
}
