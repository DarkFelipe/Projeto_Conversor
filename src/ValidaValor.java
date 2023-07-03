import javax.swing.JOptionPane;

public class ValidaValor {

    String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);

    public boolean validarValor(String insiraValor){
        
        //double valor = Double.parseDouble(insiraValor);

        try {
            Double.parseDouble(insiraValor);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", 0);
            
        }

        return false;        
              
       
    }
    
}

/* try {
            String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);
            double valor = Double.parseDouble(insiraValor);
            return true;
            //criei uma caixa de diálogo para o usuário inserir um valor. 
           //Tenho que pegar esse valor e converter para double e armezanar em outra variável
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", 0);
            
                   
        }
        
        return false; // fiz o tratamento de exceções, porém preciso voltar para a parte inicial do valor, não seguir em frente. */





/* 
try {
            String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);
            double valor = Double.parseDouble(insiraValor);
            //criei uma caixa de diálogo para o usuário inserir um valor. 
           //Tenho que pegar esse valor e converter para double e armezanar em outra variável
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Insira somente números", "Erro", 0);
                   
        } // fiz o tratamento de exceções, porém preciso voltar para a parte inicial do valor, não seguir em frente. */