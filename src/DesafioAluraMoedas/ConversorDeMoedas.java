package DesafioAluraMoedas;

import java.awt.Component;
import java.text.NumberFormat;
import java.util.Currency;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class ConversorDeMoedas {
	public ConversorDeMoedas(double valor, Moeda origem, Moeda destino ) {
		return;
		
	}

	public static double ConversorDeMoedas(int valor, Moeda origem, Moeda destino) {
		
		return 0;
	}
		
	}
		
	
public class DistanceRenderer extends DefaultListCellRenderer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
	     super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
	        Moeda valUnit = (Moeda) value;
	        setText(valUnit.getNome() + " - " + valUnit.getNomeCompleto());
	        	return this;
	}    
}


