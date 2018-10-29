package javaPractice.Annoymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnnoyInner4 extends JFrame{

	String message = "클릭";
	
	public AnnoyInner4() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("버튼");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {	// 리스너 객체 생성과 동시에 버튼에 리스너 달기 
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AnnoyInner4.this, message); 
			}
		});	
	}
	
	public static void main(String[] args) {
		AnnoyInner1 window = new AnnoyInner1();
		window.setVisible(true);
	}

}

