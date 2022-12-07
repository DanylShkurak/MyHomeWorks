package homework19.deadlock;
public class FirstUser {
    SecondUser secondUser;

    public SecondUser getSecondUser() {
        return secondUser;
    }

    public void setSecondUser(SecondUser secondUser) {
        this.secondUser = secondUser;
    }

    public synchronized  Integer getNumber(){
        return 12345;
    }
    public synchronized String callSecondUser()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Second user is calling ...");
        secondUser.getNumber();
        return "call is complete";
    }
}