package com.company;

public class Fucionario {
    private String name;
    private double sal;
    private int reajuste;
    private int cpf;
    private String funcao;
    private double salatual;

    public double getSalatual() {
        return salatual;
    }

    public void setSalatual(double salatual) {
        this.salatual = salatual;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getReajuste() {
        return reajuste;
    }

    public void setReajuste(int reajuste) {
        this.reajuste = reajuste;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    public double CalcularReajuste(){
        salatual = sal+(sal*reajuste/100);
        salatual = sal;
       return  sal;
    }
    public void MostrarInfo(){
        System.out.println("O nome do funcionario é: " + name);
        System.out.println("O salario do funcionario é:" + sal);
        System.out.println("O cpf do funcionario é:" + cpf);
        System.out.println("A funcao do funcionario é:" + funcao);
    }

}
