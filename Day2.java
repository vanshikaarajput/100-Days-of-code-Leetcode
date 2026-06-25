// Day 2
// LeetCode 1344 - Angle Between Hands of a Clock
// Date: 18.06.2026
//litle modif. 


class Day2{
    public double angleClock(int hour, int minutes){
        double hourAngle = (hour % 12 + minutes / 60.0) * 30;
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        return Math.min(angle, 360 - angle);
    }
}
