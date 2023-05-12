package hostel.app.model;

public class Reservation {
    private Date reservationDate;
    private Date chekinDate;
    private Date checkoutDate;
    public Reservation(){

    }
    public  Reservation(Date checkinDate, Date checkoutDate){
        this.chekinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }
    public Date getReservationDate(){
        return reservationDate;
    }
    public void setReservationDate(Date reservationDate){
        this.reservationDate = reservationDate;
    }
    public Date getChekinDate(){
        return chekinDate;
    }
    public void setChekinDate(Date chekinDate){
        this.chekinDate = chekinDate;
    }
    public Date getCheckoutDate(){
        return checkoutDate;
    }
    public void setCheckoutDate(Date checkoutDate){
        this.checkoutDate = checkoutDate;
    }
    @Override
    public String toString() {
        return "Reservation{" +
                "reservationDate=" + reservationDate +
                ", checkinDate=" + chekinDate +
                ", checkoutDate=" + checkoutDate +
                '}';
    }
}
