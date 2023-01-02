package com.company;

import java.util.Scanner;

public class GerenciarFuncionarios {
    public Fucionario funcionario;
    public GerenciarFuncionarios(){
        funcionario = new Fucionario();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int opc = 0;
	GerenciarFuncionarios gerenciar = new GerenciarFuncionarios();
	do{
        System.out.println("1.. Cadastrar Funcionario");
        System.out.println("2.. Fazer Reajuste");
        System.out.println("3.. Mostar Informação do Funcionario");
        System.out.println("9.. Finalizar");
        System.out.println("Digite sua opção: ");
    opc = Integer.parseInt(sc.nextLine());
    switch (opc){
        case 1:
            gerenciar.execCadastrar();
            break;
        case 2:
            gerenciar.execCalcularReajuste();
            break;
        case 3:
            gerenciar.execMostrarInfo();
            break;
        case 9:
            System.out.println("Fim do APP");
            break;
        default:
            System.out.println("Opçao invalida");
    }
    }while(opc !=9);

    }
    public void execMostrarInfo(){
        funcionario.MostrarInfo();
    }
    public void execCalcularReajuste(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o reajuste do funcionario");
        funcionario.setReajuste(Integer.parseInt(sc.nextLine()));
        System.out.println("o salario pos reajuste é:" + funcionario.CalcularReajuste());
    }
    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o Nome do Funcionario");
        funcionario.setName(sc.nextLine());
        System.out.println("Digite o salario do funcionario");
        funcionario.setSal(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite o cpf do funcionario");
        funcionario.setCpf(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a funcao do funcionario");
        funcionario.setFuncao(sc.nextLine());

    }
}
