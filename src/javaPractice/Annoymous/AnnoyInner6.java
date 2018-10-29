package javaPractice.Annoymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnnoyInner6 extends JFrame{

	String message = "클릭";
	
	public AnnoyInner6() {
		setBounds(100,100,450,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton button = new JButton("버튼");
		button.setBounds(100,100,100,30);
		getContentPane().add(button);
		
		// 람다 익스프레션 문법을 활용 
		// 메소드 파라미터와 메소드 본문만 남기고, 나머지 부분은 생략 
		// 중괄호와 세미클론 생략 
		button.addActionListener(e -> JOptionPane.showMessageDialog(AnnoyInner6.this, message));	
	}
	
	public static void main(String[] args) {
		AnnoyInner1 window = new AnnoyInner1();
		window.setVisible(true);
	}

}