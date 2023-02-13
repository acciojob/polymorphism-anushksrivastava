package com.driver;

public class Main {

    public static class Product{
        public int product(int x,int y)
        {
            return x*y;
        }

        public int product(int x,int y,int z)
        {
            return x*y*z;
        }

        public double product(double x,double y)
        {
            return x*y;
        }
    }

    public static void main(String[] args)
    {
        Product p1=new Product();
        p1.product(3,4);
        p1.product(5,6,7);
        p1.product(5.8,8.5);
    }
}