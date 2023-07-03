import javax.swing.JOptionPane;

public class ConverteTemperatura {
    
    public void escolherTemperatura(){
        Object[] opcoesTemperatura = {"Celsius para Kelvin", "Celsius para Fahrenheit"};

        Object temperaturaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesTemperatura, opcoesTemperatura[0]);

        ValidaValor valida = new ValidaValor();
        valida.validarValor();
    }

    public boolean continuar(){
        int continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?",  
        null, JOptionPane.YES_NO_CANCEL_OPTION, 3);
                 
        if(continua == JOptionPane.YES_OPTION){
            escolherTemperatura();
            continuar();
            return true;
        }      
                
        return false;
        

    }
}

