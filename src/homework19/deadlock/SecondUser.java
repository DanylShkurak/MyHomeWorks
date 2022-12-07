package homework19.deadlock;

public class SecondUser {
    FirstUser firstUser ;



    public FirstUser getFirstUser() {
        return firstUser;
    }

    public void setFirstUser(FirstUser firstUser) {
        this.firstUser = firstUser;
    }
    public synchronized  Integer getNumber(){
        return 54321;
    }
    public synchronized String callFirstUser()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("First user is calling...");
        firstUser.getNumber();
        return "call is complete";
    }
}
