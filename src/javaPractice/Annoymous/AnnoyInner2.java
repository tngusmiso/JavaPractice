package javaPractice.Annoymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnnoyInner2 extends JFrame{

	String message = "클릭";
	
	public AnnoyInner2() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("버튼");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
		
		ActionListener listener = new MyActionListener();	// 리스너 객체 생성 
		button.addActionListener(listener);	// 버튼에 리스너 담기 		
	}
	
	public static void main(String[] args) {
		AnnoyInner1 window = new AnnoyInner1();
		window.setVisible(true);
	}
	class MyActionListener implements ActionListener{	// 리스너 인터페이스를 구현
		
//		AnnoyInner1 window;
//		public MyActionListener(AnnoyInner1 window) {
//			this.window = window;
//		}

		@Override
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(AnnoyInner2.this, message);	// 버튼이 클릭되면 메시지 박스 띄우기 
		}
	}

}

