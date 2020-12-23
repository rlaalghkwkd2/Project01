import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class New extends JPanel {
	private JTextField textNumber;
	private JTextField textProductName;
	private JTextField textQuantity;
	private JTextField textPrice;

	/**
	 * Create the panel.
	 */
	public New() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		panel.setLayout(null);
		
		textNumber = new JTextField();
		textNumber.setBounds(111, 10, 116, 21);
		panel.add(textNumber);
		textNumber.setColumns(10);
		
		JLabel lblNumber = new JLabel("\uC2DC\uB9AC\uC5BC\uB118\uBC84:");
		lblNumber.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblNumber.setBounds(24, 13, 99, 15);
		panel.add(lblNumber);
		
		JLabel lblproductName = new JLabel("\uC81C\uD488\uBA85:");
		lblproductName.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblproductName.setBounds(24, 61, 62, 15);
		panel.add(lblproductName);
		
		textProductName = new JTextField();
		textProductName.setColumns(10);
		textProductName.setBounds(111, 58, 116, 21);
		panel.add(textProductName);
		
		JLabel lblSize = new JLabel("\uC0AC\uC774\uC988");
		lblSize.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblSize.setBounds(24, 106, 62, 15);
		panel.add(lblSize);
		
		JTextField textSize = new JTextField();
		textSize.setColumns(10);
		textSize.setBounds(111, 103, 116, 21);
		panel.add(textSize);
		
		JLabel lblQuantity = new JLabel("\uC218\uB7C9");
		lblQuantity.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblQuantity.setBounds(24, 148, 62, 15);
		panel.add(lblQuantity);
		
		JLabel lblPrice = new JLabel("\uAC00\uACA9");
		lblPrice.setFont(new Font("휴먼편지체", Font.PLAIN, 17));
		lblPrice.setBounds(24, 190, 62, 15);
		panel.add(lblPrice);
		
		textQuantity = new JTextField();
		textQuantity.setColumns(10);
		textQuantity.setBounds(111, 145, 116, 21);
		panel.add(textQuantity);
		
		textPrice = new JTextField();
		textPrice.setColumns(10);
		textPrice.setBounds(111, 187, 116, 21);
		panel.add(textPrice);
		
		JButton btnInput = new JButton("\uB4F1\uB85D");
		btnInput.setBounds(341, 267, 97, 23);
		panel.add(btnInput);

	}
}
