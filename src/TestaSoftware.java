import javax.swing.JOptionPane;

public class TestaSoftware {
    public static void main(String[] args) throws Exception {

    
        Object[] opcoesDeConversao = { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Unidades de Comprimento" };
        //Criei uma opção de valores para o menu "Escolha uma opção"

        Object conversorSelecionado = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesDeConversao, opcoesDeConversao[0]);
        //Criei uma caixa de diálogo para o usuário escolher a opção
        if (conversorSelecionado.equals("Conversor de Moeda")) {
            ConverteMoeda conversorMoeda = new ConverteMoeda();
            conversorMoeda.escolherMoeda();
            conversorMoeda.continuar();
        } else if(conversorSelecionado.equals("Conversor de Temperatura")){
            ConverteTemperatura conversorTemperatura = new ConverteTemperatura();
            conversorTemperatura.escolherTemperatura();
            conversorTemperatura.continuar();
        }else{
            ConverteMetros conversorMetros = new ConverteMetros();
            
        }

        


    }
}
