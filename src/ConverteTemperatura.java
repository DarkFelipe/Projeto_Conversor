import javax.swing.JOptionPane;
//Foi pensando em converter apenas Celsius para as duas abaixo, pois estmaos no Brasil. 
//Caso necessário, podemos fazer a conversão reversa.
public class ConverteTemperatura {
    
    public void escolherTemperatura(){
        Object[] opcoesTemperatura = {"Celsius para Kelvin", "Celsius para Fahrenheit"};

        Object temperaturaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesTemperatura, opcoesTemperatura[0]);

        ValidaValor valida = new ValidaValor();
        valida.validarValor();

        if(temperaturaSelecionada == "Celsius para Kelvin"){
            Double celsiusKelvin = valida.getValor() + 273.0;
            Object valorConvertido = Double.toString(celsiusKelvin);
            JOptionPane.showMessageDialog(null, valorConvertido + " Kelvin(s)");
                    
        } else{
            double celsiusFahrenheit = (valida.getValor()*1.8) + 32;
            Object valorConvertido2 = Double.toString(celsiusFahrenheit);
            JOptionPane.showMessageDialog(null, valorConvertido2 + " Fahrenheit(s)");
        }
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

