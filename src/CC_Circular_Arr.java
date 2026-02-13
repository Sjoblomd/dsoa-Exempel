public class CC_Circular_Arr {

    public static void cirDays(String[] weekDays, int today, int daysForward) {
        int futureIndex = (today + daysForward) % weekDays.length;
        System.out.printf("Om %d dagar är det %s%n", daysForward, weekDays[futureIndex]);
    }
}
