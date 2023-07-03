import javax.swing.JOptionPane;

public class ValidaValor {

    

    public boolean validarValor(){
        
        String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);

        try {
            Double.parseDouble(insiraValor);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", 0);
            
        }

        return false;        
              
       
    }
    
}