package practice7.cost_counter;

import java.util.ArrayList;

public class CostCounter {

    /*Перед тем как приступить к кодированию, мы следовали алгоритму выбора структуры данных:
Определили тип данных (уникальность, упорядоченность, иерархия и связи).
Определили основные операции (поиск, вставка, удаление, обновление).
Оценили частоту операций (какая операция должна быть самой быстрой).
Учли ограничения (память, скорость выполнения, необходимость сортировки).
Выбрали наилучшую структуру данных для решения задачи.*/

    //array, index = month num
    private ArrayList<Double> costsPerMonth;
    public CostCounter (){
        this.costsPerMonth =  new ArrayList<>();
    }

    //Method to add costs per month index
    public void addCostsPerMonth(int monthNum, Double amount){
        costsPerMonth.add(monthNum-1, amount);
    }

    //method to get month expenses by index
    public Double getCostsByMonth(int month){
        return costsPerMonth.get(month-1);
    }

    //Method to get min expenses per month
    public void getMinimumMonthlyExpenses(){
       double min = costsPerMonth.get(0);

        for (int i = 1; i < costsPerMonth.size(); i++) {
            if (costsPerMonth.iterator().hasNext()) {
                if (costsPerMonth.get(i) < min) {
                    min = costsPerMonth.get(i);
                }
            }
        }

        System.out.println("Minimum Monthly Expenses: " + min);
    }


    public static void main(String[] args) {
        CostCounter cC = new CostCounter();
        cC.addCostsPerMonth(1, 56224.0);
        cC.addCostsPerMonth(2, 5651.0);
        cC.addCostsPerMonth(3, 52.0);
        cC.addCostsPerMonth(4, 562.0);
        cC.addCostsPerMonth(5, 56211.0);

        System.out.println(cC.getCostsByMonth(2));

        cC.getMinimumMonthlyExpenses();
    }
}
