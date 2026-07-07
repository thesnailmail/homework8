//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int[] objecti = new int[]{1, 2, 3};
        double[] objectd = {1.57, 7.654, 9.986};
        int[] objects = new int[3];
        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < 3; i++) {
            if (i == objecti.length - 1) {
                System.out.println(objecti[i]);
                break;
            }
            System.out.print(objecti[i] + ", ");
        }
        for (int i = 0; i < 3; i++) {
            if (i == objectd.length - 1) {
                System.out.println(objectd[i]);
                break;
            }
            System.out.print(objectd[i] + ", ");
        }
        for (int i = 0; i < 3; i++) {
            if (i == objects.length - 1) {
                System.out.println(objects[i]);
                break;
            }
            System.out.print(objects[i] + ", ");
        }
        //Задача 3
        System.out.println("Задача 3");
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(objecti[i]);
                break;
            }
            System.out.print(objecti[i] + ", ");
        }
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(objectd[i]);
                break;
            }
            System.out.print(objectd[i] + ", ");
        }
        for (int i = 2; i >= 0; i--) {
            if (i == 0) {
                System.out.println(objects[i]);
                break;
            }
            System.out.print(objects[i] + ", ");
        }
    }
}