package Tsi.Unix;

import asg.cliche.Command;

public class Calculator {

    @Command
    public int add(int a, int b){
        return a+b;
    }

    @Command
    public int sub(int a, int b){
        return a-b;
    }

    @Command
    public int mil(int a, int b){
        return a*b;
    }

    @Command
    public int div(int a, int b){
        return a/b;
    }
}
