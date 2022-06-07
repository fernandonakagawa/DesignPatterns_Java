/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositedemo;

import java.util.ArrayList;
import java.util.List;

public class Empregado {

    private String nome;
    private String dept;
    private int salario;
    private ArrayList<Empregado> subordinados;
// constructor

    public Empregado(String nome, String dept, int sal) {
        this.nome = nome;
        this.dept = dept;
        this.salario = sal;
        subordinados = new ArrayList<Empregado>();
    }

    public void add(Empregado e) {
        subordinados.add(e);
    }

    public void remove(Empregado e) {
        subordinados.remove(e);
    }

    public ArrayList<Empregado> getSubordinates() {
        return subordinados;
    }

    public String toString() {
        return ("Empregado :[ Nome : " + nome
                + ", departamento : " + dept + ", salario :"
                + salario + " ]");
    }
}
