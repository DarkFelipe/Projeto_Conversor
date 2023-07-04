import javax.sound.sampled.SourceDataLine;
import javax.swing.JOptionPane;

public class ConverteMoeda {
    
    public void escolherMoeda(){
        Object[] opcoesMoedas = { "De Reais a Dólares","De Reais a Euros", "De Reais a Libras", "De Reais a peso Argentino", 
        "De Reais a Peso Chileno", "De Dólares a Reais","De Euros a Reais","De Libras a Reais", 
        "De Peso Argentino a Reais", "De Peso Chileno a Reais"};
        //criei as opções de moedas.
        //provavelmente terei que fazer um IF ELSE para as outras opções de conversão

        Object moedaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesMoedas, opcoesMoedas[0]);
        //Criei uma caixa de diálogo para o usuário escolher a opção 
        
        ValidaValor valida = new ValidaValor();
        valida.validarValor();

        ValoresMoeda moeda = new ValoresMoeda();

        if(moedaSelecionada == "De Reais a Dólares"){
            double realDolar = valida.getValor()/moeda.getDolar();
            Object str = String.format("%.2f", realDolar);
            JOptionPane.showMessageDialog(null, "O valor em dólares é: "+ str, "Conversão", 1);
        } else if (moedaSelecionada == "De Reais a Euros"){
            double realEuro = valida.getValor()/moeda.getEuro();
            Object str1 = String.format("%.2f", realEuro);
            JOptionPane.showMessageDialog(null, "O valor em euros é: "+ str1, "Conversão", 1);
        } else if (moedaSelecionada == "De Reais a Libras"){
            double realLibra = valida.getValor()/moeda.getLibra();
            Object str2 = String.format("%.2f", realLibra);
            JOptionPane.showMessageDialog(null, "O valor em libras é: "+ str2, "Conversão", 1);
        } else if (moedaSelecionada == "De Reais a Peso Argentino"){
            double realArgentino = valida.getValor()/moeda.getPesoArgentino();
            Object str3 = String.format("%.2f", realArgentino);
            JOptionPane.showMessageDialog(null, "O valor em pesos argentinos é: "+ str3, "Conversão", 1);
        } else if (moedaSelecionada == "De Reais a Peso Chileno"){
            double realChileno = valida.getValor()/moeda.getPesoChileno();
            Object str4 = String.format("%.2f", realChileno);
            JOptionPane.showMessageDialog(null, "O valor em pesos chilenos é: "+ str4, "Conversão", 1);
        } else if (moedaSelecionada == "De Dólares a Reais") {
            double dolarReal = valida.getValor()*moeda.getDolar();
            Object str5 = String.format("%.2f", dolarReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: "+ str5, "Conversão", 1);
        } else if (moedaSelecionada == "De Euros a Reais") {
            double euroReal = valida.getValor()*moeda.getEuro();
            Object str6 = String.format("%.2f", euroReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: "+ str6, "Conversão", 1);
        } else if (moedaSelecionada == "De Libras a Reais") {
            double libraReal = valida.getValor()*moeda.getLibra();
            Object str7 = String.format("%.2f", libraReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: "+ str7, "Conversão", 1);
        } else if (moedaSelecionada == "De Peso Argentino a Reais") {
            double argentinoReal = valida.getValor()*moeda.getPesoArgentino();
            Object str8 = String.format("%.2f", argentinoReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: "+ str8, "Conversão", 1);
        }else {
            double chilenoReal = valida.getValor()*moeda.getPesoChileno();
            Object str9 = String.format("%.2f", chilenoReal);
            JOptionPane.showMessageDialog(null, "O valor em reais é: "+ str9, "Conversão", 1);
        }
        
    
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
