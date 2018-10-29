package javaPractice.Annoymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnnoyInner3 extends JFrame{

	String message = "클릭";
	
	public AnnoyInner3() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("버튼");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
		
		ActionListener listener = new ActionListener() {	// 익명 클래스로 리스너 객체 생성 
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(AnnoyInner3.this, message); 
			}
		};
		button.addActionListener(listener);	// 버튼에 리스너 담기 		
	}
	
	public static void main(String[] args) {
		AnnoyInner1 window = new AnnoyInner1();
		window.setVisible(true);
	}

}

