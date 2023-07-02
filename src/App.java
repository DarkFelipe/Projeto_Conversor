import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    
        Object[] opcoesDeConversao = { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Unidades de Comprimento" };
        //Criei uma opção de valores para o menu "Escolha uma opção"

        Object conversorSelecionado = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesDeConversao, opcoesDeConversao[0]);
        //Criei uma caixa de diálogo para o usuário escolher a opção

        String insiraValor = JOptionPane.showInputDialog(null, "Insira um valor", "Valor", 3);
        //criei uma caixa de diálogo para o usuário inserir um valor. 
        //Tenho que pegar esse valor e converter para double e armezanar em outra variável

        Object[] opcoesMoedas = { "De Reais a Dólares","De Reais a Euros", "De Reais a Libras", "De Reais a peso Argentino", 
        "De Reais a Peso Chileno", "De Dólares a Reais","De Euros a Reais","De Libras a reais", 
        "De Peso Argentino a Reais", "De Peso Chileno a Reais" };
        //criei as opções de moedas.
        //provavelmente terei que fazer um IF ELSE para as outras opções de conversão

        Object moedaSelecionada = JOptionPane.showInputDialog(null, "Escolha uma opção", "Input",
        JOptionPane.INFORMATION_MESSAGE, null,opcoesMoedas, opcoesMoedas[0]);
        //Criei uma caixa de diálogo para o usuário escolher a opção









    }
}
