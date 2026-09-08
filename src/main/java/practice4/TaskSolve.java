package practice4;

public class TaskSolve {

    // if else operators

    public String checkParity( int num){
        String result = (num % 2 == 0) ? "Четное" : "Нечетное";
        return result;
    }

    public String dasdd(int num){
        String res = (num > 10) ? "sadsad" : "sadaffafg";
        return res;
    }

    public int maxNum(int a, int b, int c){
        int bigestNum = a;
        if (a < b){
            bigestNum = b;
        }else if (bigestNum < c) {
            bigestNum = c;
        }
        return bigestNum;
    }

    //switch operator

    public String dayOfWeek(int day){
        String dayOfWeek = "";
        switch (day){
            case 1:
                dayOfWeek = "Monday";
                break;
            case 2:
                dayOfWeek = "Tuesday";
                break;
            case 3:
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("Wrong input");
        }
        return dayOfWeek;
    }

    public String describeSeasone(Season s){
        String description = "";
        switch (s){
            case WINTER -> description = "holodno";
            case AUTUMN -> description = "listya";
            case SPRING -> description = "dozhd";
            case SUMMER -> description = "solnce";
        }
        return description;
    }

    //for operator

    public void numMultiplication(int num){
        for (int i = 1; i<=10; i++){
            System.out.println( num + " * " + i + " = " + num * i);
        }
    }



    public static void main(String[] args) {
        TaskSolve ts = new TaskSolve();
        System.out.println(ts.maxNum(7,3,10));
        System.out.println(ts.maxNum(7,2,3));
        System.out.println(ts.maxNum(1,33,10));

        System.out.println(ts.dayOfWeek(6));
        System.out.println(ts.dayOfWeek(10));

        System.out.println(ts.describeSeasone(Season.WINTER));

        ts.numMultiplication(3);

    }
}
