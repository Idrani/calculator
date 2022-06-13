package calculatrice;

import java.awt.EventQueue;


import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class calcul {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calcul window = new calcul();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calcul() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//create a frame 
		frame = new JFrame();
		//panel color 
		frame.getContentPane().setBackground(Color.WHITE);
		//visibility
		frame.getContentPane().setLayout(null);
		
//		create a TextField 
		textField = new JTextField();
		//setting  TextField bounds 
		textField.setBounds(10, 11, 426, 73);
		// setting font(writing style)
		textField.setFont(new Font("Tahoma", Font.BOLD, 30));
		// adding TextField to the panel
		frame.getContentPane().add(textField);
		
		textField.setColumns(10);
		// blocking TextField writing
		textField.setEditable(false);
		
		/**
		 * buttons editing
		 */
		// creating button
		JButton btnNewButton = new JButton("7");
		//button color
		btnNewButton.setForeground(Color.ORANGE);
		//adding font to button
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		//button bounds setting
		btnNewButton.setBounds(10, 107, 89, 82);
		//button ActionListener
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//get the text of textField and concat  it with button name
				String in=textField.getText()+btnNewButton.getText();
				//showing the result on the textField
				textField.setText(in);
			}
		});
		//adding button to panel
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_1.getText();
				textField.setText(in);
			}
		});
		
		btnNewButton_1.setForeground(Color.ORANGE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_1.setBounds(109, 107, 89, 82);
		frame.getContentPane().add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("9");
		btnNewButton_2.setForeground(Color.ORANGE);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.setBounds(208, 107, 89, 82);
		frame.getContentPane().add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_2.getText();
				textField.setText(in);
			}
		});
		
		
		JButton btnNewButton_3 = new JButton("BACK");
		btnNewButton_3.setForeground(Color.YELLOW);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.setBounds(318, 109, 118, 82);
		frame.getContentPane().add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText();
				in=in.substring(0,in.length()-1);
				textField.setText(in);
			}
		});
		
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.setForeground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_4.setBounds(10, 200, 89, 82);
		frame.getContentPane().add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_4.getText();
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.setForeground(Color.ORANGE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_5.setBounds(109, 200, 89, 82);
		frame.getContentPane().add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_5.getText();
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.setForeground(Color.ORANGE);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_6.setBounds(208, 200, 89, 82);
		frame.getContentPane().add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_6.getText();
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_7 = new JButton("1");
		btnNewButton_7.setForeground(Color.ORANGE);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_7.setBounds(10, 293, 89, 82);
		frame.getContentPane().add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_7.getText();
				textField.setText(in);
			}
		});
		
		
		
		JButton btnNewButton_8= new JButton("2");
		btnNewButton_8.setForeground(Color.ORANGE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_8.setBounds(109, 293, 89, 82);
		frame.getContentPane().add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_8.getText();
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_9= new JButton("3");
		btnNewButton_9.setForeground(Color.ORANGE);
		btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_9.setBounds(208, 293, 89, 82);
		frame.getContentPane().add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_9.getText();
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_10 = new JButton("clear");
		btnNewButton_10.setForeground(Color.YELLOW);
		btnNewButton_10.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_10.setBounds(318, 200, 118, 82);
		frame.getContentPane().add(btnNewButton_10);
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in="";
				textField.setText(in);
			}
		});
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.setForeground(Color.MAGENTA);
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 45));
		btnNewButton_11.setBounds(41, 506, 254, 82);
		frame.getContentPane().add(btnNewButton_11);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> tokens=new ArrayList();
				//get the textField text 
				String s=textField.getText();
				// split the text 
				//true to to make the spliter on  token
				StringTokenizer st=new StringTokenizer(s,"+ - * /",true);
				tokens.add(0,"0");
				while (st.hasMoreTokens()) {  
			       tokens.add(st.nextToken());  
			    }  
				
				int i;
				for(i=1;i<tokens.size();i++) {
					if(tokens.get(i).equals("+")) {
				
						float f=Float.parseFloat(tokens.get(i-1))+Float.parseFloat(tokens.get(i+1));
						tokens.set(i+1,String.valueOf(f));
						
						}
					if(tokens.get(i).equals("-")) {
						
						float f=Float.parseFloat(tokens.get(i-1))-Float.parseFloat(tokens.get(i+1));
						tokens.set(i+1,String.valueOf(f));
						
						}
					if(tokens.get(i).equals("*")) {
						
						float f=Float.parseFloat(tokens.get(i-1))*Float.parseFloat(tokens.get(i+1));
						tokens.set(i+1,String.valueOf(f));
						
						}
					if(tokens.get(i).equals("/")) {
						
						try {
							if(Float.parseFloat(tokens.get(i+1))==0) {
								float f=Float.parseFloat(tokens.get(i-1))/Float.parseFloat(tokens.get(i+1));
							tokens.set(i+1,String.valueOf(f));
							}
							
						}
						catch(ArithmeticException  e1) {
							textField.setText("0.0");
							
							
						}
						float f=Float.parseFloat(tokens.get(i-1))/Float.parseFloat(tokens.get(i+1));
						tokens.set(i+1,String.valueOf(f));
						
						}
					
				}
					
				
				textField.setText(tokens.get(tokens.size()-1));		
					
				}
			
		});
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.setForeground(Color.RED);
		btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_12.setBounds(318, 384, 118, 82);
		frame.getContentPane().add(btnNewButton_12);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in=textField.getText();
			// don't replay the operator
				if(in.length()>0) {
					char o=in.charAt(in.length()-1);
					if((o!='+')&&(o!='-')&&(o!='*')&&(o!='/')&&(o!='.'))
					{
			   textField.setText(in+"+");
		}
				
			}
				}
		});
		JButton btnNewButton_13 = new JButton("X");
		btnNewButton_13.setForeground(Color.RED);
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_13.setBounds(10, 386, 89, 82);
		frame.getContentPane().add(btnNewButton_13);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in=textField.getText();
			
				if(in.length()>0) {
					char o=in.charAt(in.length()-1);
					if((o!='+')&&(o!='-')&&(o!='*')&&(o!='/')&&(o!='.'))
					{
			   textField.setText(in+"*");
		}
				
			}
				}
		});
		
		JButton btnNewButton_14 = new JButton("/");
		btnNewButton_14.setForeground(Color.RED);
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_14.setBounds(109, 386, 89, 82);
		frame.getContentPane().add(btnNewButton_14);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in=textField.getText();
			
				if(in.length()>0) {
					char o=in.charAt(in.length()-1);
					if((o!='+')&&(o!='-')&&(o!='*')&&(o!='/')&&(o!='.'))
					{
			   textField.setText(in+"/");
		}
				
			}
				}
		});
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.setForeground(Color.RED);
		btnNewButton_15.setFont(new Font("Tahoma", Font.BOLD, 40));
		btnNewButton_15.setBounds(208, 386, 89, 82);
		frame.getContentPane().add(btnNewButton_15);
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in=textField.getText();
			
				if(in.length()>0) {
					char o=in.charAt(in.length()-1);
					if((o!='+')&&(o!='-')&&(o!='*')&&(o!='/')&&(o!='.'))
					{
			   textField.setText(in+"-");
		}
				
			}
				}
		});
		
		JButton btnNewButton_16 = new JButton("0");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 35));
		btnNewButton_16.setForeground(Color.ORANGE);
		btnNewButton_16.setBounds(318, 291, 118, 82);
		frame.getContentPane().add(btnNewButton_16);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String in=textField.getText()+btnNewButton_16.getText();
				textField.setText(in);
			}
		});
		
		
		
		
		
		JButton btnNewButton_17 = new JButton(".");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 46));
		btnNewButton_17.setBounds(318, 506, 118, 82);
		frame.getContentPane().add(btnNewButton_17);
		frame.setBounds(100, 100, 460, 636);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String in=textField.getText();
			
				if(in.length()>0) {
					char o=in.charAt(in.length()-1);
					if((o!='+')&&(o!='-')&&(o!='*')&&(o!='/')&&(o!='.'))
					{
			   textField.setText(in+".");
		}
				
			}
				}
		});
		
		
	}
}