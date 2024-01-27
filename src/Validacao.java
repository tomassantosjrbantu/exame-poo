import javax.swing.JOptionPane;

public class Validacao {
	
	public String validarString(String msg, int min , int max){
		String str = "";
        do {
            try {
                str = JOptionPane.showInputDialog(null, msg);
                if (str.length() < min || str.length() > max) {
                    JOptionPane.showMessageDialog(null, "NUMERO DE CARACTERES INVALIDO! DIGITE NOVAMENTE:");
                }
            } catch (Exception e) {

            }
        } while (str.length() < min || str.length() > max);

        return str;
	  }
	
	public static long validarLong(String msg, int min, int max) {
	     long numero = 0;
	     do {
	         try {
	        	 String str = JOptionPane.showInputDialog(null, msg);
	             numero = Long.parseLong(str);
	             if (numero < min || numero > max) {
	                JOptionPane.showMessageDialog(null, "ERRO! SELECCIONE SOMENTE UMA DAS QUATRO OPCOES");
	                }
	           } catch (Exception e) {

	           }
	        } while (numero < min || numero > max);

	     return numero;
	}
	
	public int validarInt(String msg, int min, int max) {
		int numero = 0;
		do {
			try {
				String str = JOptionPane.showInputDialog(null, msg);
				numero = Integer.parseInt(str);
				if(numero<min || numero>max) {
					JOptionPane.showMessageDialog(null,"ERRO! SELECCIONE SOMENTE UMA DAS QUATRO OPCOES");
				}
			}catch(Exception e) {
				
			}
		}while(numero<min || numero>max);
		
		return numero;
	}
	
	public double validarDouble(String msg, int min, int max) {
		double numero = 0;
		do {
			try {
				String str = JOptionPane.showInputDialog(null, msg);
				numero = Double.parseDouble(str);
				if(numero<min || numero>max) {
					JOptionPane.showMessageDialog(null,"ERRO! POR FAVOR, DIGITE NOVAMENTE O NUMERO:");
				}
			}catch(Exception e) {
				
			}
		}while(numero<min || numero>max);
		return numero;
	}
}
