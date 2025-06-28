package Encapsulation;

public class Bank {

    private String Name, Address;
    private long IFSC;


    public String getName() {
        return Name;
    }

    public String getAddress(){
        return Address;
    }

    public long getIFSC(){
        return IFSC;
    }

    public void setName(String name, String address){
        this.Name=name;
        this.Address=address;
    }

    public void setIFSC(long ifsc){

        this.IFSC=ifsc;
    }

    public static void main(String[] args) {
        Bank bank=new Bank();
        //System.out.println(bank.setName("SBI","Govandi"));
        bank.setName("SBI","Govandi");
        System.out.println(bank.getName());
        System.out.println(bank.getAddress());

    }
}
