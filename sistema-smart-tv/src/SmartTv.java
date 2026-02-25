public class SmartTv {
    private final int MAX_VOLUME = 10;
    private final int MIN_VOLUME = 0;

    private boolean on = false;
    private int volume = 5;
    private int channel = 0;

    public int getChannel() {
        return channel;
    }

    public String setChannel(int channel) {
        if (isOn()) {
            this.channel = channel;
            return ("CHANNEL: " + channel + " SETED");
        }
        return ("CHANNEL: " + channel + " NOT SETED");
    }

    public String riseVolume() {
        if (isOn()) {
            if (this.volume < MAX_VOLUME) {
                this.volume++;
                return ("VOLUME_RISED: " + this.volume);
            } else {
                return ("MAX_VOLUME: " + this.MAX_VOLUME);
            }
        }
        return ("");
    }

    public String decreaseVolume() {
        if (isOn()) {
            if (this.volume > MIN_VOLUME) {
                this.volume--;
                return ("VOLUME_DECREASED: " + this.volume);
            } else {
                return ("MUTED");
            }
        }
        return ("");
    }

    public void setOn_Off(boolean on) {
        this.on = on;
    }

    // Sei que a implementação fere o princípio DRY, porém como é algo pequeno, não quis usar JDP (JAVA DYNAMIC PROXY)
    private boolean isOn(){
        if (on) {
            System.out.println("ON");
            return true;
        } else {
            throw new IllegalStateException("TV OFF");
        }
    }
}
