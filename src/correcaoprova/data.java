/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correcaoprova;

/**
 *
 * @author emilly
 */
public class data {
     private int dia;
    private int mes;
    private int ano;

    public void getmostrar() {

        System.out.println(dia);
        System.out.println(mes);
        System.out.println(ano);
    }

    public int getdia() {
        return this.dia;
    }

    public int getmes() {
        return this.mes;
    }

    public int getano() {
        return this.ano;
    }

    public void setdia(int d) {
        this.dia = d;
    }

    public void setmes(int m) {
        this.mes = m;
    }

    public void setano(int a) {
        this.ano = a;
    }
}
    
