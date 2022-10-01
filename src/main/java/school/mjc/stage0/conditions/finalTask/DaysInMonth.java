package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leap = false;
        if(year<0)
        {
            System.out.println("invalid date");
            return;
        }
        switch (year%4)
        {
            case 0:
                if(year%100==0&&year%400!=0)
                    leap = false;
                else
                    leap = true;
                break;
            default:
                leap = false;
        }
        switch (month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;
            case 2:
                if(leap)
                    System.out.println(29);
                else
                    System.out.println(28);
                break;
            default:
                System.out.println("invalid date");
        }
    }
}
