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
        super(year, title, publisher);
        this.setLanguage(language);
        this.setMonth(month);
        this.setDay(day);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "month=" + month +
                ", day=" + day +
                ", language='" + language + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Magazine magazine = (Magazine) o;

        if (getMonth() != magazine.getMonth()) return false;
        if (getDay() != magazine.getDay()) return false;
        return getLanguage() != null ? getLanguage().equals(magazine.getLanguage()) : magazine.getLanguage() == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getMonth();
        result = 31 * result + getDay();
        result = 31 * result + (getLanguage() != null ? getLanguage().hashCode() : 0);
        return result;
    }
}
