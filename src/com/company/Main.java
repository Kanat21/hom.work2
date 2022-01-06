package com.company;

public class Main {

    public static void main(String[] args) {

            System.out.println(ufs(1, 6));
            System.out.println(ufs(2, 7));
            System.out.println(ufs(3, 8));
            System.out.println(ufs(4, 9));
            System.out.println(ufs(5, 10));
        }

        public static int ufs(int number, int temperrature) {
            int age = 45;
            int temperature = -20;

            if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
                System.out.println("Можно идти гулять");
            } else if (age < 20 && temperature > 0 && temperature < 28) {
                System.out.println("Можно идти гулять");
            } else if (age > 45 && temperature > -10 && temperature < 25) {
                System.out.println("Можно идти гулять");
            } else
                System.out.println("Оставайтесь дома");


            return age + temperature;
        }
        

}
