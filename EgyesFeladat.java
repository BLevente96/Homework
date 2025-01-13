public class EgyesFeladat {
    public static void main(String[] args) {

        boolean isTravelingAlone = true;
        boolean isOnBusinessTrip = true;
        boolean isToEurope = true;
        boolean isForSport = true;
        int age = 18;
        boolean isHadAccident = false;

        boolean isTrueOne = isTravelingAlone && isOnBusinessTrip && isToEurope;
        boolean isTrueTwo = isForSport && age >= 18 && !isHadAccident;

        System.out.println("The person is eligible for insurance 1: " + isTrueOne);
        System.out.println("The person is eligible for insurance 2: " + isTrueTwo);


        boolean isSoloTravel = true;
        boolean isFamilyTravel = false;
        boolean hasAccidentHistory = false;
        boolean isBeachVacation = false;
        boolean isCityTour = false;
        boolean isEuropeanCountry = false;

        boolean eligibility = checkEligibility(isSoloTravel, isFamilyTravel, hasAccidentHistory, isBeachVacation, isCityTour, isEuropeanCountry);
        System.out.println("Travel eligibility: " + eligibility);
    }

    public static boolean checkEligibility(boolean isSoloTravel, boolean isFamilyTravel, boolean hasAccidentHistory, boolean isBeachVacation, boolean isCityTour, boolean isEuropeanCountry) {
        if (isSoloTravel) {
            return true;
        } else if (isFamilyTravel && isBeachVacation && !hasAccidentHistory) {
            return true;
        } else if (isCityTour && (isEuropeanCountry || (!isEuropeanCountry && !hasAccidentHistory))) {
            return true;
        }
        return false;
    }

}
