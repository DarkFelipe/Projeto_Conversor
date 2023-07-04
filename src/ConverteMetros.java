import javax.swing.JOptionPane;

public class ConverteMetros {

     public void escolherUnidade(){
        Object[] opcoesUnidade = {"Metros para quilômetros", "Metros para centímetros", "Metros para milímetros"};

        Object unidadeSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesUnidade, opcoesUnidade[0]);

        ValidaValor valida = new ValidaValor();
        valida.validarValor();

        if(unidadeSelecionada == "Metros para quilômetros"){
            Double metrosKm = valida.getValor()/1000;
            Object valorConvertido = Double.toString(metrosKm);
            JOptionPane.showMessageDialog(null, "O valor em quilômetros é: " + valorConvertido + " km");
                    
        } else if (unidadeSelecionada == "Metros para centímetros"){
            double metroCm = valida.getValor()*100;
            Object valorConvertido2 = Double.toString(metroCm);
            JOptionPane.showMessageDialog(null, "O valor em centímetros é: " + valorConvertido2 + " cm");
        } else {
            double metroMm = valida.getValor()*100;
            Object valorConvertido3 = Double.toString(metroMm);
            JOptionPane.showMessageDialog(null, "O valor em milímetros é: " + valorConvertido3 + " mm");
        }
    }

    public boolean continuar(){
        int continua = JOptionPane.showConfirmDialog(null, "Deseja realizar outra conversão?",  
        null, JOptionPane.YES_NO_CANCEL_OPTION, 3);
                 
        if(continua == JOptionPane.YES_OPTION){
            escolherUnidade();
            continuar();
            return true;
        }      
                
        return false;
        

    }
}