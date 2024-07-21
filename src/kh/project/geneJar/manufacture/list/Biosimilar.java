package kh.project.geneJar.manufacture.list;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Biosimilar extends JFrame implements Manufacture {

	
	public String information() {
		
		setTitle("바이오 시밀러");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        ImageIcon imageIcon = new ImageIcon("Biosimilar.jpg");
        JLabel imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        // JFrame을 중앙에 배치
        setLocationRelativeTo(null);
        
        SwingUtilities.invokeLater(() -> {
            setVisible(true);
        });
        
		
		return "특허가 만료된 오리지널 의약품과 품질 및 비임상, 임상 비교 동등성이 입증된 "
				+ "복제약으로 성분을 비슷하게 제작하나 분자구조를 변형하여 더 효과적으로 만든 의약품이다.";

	}

}
