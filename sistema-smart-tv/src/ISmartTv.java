public interface ISmartTv {

    int getChannel();
    String setChannel(int channel);
    String riseVolume();
    String decreaseVolume();
    void setOn_Off(boolean on);
    boolean isOn();
}