package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double max = firstSide;
        if(secondSide>max)
            max = secondSide;
        if(thirdSide>max)
            max = thirdSide;
        if((max == firstSide && firstSide<secondSide+thirdSide) ||
                (max == secondSide && secondSide< firstSide+ thirdSide) ||
                (max == thirdSide && thirdSide < firstSide+ secondSide))
            System.out.println("this is a valid triangle");
        else
            System.out.println("it's not a triangle");
    }
}
