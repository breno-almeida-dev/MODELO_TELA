/*
 * Para que os métodos executados no código sejam executados
 * é realizado o import das bibliotecas necessárias.
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*;

public class AWTTestSwing {
	public static void main(String[] args) {
		
		/*
		 * Primeiramente é realizada a instância do método "JFrame", que se trata
		 * de criar a janela principal que irá comportar outros container e components
		 * que irão ser utilizados na janela.
		 * 
		 * Logo em seguida é adicionado o método de fechamento da janela.
		 * 
		 * Para acomodar tudo na janela é definido através do "setSize" as
		 * dimensões que ela terá, sendo os valores informados em pixels.
		 * 
		 * E então o "setLayout" realiza a divisão da janela criada, divindo-as
		 * em regiões para que outros componentes possam ser direcionados quando
		 * adicionados.
		 */
		JFrame frame = new JFrame("AWT Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 200);
		frame.setLayout(new BorderLayout());
		
		
		/*
		 * Nesta parte é realizada a instância do componente de entrada da
		 * janela, com o seu nome sendo informado através do rótulo "JLabel".
		 * 
		 * Em seguida é determinado o tamanho que o bloco de entrada terá
		 * de comprimento.
		 */
		JLabel label1 = new JLabel("Label1");
		JTextField textField1 = new JTextField(15);
		
		
		/*
		 * Através do "JPanel" é criado um container para acomodar os componentes
		 * inseridos, sendo adicionado o rótulo e bloco de entrada criados.
		 */
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(label1);
		topPanel.add(textField1);
		
		
		/*
		 * Neste momento é intanciado três botões para serem utilizados.
		 */
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
		
		/*
		 * Mais uma vez é adicionado um container, mas dessa vez
		 * para acomodar os botões instanciados anteriormente.
		 */
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		
		
		/*
		 * Para organizar os containers criados é realizada a chamada dos
		 * setters de Layout que foram realizados dentro de cada container.
		 * Para que assim, através do "BorderLayout" que dividiu a janela em regiões,
		 * seja direcionado cada container que acomoda seus componentes.
		 */ 
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER);
		
		
		/*
		 * Por fim, é informado através do setter, para que seja exibido a janela
		 * para o usuário, enviado o valor como "true". 
		 */
		frame.setVisible(true);
	}
	
}
