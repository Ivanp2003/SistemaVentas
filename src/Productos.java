import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Productos extends JFrame {
    private JPanel productos;
    private JButton guardarButton;
    private JButton limpiarButton;
    private JTextField codigo;
    private JTextField nombre;
    private JTextField detalle;
    private JTextField precio;
    private JTextField stock;
    private JButton volverButton;

    public Productos() {
        setContentPane(productos);
        setTitle("Productos");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(codigo.getText().isEmpty() || nombre.getText().isEmpty() || detalle.getText().isEmpty() || precio.getText().isEmpty() || stock.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Llene todos los campos");
                    return;
                }else {
                    Integer codigoIngresado = Integer.parseInt(codigo.getText());
                    String nombreIngresado = nombre.getText();
                    String detalleIngresado = detalle.getText();
                    Double precioIngresado = Double.parseDouble(precio.getText());
                    Integer stockIngresado = Integer.parseInt(stock.getText());
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");

                    new Productos();
                    dispose();
                }
            }

        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigo.setText ("");
                nombre.setText ("");
                detalle.setText ("");
                precio.setText ("");
                stock.setText ("");
            }
        });


    }
}
