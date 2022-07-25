public class Main {
    public static void main(String[] args) {

                int[] array = new int[30];

                for (int i = 0; i < array.length; i++) {
                    array[i] = ((int) (Math.random() * 100000) + 100000);
                    System.out.print(array[i] + "  ");
                }
                System.out.println();
                int max = array[0];
                int min = array[0];
                int avg = 0;
                int sum = 0;
                for (int j : array) {
                    sum = sum + j;
                    if (max < j)
                        max = j;
                    if (min > j)
                        min = j;
                    avg += j / array.length;
                }
                System.out.println("the amount of expenses for the month" + " " + "sum =" + sum + "rub");
                System.out.println("maximum cost per day" + " =" + max + "rub");
                System.out.println("minimum cost per day" + " =" + min + "rub");
                System.out.println("average cost per month" + " =" + avg + "rub");


                System.out.println();

                char[] reverseFullName =  {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
                for (int i = reverseFullName.length-1; i >= 0; i--)
                    System.out.print(reverseFullName[i]);


            }
        }

