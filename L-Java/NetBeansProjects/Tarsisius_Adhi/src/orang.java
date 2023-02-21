
/**
 * Write a description of class person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class orang
{
    /**
     * @param name menginisialkan untuk mengisi nama 
     * @param age menginisialkan untuk mengisi umur
     * @param address menginisialkan untuk mengisi tempat tinggal
     * @param phone menginisialkan unruk mengisi nomor telpon
     */public orang (String n,int ag,String ad, String p){
            name= n; age= ag; address= ad; phone=p;
    }
    /**
     * getName untuk mengambil nama 
     * return untuk mengembalikan nilai nama 
     */public String getName() {
        return name;
    }
    /**
     * getAge untuk mengambil umur
     * return untuk mengembalikan nilai umur 
     * 
     */public int getAge(){
        return age;
    }
    /**
     * getAddress untuk mengambil alamat
     * return untuk mengembalikan nilai alamat
     */public String getAddress(){
        return address;
    }
    /**
     * getPhone untuk mengambil nomor
     * return untuk mengembalikan nilai nomor
     */public String getPhone(){
        return phone ;
    }
    /**
     * void setAddress untuk mengubah alamat
     */public void setAddress(String newAddress){
        address = newAddress;
    }
    /**
     * void setPhone untuk mengubah nomor telpon
     */public void setPhone(String newPhone){
        address = newPhone;
    }
    public String toString () {
            return getName()+""+getAge()+""+getPhone();
    }
    
    
    private String name;
    private int age;
    private String address;
    private String phone;
    
    
}
