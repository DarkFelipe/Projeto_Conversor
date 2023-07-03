import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class ConverteMoeda {
    
    public void escolherMoeda(){
        Object[] opcoesMoedas = { "De Reais a Dólares","De Reais a Euros", "De Reais a Libras", "De Reais a peso Argentino", 
        "De Reais a Peso Chileno", "De Dólares a Reais","De Euros a Reais","De Libras a reais", 
        "De Peso Argentino a Reais", "De Peso Chileno a Reais"};
        //criei as opções de moedas.
        //provavelmente terei que fazer um IF ELSE para as outras opções de conversão

        Object moedaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesMoedas, opcoesMoedas[0]);
        //Criei uma caixa de diálogo para o usuário escolher a opção 
        
        ValidaValor valida = new ValidaValor();
        valida.validarValor();
    
    }

    public boolean continuar(){
        int continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?",  
        null, JOptionPane.YES_NO_CANCEL_OPTION, 3);
                 
        if(continua == JOptionPane.YES_OPTION){
            escolherMoeda();
            continuar();
            return true;
        }      
                
        return false;
        

    }

    

}
