package learnings.concepts.controlflow;

public class SwitchDemo {

//Switch Statement
//    public void checkDay(int day){
//        switch(day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default:
//                System.out.println("enter the valid day");
//        }
//    }

    public void checkDay(String day){
        String result = "";
        result = switch(day){
            case "Monday" : yield "Monday";
            case "Tuesday" : yield "Tuesday";
            default : yield "enter the valid day";
        };
        System.out.println(result);
    }
}

