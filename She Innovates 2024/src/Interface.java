import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Interface {
    private JFrame frame;
    private JPanel panel;
    private JButton btnSubmit;
    private JLabel lbResult;
    private JTextField tfInput;

    private Student student;

    // Constructor
    public Interface(Student student) {
        this.student = student;

        // Create the textfield to read input
        tfInput = new JTextField(30);
        tfInput.setBounds(10, 10, 240, 20);

        // Create the button to submit the value
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new btnSubmitAction(this));
        btnSubmit.setBounds(260, 10, 100, 20);

        // Create the label to display the result
        lbResult = new JLabel("Enter expense amount in $:");
        lbResult.setBounds(10, 40, 320, 20);

        // Create the panel to hold the button, label, and textfield
        panel = new JPanel(null);
        panel.add(btnSubmit);
        panel.add(lbResult);
        panel.add(tfInput);
        panel.setPreferredSize(new Dimension(370, 70));

        // Create the frame which is a window
        frame = new JFrame("Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public String getTextFieldInput() {
        return tfInput.getText();
    }

    public void setTextLabelResult(String s) {
        lbResult.setText(s);
    }

    public void updateBudget(double spentAmount) {

        double updatedBudget = student.budget() - spentAmount;
        setTextLabelResult("Remaining budget: $" + updatedBudget);

        if (spentAmount > updatedBudget) {
            System.out.println("WARNING: YOU HAVE EXCEEDED YOUR BUDGET!");
        }
    }
}

class btnSubmitAction implements ActionListener {
    private Interface gui;

    public btnSubmitAction(Interface gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = gui.getTextFieldInput();
        try {
            double spentAmount = Double.parseDouble(input);
            gui.updateBudget(spentAmount);
        } catch (NumberFormatException ex) {
            gui.setTextLabelResult("Invalid input. Please enter a valid number.");
        }
    }
}