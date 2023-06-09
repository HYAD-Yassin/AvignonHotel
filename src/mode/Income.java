package mode;

public class Income {
    private String month;
    private double roomCgh;

    private double serviceCgh;
    private double monthAll;
    private double yearAll;


    public Income(String text, double v,  double aDouble) {
        this.month=text;
        this.roomCgh=v;

        this.serviceCgh=aDouble;
    }

    public Income(String month, double roomCgh, double serviceCgh, double monthAll, double yearAll) {
        this.month = month;
        this.roomCgh = roomCgh;

        this.serviceCgh = serviceCgh;
        this.monthAll = monthAll;
        this.yearAll = yearAll;
    }


    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public double getRoomCgh() {
        return roomCgh;
    }

    public void setRoomCgh(double roomCgh) {
        this.roomCgh = roomCgh;
    }



    public double getServiceCgh() {
        return serviceCgh;
    }

    public void setServiceCgh(double serviceCgh) {
        this.serviceCgh = serviceCgh;
    }
    public double getMonthAll() {
        return monthAll;
    }

    public void setMonthAll(double monthAll) {
        this.monthAll = monthAll;
    }

    public double getYearAll() {
        return yearAll;
    }

    public void setYearAll(double yearAll) {
        this.yearAll = yearAll;
    }

    @Override
    public String toString() {
        return "Income{" +
                "month='" + month + '\'' +
                ", roomCgh=" + roomCgh +
                ", serviceCgh=" + serviceCgh +
                ", monthAll=" + monthAll +
                ", yearAll=" + yearAll +
                '}';
    }
}
