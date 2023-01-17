public class LandLine implements Phone{
    private String MyNum;
    private boolean isRinging;
    private boolean isPowerOn;

    public LandLine(String myNum) {
        this.MyNum = myNum;
        isRinging=false;
        isPowerOn=true;
    }

    public String getMyNum() {
        return MyNum;
    }

    public void setMyNum(String myNum) {
        MyNum = myNum;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    @Override
    public void powerOn() {
        this.isPowerOn=true;

    }

    @Override
    public void callNumber(String PhoneNo) {
        if(isPowerOn)
        {
            System.out.println("You are dialing the no :" +PhoneNo);
        }
        else {
            System.out.println("Your LandLine is Off");
        }

    }

    @Override
    public void receiveCall(String PhoneNo) {
        if(isPowerOn&&PhoneNo.equals(this.MyNum))
        {
            isRinging=true;
            System.out.println("you are getting a call");

        }
        else {
            System.out.println("call not received");
        }

    }

    @Override
    public boolean answerCall() {
        if(isRinging)
        {
            System.out.println("Call Answered");
            isRinging=false;
            return true;
        }
        return false;



    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
