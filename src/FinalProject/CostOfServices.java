package FinalProject;

public class CostOfServices {
    // sedan
    final static int sedan_rooshooyi = 30;
    final static int sedan_nezafat = 15;
    final static int sedan_sefrshooyi = 80;

    //hatchback
    final static int hatchback_rooshooyi = 30;
    final static int hatchback_nezafat = 10;
    final static int hatchback_sefrshooyi = 70;

    //suv
    final static int suv_rooshooyi = 40;
    final static int suv_nezafat = 20;
    final static int suv_sefrshooyi = 100;

    public static int priceOfEachService (String carType, String service) {
        int priceOfEachService = 0;
        switch (carType) {
            case "sedan" -> {
                switch (service) {
                    case "rooshooyi" -> priceOfEachService = sedan_rooshooyi;
                    case "nezafat" -> priceOfEachService = sedan_nezafat;
                    case "sefrshooyi" -> priceOfEachService = sedan_sefrshooyi;
                    default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 51" + Color.ANSI_RESET);
                }
            }
            case "hatchback" -> {
                switch (service) {
                    case "rooshooyi" -> priceOfEachService = hatchback_rooshooyi;
                    case "nezafat" -> priceOfEachService = hatchback_nezafat;
                    case "sefrshooyi" -> priceOfEachService = hatchback_sefrshooyi;
                    default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 52" + Color.ANSI_RESET);
                }
            }
            case "suv" -> {
                switch (service) {
                    case "rooshooyi" -> priceOfEachService = suv_rooshooyi;
                    case "nezafat" -> priceOfEachService = suv_nezafat;
                    case "sefrshooyi" -> priceOfEachService = suv_sefrshooyi;
                    default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 53" + Color.ANSI_RESET);
                }
            }
            default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 5" + Color.ANSI_RESET);
        }
        return priceOfEachService;
    }
}
