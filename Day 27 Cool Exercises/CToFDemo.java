import java.awt.*;
import java.awt.event.*;

class CToFDemo extends Frame implements TextListener {

	Panel panel = new Panel();
	TextField c = new TextField("0", 20);
	TextField f = new TextField("0", 20);

	CToFDemo() {
		setSize(600, 600);
		setTitle("CToFDemo");
		setLocation(700, 50);
		setLayout(new FlowLayout());

		panel.setLayout(new GridLayout(2, 3));
		panel.add(new Label("Enter Celcius : "));

		panel.add(c);
		panel.add(new Label("C"));
		c.addTextListener(this);

		panel.add(new Label("Farheneit : "));
		panel.add(f);
		panel.add(new Label("F"));
		// f.addTextListener(this);

		add(panel);
		f.setEnabled(false);

	}

	@Override
	public void textValueChanged(TextEvent e) {

		Object obj = e.getSource();
		TextField temp = (TextField) obj;
		String temperature = temp.getText().equals("") ? "0" : temp.getText();
		Double celc = Double.parseDouble(temperature);
		celc += 10;
		f.setText("" + celc);

	}

	public static void main(String[] args) {
		CToFDemo frameObject = new CToFDemo();
		frameObject.setVisible(true);

	}
}