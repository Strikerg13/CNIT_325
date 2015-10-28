//This has been changed.

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentRecordDatabase extends JFrame
{

	private JPanel contentPane;
	private JTextField txtFirstName;
	private JTextField txtMiddleInitial;
	private JTextField txtLastName;
	private JTextField txtPUID;
	private JTextField txtAddress;
	private JTextField txtState;
	
	private String studentType = "";
	Undergrad undergrad = new Undergrad();
	Graduate grad = new Graduate();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					StudentRecordDatabase frame = new StudentRecordDatabase();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentRecordDatabase()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 700);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnNew = new JMenu("New");
		mnFile.add(mnNew);
		
		JMenuItem mntmUndergrad = new JMenuItem("UnderGrad");
		mnNew.add(mntmUndergrad);
		
		JMenuItem mntmGraduate = new JMenuItem("Graduate");
		mnNew.add(mntmGraduate);
		
		JMenuItem mntmNondegree = new JMenuItem("Non-Degree");
		mnNew.add(mntmNondegree);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenuItem mntmClear = new JMenuItem("Clear");				// Clear Menu Button
		
		mnFile.add(mntmClear);
		
		
		
		JMenuItem menuItem = new JMenuItem("");
		mnFile.add(menuItem);
		
		JMenuItem mntmExit = new JMenuItem("Exit");				// Exit Menu Button
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnQuery = new JMenu("Query");
		menuBar.add(mnQuery);
		
		JMenuItem mntmEnter = new JMenuItem("Enter");
		mnQuery.add(mntmEnter);
		
		JMenuItem mntmExecute = new JMenuItem("Execute");
		mnQuery.add(mntmExecute);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");			// About Menu Button
		mntmAbout.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) 
			{
				AboutStudentRecordDatabase aboutPane = new AboutStudentRecordDatabase();
				aboutPane.show();
			}
		});
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtFirstName = new JTextField();
		txtFirstName.setEnabled(false);
		txtFirstName.setBounds(129, 16, 146, 26);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JTextPane txtpnFirstName = new JTextPane();
		txtpnFirstName.setEditable(false);
		txtpnFirstName.setBackground(SystemColor.control);
		txtpnFirstName.setText("First Name:");
		txtpnFirstName.setBounds(15, 16, 88, 26);
		contentPane.add(txtpnFirstName);
		
		txtMiddleInitial = new JTextField();
		txtMiddleInitial.setEnabled(false);
		txtMiddleInitial.setColumns(10);
		txtMiddleInitial.setBounds(129, 58, 39, 26);
		contentPane.add(txtMiddleInitial);
		
		JTextPane txtpnMiddleInitial = new JTextPane();
		txtpnMiddleInitial.setEditable(false);
		txtpnMiddleInitial.setBackground(SystemColor.control);
		txtpnMiddleInitial.setText("Middle Initial:");
		txtpnMiddleInitial.setBounds(15, 58, 110, 26);
		contentPane.add(txtpnMiddleInitial);
		
		txtLastName = new JTextField();
		txtLastName.setEnabled(false);
		txtLastName.setColumns(10);
		txtLastName.setBounds(129, 100, 146, 26);
		contentPane.add(txtLastName);
		
		JTextPane txtpnLastName = new JTextPane();
		txtpnLastName.setEditable(false);
		txtpnLastName.setBackground(SystemColor.control);
		txtpnLastName.setText("Last Name:");
		txtpnLastName.setBounds(15, 100, 88, 26);
		contentPane.add(txtpnLastName);
		
		txtPUID = new JTextField();
		txtPUID.setEnabled(false);
		txtPUID.setColumns(10);
		txtPUID.setBounds(129, 142, 96, 26);
		contentPane.add(txtPUID);
		
		JTextPane txtpnPuid = new JTextPane();
		txtpnPuid.setEditable(false);
		txtpnPuid.setBackground(SystemColor.control);
		txtpnPuid.setText("PUID:");
		txtpnPuid.setBounds(15, 142, 88, 26);
		contentPane.add(txtpnPuid);
		
		txtAddress = new JTextField();
		txtAddress.setEnabled(false);
		txtAddress.setColumns(10);
		txtAddress.setBounds(129, 192, 146, 26);
		contentPane.add(txtAddress);
		
		JTextPane txtpnAddress = new JTextPane();
		txtpnAddress.setEditable(false);
		txtpnAddress.setBackground(SystemColor.control);
		txtpnAddress.setText("Address:");
		txtpnAddress.setBounds(15, 192, 88, 26);
		contentPane.add(txtpnAddress);
		
		txtState = new JTextField();
		txtState.setEnabled(false);
		txtState.setColumns(10);
		txtState.setBounds(129, 234, 39, 26);
		contentPane.add(txtState);
		
		JTextPane txtpnState = new JTextPane();
		txtpnState.setEditable(false);
		txtpnState.setBackground(SystemColor.control);
		txtpnState.setText("State:");
		txtpnState.setBounds(15, 234, 88, 26);
		contentPane.add(txtpnState);
		
		JTextPane txtpnZipCode = new JTextPane();
		txtpnZipCode.setEditable(false);
		txtpnZipCode.setBackground(SystemColor.control);
		txtpnZipCode.setText("Zip code:");
		txtpnZipCode.setBounds(15, 282, 88, 26);
		contentPane.add(txtpnZipCode);
		
		JComboBox cboZipCode = new JComboBox();
		cboZipCode.setEnabled(false);
		cboZipCode.setModel(new DefaultComboBoxModel(new String[] {"47901", "53839", "00215", "80408", "12345", "00001"}));
		cboZipCode.setBounds(132, 282, 136, 26);
		contentPane.add(cboZipCode);
		
		JComboBox cboCountry = new JComboBox();
		cboCountry.setEnabled(false);
		cboCountry.setModel(new DefaultComboBoxModel(new String[] {"USA", "Canada", "India", "China", "France", "England", "Tunisia"}));
		cboCountry.setBounds(129, 324, 136, 26);
		contentPane.add(cboCountry);
		
		JTextPane txtpnCountry = new JTextPane();
		txtpnCountry.setEditable(false);
		txtpnCountry.setBackground(SystemColor.control);
		txtpnCountry.setText("Country:");
		txtpnCountry.setBounds(15, 324, 88, 26);
		contentPane.add(txtpnCountry);
		
		JComboBox cboMajor = new JComboBox();
		cboMajor.setEnabled(false);
		cboMajor.setModel(new DefaultComboBoxModel(new String[] {"Computer Technology", "Computer Engineering", "Electrical Engineering", "Physics", "Geography", "Chemistry"}));
		cboMajor.setBounds(129, 366, 278, 26);
		contentPane.add(cboMajor);
		
		JTextPane txtpnMajor = new JTextPane();
		txtpnMajor.setEditable(false);
		txtpnMajor.setBackground(SystemColor.control);
		txtpnMajor.setText("Major:");
		txtpnMajor.setBounds(15, 366, 88, 26);
		contentPane.add(txtpnMajor);
		
		JComboBox cboCollege = new JComboBox();
		cboCollege.setEnabled(false);
		cboCollege.setModel(new DefaultComboBoxModel(new String[] {"College of Engineering", "College of Science", "College of Arts and Sciences"}));
		cboCollege.setBounds(129, 412, 278, 26);
		contentPane.add(cboCollege);
		
		JTextPane txtpnCollege = new JTextPane();
		txtpnCollege.setEditable(false);
		txtpnCollege.setBackground(SystemColor.control);
		txtpnCollege.setText("College:");
		txtpnCollege.setBounds(15, 412, 88, 26);
		contentPane.add(txtpnCollege);
		
		JCheckBox chckbxThesis = new JCheckBox("Thesis");
		chckbxThesis.setEnabled(false);
		chckbxThesis.setToolTipText("Is a thesis required?");
		chckbxThesis.setBounds(190, 450, 139, 29);
		contentPane.add(chckbxThesis);
		
		JTextPane txtpnMsOrPhd = new JTextPane();
		txtpnMsOrPhd.setEditable(false);
		txtpnMsOrPhd.setBackground(SystemColor.control);
		txtpnMsOrPhd.setText("MS or PhD:");
		txtpnMsOrPhd.setBounds(15, 495, 88, 26);
		contentPane.add(txtpnMsOrPhd);
		
		JRadioButton rdbtnMs = new JRadioButton("MS");
		rdbtnMs.setEnabled(false);
		rdbtnMs.setBounds(139, 492, 71, 29);
		contentPane.add(rdbtnMs);
		
		JRadioButton rdbtnPhd = new JRadioButton("PhD");
		rdbtnPhd.setEnabled(false);
		rdbtnPhd.setBounds(217, 492, 77, 29);
		contentPane.add(rdbtnPhd);
		
		
		rdbtnMs.addActionListener(new ActionListener() {		// Master's Radio Button
			public void actionPerformed(ActionEvent e) 
			{
				if (rdbtnMs.isSelected())
					rdbtnPhd.setSelected(false);
			}
		});
		
		rdbtnPhd.addActionListener(new ActionListener() {		// PhD Radio Button
			public void actionPerformed(ActionEvent e) 
			{
				if (rdbtnPhd.isSelected())
					rdbtnMs.setSelected(false);
			}
		});
		
		mntmUndergrad.addActionListener(new ActionListener() {	// Create New Undergrad
			public void actionPerformed(ActionEvent arg0) 
			{
				undergrad = new Undergrad();
				
				studentType = "undergrad";
				
				// Enable the controls.
				txtFirstName.setEnabled(true);
				txtMiddleInitial.setEnabled(true);
				txtLastName.setEnabled(true);
				txtPUID.setEnabled(true);
				txtAddress.setEnabled(true);
				txtState.setEnabled(true);
				cboZipCode.setEnabled(true);
				cboCountry.setEnabled(true);
				cboMajor.setEnabled(true);
			}
		});
		
		mntmGraduate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				grad = new Graduate();
				
				studentType = "graduate";
				
				//Enable the relevant controls.
				txtFirstName.setEnabled(true);
				txtMiddleInitial.setEnabled(true);
				txtLastName.setEnabled(true);
				txtPUID.setEnabled(true);
				txtAddress.setEnabled(true);
				txtState.setEnabled(true);
				cboZipCode.setEnabled(true);
				cboCountry.setEnabled(true);
				cboMajor.setEnabled(true);
				chckbxThesis.setEnabled(true);
				rdbtnMs.setEnabled(true);
				rdbtnPhd.setEnabled(true);
			}
		});
		
		mntmSave.addActionListener(new ActionListener() {		// Save the data
			public void actionPerformed(ActionEvent e) 
			{
				switch(studentType)
				{
				case "undergrad":
					undergrad.setStudent(txtFirstName.getText(), 
										 txtMiddleInitial.getText().charAt(0), 
										 txtLastName.getText(), 
										 txtPUID.getText(), 
										 txtAddress.getText(), 
										 txtState.getText(), 
										 (String)cboZipCode.getSelectedItem(), 
										 (String)cboCountry.getSelectedItem());
					break;
					
				case "graduate":
					
					break;
				}
			}
		});
		
		mntmClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				// Clear the Text boxes
				txtFirstName.setText("");
				txtMiddleInitial.setText("");
				txtLastName.setText("");
				txtPUID.setText("");
				txtAddress.setText("");
				txtState.setText("");
				
				// Reset the Combo Boxes
				cboZipCode.setSelectedIndex(0);
				cboCountry.setSelectedIndex(0);
				cboMajor.setSelectedIndex(0);
				cboCollege.setSelectedIndex(0);
				
				// Reset the Check & Radio Buttons
				chckbxThesis.setSelected(false);
				rdbtnMs.setSelected(false);
				rdbtnPhd.setSelected(false);
				
				// Disable the Controls
				txtFirstName.setEnabled(false);
				txtMiddleInitial.setEnabled(false);
				txtLastName.setEnabled(false);
				txtPUID.setEnabled(false);
				txtAddress.setEnabled(false);
				txtState.setEnabled(false);
				cboZipCode.setEnabled(false);
				cboCountry.setEnabled(false);
				cboMajor.setEnabled(false);
				cboCollege.setEnabled(false);
				chckbxThesis.setEnabled(false);
				rdbtnMs.setEnabled(false);
				rdbtnPhd.setEnabled(false);
			}
		});
	}
}
