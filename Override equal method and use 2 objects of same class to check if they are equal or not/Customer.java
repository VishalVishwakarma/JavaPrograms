public class Customer{
    private String name;
    private String panno;
    private String emailid;
    private int salary;

    Customer(String name, String panno, String emailid, int salary){
        this.name = name;
        this.panno = panno;
        this.emailid = emailid;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getPanno(){
        return panno;
    }

    public String getEmailid(){
        return emailid;
    }

    public int getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPanno(String panno){
        this.panno = panno;
    }

    public void setEmailid(String emailid){
        this.emailid = emailid;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public boolean equals(Object c1){
        Customer c = (Customer)c1;
        String pp = c.getPanno();
        String ee = c.getEmailid();
        if(pp.equals(this.getPanno()) && ee.equals(this.getEmailid()))
        return true;
        else
        return false;
    }


}