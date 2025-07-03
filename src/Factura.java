import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factura extends JFrame{
    private JPanel factura;
    private JButton calcularButton;
    private JButton regresarButton;
    private JTextField codigo;
    private JTextField producto;
    private JTextField precio;
    private JTextField cantidad;
    private JTextField subtotal;
    private JTextField total;

    public Factura(){
        setContentPane(factura);
        setTitle("Factura");
        setSize(400, 700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);



        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer codigoIngresado = Integer.parseInt(codigo.getText());
                String productoIngresado = producto.getText();
                Double precioIngresado = Double.parseDouble(precio.getText());
                Integer cantidadIngresada = Integer.parseInt(cantidad.getText());
                Double  subtotal = precioIngresado * cantidadIngresada;
                //JOptionPane.showMessageDialog(null, "Subtotal: " + subtotal);
                //subtotal.setText("Subtotal: " + subtotal);
                total.setText(subtotal.toString());
                /*
                 Double n1 = Double.parseDouble(numero1.getText());
                Double n2 = Double.parseDouble(numero2.getText());
                Double resultado = n1 * n2;
                JOptionPane.showMessageDialog(null, resultado);
                 */
            }
        });

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                dispose();
            }
        });
    }

}
