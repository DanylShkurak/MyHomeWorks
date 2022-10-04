package homework8.entity;

public class Client {
    private  String surname;
    private String clientAccID;
    private String clientId;
    private float sum ;

    public Client() {
    }

    public Client(String surname, String clientAccID, String clientId, float sum) {
        this.surname = surname;
        this.clientAccID = clientAccID;
        this.clientId = clientId;
        this.sum = sum;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getClientAccID() {
        return clientAccID;
    }

    public void setClientAccID(String clientAccID) {
        this.clientAccID = clientAccID;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
}
