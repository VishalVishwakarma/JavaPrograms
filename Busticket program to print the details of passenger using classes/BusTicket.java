public class BusTicket{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person = new Person();
    float d;
    public void setTicketNo(int ticketNo){
        this.ticketNo = ticketNo;
    }
    public void setTicketPrice(float ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public void setTotalAmount(float totalAmount){
        this.totalAmount = totalAmount;
    }
    public int getTicketNo(){
        return this.ticketNo;
    }
    public float getTicketPrice(){
        return this.ticketPrice;
    }
    public float getTotalAmount(){
        calculateTotal();
        return this.totalAmount;
    }
    public Person getPerson(){
        return this.person;
    }
    public void setPerson(Person person){
        this.person = person;
    }
    public void calculateTotal(){

        if(person.getAge()<16){
            d=0.5f*ticketPrice;
        }
        else if(person.getAge() >= 60){
            d=0.25f*ticketPrice;
        }
        else if(person.getGender() == 'F' || person.getGender() == 'f'){
            d=0.1f*ticketPrice;
        }
        totalAmount = ticketPrice - d;
        
    }
}