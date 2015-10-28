
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.SystemColor;

public class AboutStudentRecordDatabase extends JDialog
{

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		try
		{
			AboutStudentRecordDatabase dialog = new AboutStudentRecordDatabase();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public AboutStudentRecordDatabase()
	{
		setBounds(100, 100, 221, 119);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JTextPane txtpnAuthorMattGillis = new JTextPane();
		txtpnAuthorMattGillis.setBackground(SystemColor.control);
		txtpnAuthorMattGillis.setText("Author: Matt Gillis");
		txtpnAuthorMattGillis.setBounds(46, 11, 103, 20);
		contentPanel.add(txtpnAuthorMattGillis);
		
		JTextPane txtpnProjectStudentRecord = new JTextPane();
		txtpnProjectStudentRecord.setBackground(SystemColor.control);
		txtpnProjectStudentRecord.setText("Project: Student Record Database");
		txtpnProjectStudentRecord.setBounds(10, 32, 176, 20);
		contentPanel.add(txtpnProjectStudentRecord);
		
		JTextPane txtpnDate = new JTextPane();
		txtpnDate.setBackground(SystemColor.control);
		txtpnDate.setText("Date: 10/22/15");
		txtpnDate.setBounds(46, 52, 103, 20);
		contentPanel.add(txtpnDate);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
