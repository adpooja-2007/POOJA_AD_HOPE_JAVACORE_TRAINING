package DAY10;
class Locker {
    private int lockerid, lockerpin;
    private boolean islocked;
    private String[] items;
    public void setLockerid(int lockerid) {
        this.lockerid = lockerid;
    }
    public void setLockerpin(int lockerpin) {
        this.lockerpin = lockerpin;
    }
    public void setIslocked(boolean islocked) {
        this.islocked = islocked;
    }
    public void storeItems(String[] items, int lockerpin) {
        if (lockerpin == this.lockerpin) {
            this.items = items;
        } else {
            System.out.println("Invalid locker pin");
        }
    }
    public void retrieveItems(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            for (String item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Invalid locker pin");
        }
    }
    public void lock(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            islocked = true;
        } else {
            System.out.println("Invalid locker pin");
        }
    }
    public void unlock(int lockerpin) {
        if (lockerpin == this.lockerpin) {
            islocked = false;
        } else {
            System.out.println("Invalid locker pin");
        }
    }
    public int getLockerid() {
        return lockerid;
    }
    public boolean getIslocked() {
        return islocked;
    }
    public String[] getItems() {
        return items;
    }   
}

public class LockerSystem {
    public static void main(String[] args) {
        Locker locker = new Locker();
        locker.setLockerid(101);
        locker.setLockerpin(1234);
        locker.storeItems(new String[]{"Book", "Laptop"}, 1234);
        locker.lock(124);
        locker.unlock(1234);
        locker.retrieveItems(1234);
    }
}