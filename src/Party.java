import java.util.Date;

public class Party{
    String host;
    String location;
    Date date;

    public Party(String host, String location, Date date){
        this.date = date;
        this.host = host;
        this.location = location;
    }
}