import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mostrar extends JFrame{
    private JPanel mostrar;
    private JButton REGRESARButton;

    public Mostrar(){
        setContentPane(mostrar);
        setTitle("Mostrar");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        REGRESARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });


    }

}
