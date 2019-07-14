public class Passenger{
    private int ticketid;
    private String name;
    private String gender;
    private String address;
    
    Passenger(int ticketid, String name, String gender, String address){
        this.ticketid = ticketid;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    public String toString(){
        return "ticketid: " + ticketid + ", name: " + name + ", gender: " + gender + ", address: " + address;
    }
}