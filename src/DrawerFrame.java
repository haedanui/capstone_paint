import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DrawerFrame extends JFrame {
    DrawerFrame(){
        setTitle("Drawer");
        Toolkit tk = Toolkit.getDefaultToolkit();//툴킷은 컴퓨터의 환경들을 알아오기 위한 클래스임
        Dimension d = tk.getScreenSize(); // 스크린의 사이즈를 알아오는 함수 연구실은 FHD이므로 1920, 1080이고 집 컴퓨터는 QHD이므로 2560, 1440일것임
        int screenheight = d.height;//스크린 사이즈의 세로 길이를 알아옴
        int screenwidth = d.width;//스크린 사이즈의 가로 길이를 알아옴
        setSize(screenwidth*2/3, screenheight*2/3);//사이즈 설정
        setLocation(screenwidth/6, screenheight/6);// 사이즈 설정

        JMenuBar menus = new JMenuBar();
        setJMenuBar(menus);

        JMenu fileMenu = new JMenu("파일(F)");
        menus.add(fileMenu);

        JMenuItem newFile = new JMenuItem("새 파일(N)");
        fileMenu.add(newFile);
        newFile.addActionListener(
                e -> System.out.println("새 파일(N)")
        );

        JMenuItem openFile = new JMenuItem("열기(O)");
        fileMenu.add(openFile);

        JMenuItem saveFile = new JMenuItem("저장(N)");
        fileMenu.add(saveFile);

        JMenuItem anotherFile = new JMenuItem("다른 이름으로 저장(N)");
        fileMenu.add(anotherFile);

        JMenuItem exit = new JMenuItem("종료(N)");
        fileMenu.add(exit);
        exit.addActionListener(
                e -> System.exit(0)//람다 익스프레션으로 만든것
                /*
                어나니머스 오브젝트로 만든거
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                }
                */
        );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
