package es.uah.matcomp.mp.e1.ejerciciosclases.MatCompMPEL1a;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    public int getHour() {
        return hour;}
    public void setHour(int hour) {
        this.hour = hour;}
    public int getMinute() {
        return minute;}
    public void setMinute(int minute) {
        this.minute = minute;}
    public int getSecond() {
        return second;}
    public void setSecond(int second) {
        this.second = second;}

    public void setTime(int newHour, int newMinute, int newSecond){
        this.hour=newHour;
        this.minute=newMinute;
        this.second=newSecond;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d", hour, minute, second );
    }
    public Time nextSecond(){
        second+=1;
        if (second>=60){
            second-=60;
            minute+=1;
        }
        if (minute>=60){
            minute -=60;
            hour+=1;
        }
        if (hour>=24){
            hour-=24;
        }
        return this;
    }
    public Time previousSecond(){
        second-=1;
        if (second<0){
            second+=60;
            minute-=1;
        }
        if (minute<0){
            minute +=60;
            hour-=1;
        }
        if (hour<0){
            hour+=24;
        }
        return this;
    }
}
