import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame {
    private JPanel login;
    private JTextField usuario;
    private JPasswordField contrasena;
    private JButton accesoButton;
    private JButton limpiarButton;

    public Login() {
        setTitle("Login");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setContentPane(login);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        accesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if (usuario.getText().isEmpty() && contrasena.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Llene todos los campos");
                }else {
                    if (usuario.getText().equals("Panchi") && contrasena.getText().equals("esfot123")) {
                        new Menu();
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                    }
                }

            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuario.setText ("");
                contrasena.setText ("");
            }
        });
    }
}

