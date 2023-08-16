import javax.swing.*;
import java.util.Scanner;

public class Calculate2 {

    public static void main(String[] args) {

        String[] operacoes = {
                "Soma",
                "Subtração",
                "Multiplicação",
                "Divisão"

        };
        MyIcon icon = new MyIcon();
        String resp = (String) JOptionPane.showInputDialog(null, "Selecione a operação", "Operações", JOptionPane.PLAIN_MESSAGE, icon, operacoes, operacoes[0]);

        int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 1º número da operação: "));

        int l = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o 2º número da operação: "));


        if (resp.equals(operacoes[0])) {
            sum(i, l);
        } else if (resp.equals(operacoes[1])) {
            minus(i, l);
        } else if (resp.equals(operacoes[2])) {
            multiplication(i, l);
        } else if (resp.equals(operacoes[3])) {
            division(i, l);
        }

    }

    static void sum(int x, int y){
        int soma = (x + y);
        JOptionPane.showMessageDialog(null, soma);
    }

    static void minus(int x, int y){
        int minus = (x - y);
        JOptionPane.showMessageDialog(null, minus);
    }

    static void multiplication(int x, int y){
        int multiplication = (x * y);
        JOptionPane.showMessageDialog(null, multiplication);
    }

    static void division(int x, int y){
        int division = (x / y);
        JOptionPane.showMessageDialog(null, division);
    }
}
