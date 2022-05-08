/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.calculadora;

import java.awt.event.ActionEvent;

/**
 *
 * @author alex.lopes
 */
public class Calculadora2 extends CalculadoraForm{

    @Override
    protected void btnFecharClick(ActionEvent ev) {
     this.setVisible(false);
     this.dispose();
    }

    @Override
    protected void btnLimparClick(ActionEvent ev) {
       txtCapital.setText("");
       txtTaxaJuros.setText("");
       txtPeriodo.setText("");
       txtMontante.setText("");
    }

    @Override
    protected void btnCalcularClick(ActionEvent ev) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
