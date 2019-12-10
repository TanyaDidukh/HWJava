/**
 * Describes enum contains 12 months
 */
public enum Months {
    JANUARY(31, Season.WINTER),
    FEBRUARY (28,Season.WINTER),
    MARCH(31,Season.SPRING),
    APRIL(30,Season.SPRING),
    MAY(31,Season.SPRING),
    JUNE(30,Season.SUMMER),
    JULY(31,Season.SUMMER),
    AUGUST(31,Season.SUMMER),
    SEPTEMBER(30,Season.FALL),
    OCTOBER(31,Season.FALL),
    NOVEMBER(30,Season.FALL),
    DECEMBER(31,Season.WINTER);

    private int days;
    private Season season;

    /**
     * constructor Months
     * @param days - day amount
     * @param season - season from Enum Season
     */
    Months(int days, Season season) {
        this.days = days;
        this.season = season;

    }

    public int getDays() {
        return days;
    }
    public Season getSeason() {
        return season;
    }
}
